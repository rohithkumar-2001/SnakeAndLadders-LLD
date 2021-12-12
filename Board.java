import java.util.*;

class Board{
	public static int destination;

	private static HashMap<Integer,SnakeOrLadder> snakeAndLadders=new HashMap<>();
	
	public static HashMap<Integer,SnakeOrLadder> getsnakeAndLadders(){
		return snakeAndLadders;
	}
}