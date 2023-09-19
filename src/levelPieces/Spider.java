package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Spider {
	//spider doesnt do anything 
	//spider just sits there 
	//as we can see via the output 
	public void draw() {
		System.out.print("*");
	}
	public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		return InteractionResult.NONE;
	}
}
