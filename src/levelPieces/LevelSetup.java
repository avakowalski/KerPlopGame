//Mason Shandy helped me structure my for loop that is 
//located within the getmoveable pieces function.

package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;


public class LevelSetup {
	
	ArrayList<GamePiece> pieces;
	Drawable[] board;
	

	public void createLevel(int levelNum) {
		// TODO Auto-generated method stub
		
		//clearing the pieces from the ArrayList 
		pieces.clear();
		board = new Drawable [GameEngine.BOARD_SIZE];
				
		switch(levelNum) {
		//help with this in class
			case 1:
				pieces.add(new Ghost())
				pieces.add(new Superman())
			case 2: 
				pieces.add(new Ghost())
				pieces.add(new Superman())
		}
		
		for (GamePiece i: pieces) {
			board[i.getLocation()]= i;
		}
	}

	public Drawable[] getBoard() {
		// TODO Auto-generated method stub
		return board;
	}

	public ArrayList<Moveable> getMovingPieces() {
		//Mason Shandy, who was in this class last year 
		//helped me structure this for loop because I was 
		//confused on this concept.
		
		//this is creating a list to add objects to 
		ArrayList<Moveable> moveablelist = new ArrayList<Moveable>;
		//for loop that is iterating through the ArrayList named 
		//pieces which is called above in the code
		for(GamePiece i: pieces) {
			//this checks if the piece is an instance of the class moveable
			if (i instanceof Moveable) {
				//if it is, its adding it to the list created above in this function
				moveablelist.add((Moveable)i);
			}
		}
		//returning the entire list, which consists of moving pieces
		return moveablelist;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		
		// TODO Auto-generated method stub
		return pieces;
	}

	public int getPlayerStartLoc() {
		// TODO Auto-generated method stub
		return 0;
	}

}










