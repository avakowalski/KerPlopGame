//I, Ava Kowalski, certify that I participated equitably in the creation of assignment C07A, dated 09-20-23.
//I, Eva Christianson, certify that I participated equitably in the creation of this assignment C07A, dated 09-20-23.

//Mason Shandy helped us structure our for loop that is located within the getmoveable pieces function., Kathleen Kelly helped us re sturcture our if statements, 
//Michael helped us re structure how we added my items to the list and how we moved the pieces in our moveable function within supeerman and ghost 

package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;


public class LevelSetup {
	
	ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
	Drawable[] board;
	

	public void createLevel(int levelNum) {
		// TODO Auto-generated method stub
		
		//clearing the pieces from the ArrayList 
		pieces.clear();
		board = new Drawable [GameEngine.BOARD_SIZE];
				
		if (levelNum == 1) {
			Superman superman  = new Superman('S', "Superman", 3);
			Ghost ghost  = new Ghost('G', "Ghost", 8);
			Snake snake  = new Snake('H',"Snake", 5);
			
			pieces.add(superman);
			pieces.add(ghost);
			pieces.add(snake);
			
			
		}else {
			CompOrgMonster CompOrgMonster  = new CompOrgMonster('S', "Superman", 3);
			Spider spider  = new Spider();
			Snake snake  = new Snake('H',"Snake", 8);
			
			pieces.add(CompOrgMonster);
			pieces.add(snake);
			board[3] = spider;
			
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
		ArrayList<Moveable> moveablelist = new ArrayList<Moveable>();
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
		
		ArrayList<GamePiece> InteractingPieceslist = new ArrayList<GamePiece>();
		//for loop that is iterating through the ArrayList named 
		//pieces which is called above in the code
		for(GamePiece i: pieces) {
			//this checks if the piece is an instance of game piece 
			if (i instanceof GamePiece) {
				//if it is, its adding it to the list created above in this function
				InteractingPieceslist.add((GamePiece)i);
			}
		}
		//returning the entire list, which consists of moving pieces
		return InteractingPieceslist;
	}

	public int getPlayerStartLoc() {
		// TODO Auto-generated method stub
		return 0;
	}

}










