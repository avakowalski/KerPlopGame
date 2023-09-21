package levelPieces;

import java.util.ArrayList;
import java.util.Random;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Superman extends GamePiece implements Moveable{

	public Superman(char symbol, String label, int location) {
		super('S', "Superman", location);
	// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "S - Superman flys around and gives players a point.";
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
		//intitilaizing supermans original location
		gameBoard[getLocation()] = null;
		//setting new location to our new spot 
		setLocation(index);
		//THIS references where superman is being put on the game board
		gameBoard[index]= this;
		
		
		
	}


	@Override
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		if(this.getLocation() == playerLocation) {
			gameBoard[playerLocation] = null;
			return InteractionResult.GET_POINT;
		} else {
			return InteractionResult.NONE;
		}
	}
}

