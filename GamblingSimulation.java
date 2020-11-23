import java.util.*;
public class GamblingSimulation{
	public static void main(String[] args){
		int totalStake=100;
		int bet=1;
		betResult();
	}
	public static void betResult(){
		Random random = new Random();
		int result=random.nextInt(2);
		switch(result){
			case 1:
				System.out.println("win");
				break;
			case 2:
				System.out.println("loose");
				break;
			default:
				break;
		}
	}
}
