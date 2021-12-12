import java.util.*;


class SnakeAndLadders{


	public static void NoteStartingAndEndingPoint(int st,int en,String snakeOrLadder){
		SnakeOrLadder soL=new SnakeOrLadder(st,en,snakeOrLadder);
		Board.getsnakeAndLadders().put(st,soL);
	}


	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

		//SnakesInfo....
		System.out.println("Enter number of snakes");
		int noOfSnakes=s.nextInt();
		System.out.println("Enter Snakes in this format...");
		System.out.println("startingPoint endingPoint");
		for(int i=0;i<noOfSnakes;i++){
			NoteStartingAndEndingPoint(s.nextInt(),s.nextInt(),"Snake");
		}

		//LaddersInfo.....
		System.out.println("Enter number of Ladders");
		int noOfLadders=s.nextInt();
		System.out.println("Enter Ladders in this format...");
		System.out.println("startingPoint endingPoint");
		for(int i=0;i<noOfLadders;i++){
			NoteStartingAndEndingPoint(s.nextInt(),s.nextInt(),"Ladder");
		}


		//Board info....
		System.out.println("Enter Destination of the game");
		Board.destination=s.nextInt();

		//Dice info....
		System.out.println("Enter number of dice");
		int noOfDice=s.nextInt();

		//Players info...
		Queue<Player> que=new LinkedList<>();								//PlayersList
		System.out.println("Enter number of players");
		int numberOfPlayers=s.nextInt();
		s.nextLine();
		for(int i=0;i<numberOfPlayers;i++){
			System.out.print("Enter player-"+(i+1)+" "+"name :");
			String name=s.nextLine();
			Player p=new Player(name);
			que.add(p);
		}

		//Game
		while(!que.peek().isWon()){
			Player frontPlayer=que.poll();
			PlayGame.play(frontPlayer,noOfDice);
			if(frontPlayer.isWon()){
				break;
			}
			que.add(frontPlayer);
		}

	}


}
