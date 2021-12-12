import java.util.*;

class PlayGame{
	public static void play(Player frontPlayer){
		int val=Dice.rollDice()+frontPlayer.getcurrentLocation();
			int currLoc=frontPlayer.getcurrentLocation();
			if(Board.getsnakeAndLadders().containsKey(val)){
				SnakeOrLadder curr=Board.getsnakeAndLadders().get(val);
				if(curr.snakeOrLadder().equals("Snake")){
					val=curr.getEndpoint();
					if(val>100){
						System.out.println("No movement - Overflow occured...");
					}
					else if(val==100){
						frontPlayer.setWon(true);
						System.out.println(frontPlayer.getName()+" won the game");
					}
					else{
						System.out.println(frontPlayer.getName()+" Bitten by snake and moved from"+currLoc+" to "+val);
						frontPlayer.setcurrentLocation(val);
					}
				}
				else{
					val=curr.getEndpoint();
					if(val>100){
						System.out.println(frontPlayer.getName()+"No movement - Overflow occured...");
					}
					else if(val==100){
						frontPlayer.setWon(true);
						System.out.println(frontPlayer.getName()+" won the game");
					}
					else{
						System.out.println(frontPlayer.getName()+" climbed from"+currLoc+" to "+val);
						frontPlayer.setcurrentLocation(val);
					}
				}
			}
			else{
				if(val>100){
					System.out.println("No movement - Overflow occured...");
				}
				else if(val==100){
						frontPlayer.setWon(true);
						System.out.println(frontPlayer.getName()+" won the game");
					}
				else{
					System.out.println(frontPlayer.getName()+" moved from "+currLoc+" to "+val);
					frontPlayer.setcurrentLocation(val);
				}
			}
		}
	}