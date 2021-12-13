import java.util.*; 



class Dice{

	public static int singleDiceResult(){
		int res=0;
		for(int i=1;i<=3;i++){
			res=res+(int)(Math.random() * 6)+1;	
			if(res!=6*i){
				return res;
			}
		}	
		return 0;
	}

	public static int multipleDiceResult(int n){

		return (int)(((Math.random() * n*6)+n)%6)+1;
		
	}

	public static int rollDice(int n){
		if(n==1){
			return singleDiceResult();
		}
		return multipleDiceResult(n);
	}
}


