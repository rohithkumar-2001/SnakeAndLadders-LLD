import java.util.*;

class SnakeOrLadder{

	private int startingPoint;
	private int endingPoint;
	private String snakeOrLadder;
	
	SnakeOrLadder(int startingPoint,int endingPoint,String snakeOrLadder){
		this.startingPoint=startingPoint;
		this.endingPoint=endingPoint;
		this.snakeOrLadder=snakeOrLadder;
	}

	public String snakeOrLadder(){
		return this.snakeOrLadder;
	}

	public int getEndpoint(){
		return this.endingPoint;
	}

}
