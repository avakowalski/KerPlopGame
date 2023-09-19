package levelPieces;
import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class Superman extends GamePiece {

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
		// want the piece to randomly move around ?????
		
		
	}


	@Override
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

