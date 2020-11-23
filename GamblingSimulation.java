import java.util.*;
public class GamblingSimulation{
	public static void main(String[] args){
		int totalStake=100;
		int bet=1;
		int finalStakeForMonth=playFor20Days(bet,totalStake);
		System.out.println("Final Stake for Month is - "+finalStakeForMonth);
	}
	public static int betResult(){
		Random random = new Random();
		int result=random.nextInt(2);
		return result;
	}
	public static int resigning(int bet,int totalStake){
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
				break;
			}
			else if(totalStake==50){
				break;
			}
		}
		return totalStake;
	}
	public static int playFor20Days(int bet,int totalStake){
		int days=1;int win=0;int loss=0;int finalStakeForMonth=100;
		while(days<=20){
			finalStakeForMonth=resigning(bet,totalStake);
			if(finalStakeForMonth==150){
				win++;
				finalStakeForMonth=finalStakeForMonth+50;
			}else{
				loss++;
				finalStakeForMonth=finalStakeForMonth-50;
			}
			days++;
		}
		System.out.println("win - "+win+" "+"Loss - "+loss);
		return finalStakeForMonth;
	}
}
