import java.util.*;

class Player{

	private String name;
	private boolean isWon;
	private int currentLocation;

	public Player(String name){
		this.name=name;
		this.isWon=false;
		this.currentLocation=0;
	}

	public boolean isWon(){
		return this.isWon;
	}

	public String getName(){
		return this.name;
	}
	
	public void setWon(boolean isWon){
		this.isWon=isWon;
	}

	public int getcurrentLocation(){
		return this.currentLocation;
	}

	public void setcurrentLocation(int loc){
		this.currentLocation=loc;
	}

}
