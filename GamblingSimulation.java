import java.util.*;
public class GamblingSimulation{
	public static void main(String[] args){
		int totalStake=100;
		int bet=1;
		resigning(bet,totalStake);
	}
	public static int betResult(){
		Random random = new Random();
		int result=random.nextInt(2);
		return result;
	}
	public static void resigning(int bet,int totalStake){
		while(true){
			int result=betResult();
			switch(result){
                        	case 0:
					totalStake=totalStake-bet;
                                	break;
                        	case 1:
					totalStake=totalStake+bet;
                                	break;
                        	default:
                                	break;
                	}
			if(totalStake==150){
				System.out.println("Win");
				break;
			}
			else if(totalStake==50){
				System.out.println("loss");
				break;
			}
		}
		System.out.println(totalStake);
	}
}
