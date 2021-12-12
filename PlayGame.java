import java.util.*;

class PlayGame{
	public static void play(Player frontPlayer,int n){
			int val=Dice.rollDice(n)+frontPlayer.getcurrentLocation();
			int currLoc=frontPlayer.getcurrentLocation();
			if(Board.getsnakeAndLadders().containsKey(val)){
				SnakeOrLadder curr=Board.getsnakeAndLadders().get(val);
				if(curr.snakeOrLadder().equals("Snake")){
					val=curr.getEndpoint();
					if(val>Board.destination){
						System.out.println("No movement - Overflow occured...");
					}
					else if(val==Board.destination){
						frontPlayer.setWon(true);
						System.out.println(frontPlayer.getName()+" won the game");
					}
					else{
						System.out.println(frontPlayer.getName()+" Bitten by snake and moved from "+currLoc+" to "+val);
						frontPlayer.setcurrentLocation(val);
					}
				}
				else{
					val=curr.getEndpoint();
					if(val>Board.destination){
						System.out.println(frontPlayer.getName()+"No movement - Overflow occured...");
					}
					else if(val==Board.destination){
						frontPlayer.setWon(true);
						System.out.println(frontPlayer.getName()+" won the game");
					}
					else{
						System.out.println(frontPlayer.getName()+" climbed from "+currLoc+" to "+val);
						frontPlayer.setcurrentLocation(val);
					}
				}
			}
			else{
				if(val>Board.destination){
					System.out.println("No movement - Overflow occured...");
				}
				else if(val==Board.destination){
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