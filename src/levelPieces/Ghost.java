package levelPieces;

import java.util.ArrayList;
import java.util.Random;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Ghost extends GamePiece implements Moveable{
	
	public Ghost(char symbol, String label, int location) {
		super('G', "Ghost", location);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "G - Ghost flys around and hits people.";
	}
	
	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		ArrayList<Integer> AvailSpots = new ArrayList<Integer>();
		
		// Michael helped me on this logic in office hours 
		for(int i = 0; i < gameBoard.length; i++ ) {
			//if its null then add to list bc its a space with no char
			if(gameBoard[i] == null&& i != playerLocation) {
				AvailSpots.add(i);
			}
		}
		Random randobj = new Random();
		
		//randomly picking an open location 
		int index = randobj.nextInt(AvailSpots.size());
		//intitializing ghost original location
		gameBoard[getLocation()] = null;
		//setting new location to our new spot 
		setLocation(AvailSpots.get(index));
		//THIS references where ghost is being put on the game board
		gameBoard[AvailSpots.get(index)]= this;
		
		
		
	}

	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation() == playerLocation) {
			gameBoard[playerLocation] = null;
			return InteractionResult.HIT;
		} else {
			return InteractionResult.NONE;
		}
	}

}
