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
		while(totalStake>50){
			int result=betResult();
			switch(result){
                        	case 1:
					totalStake=totalStake-1;
                                	break;
                        	case 2:
					totalStake=totalStake+2;
                                	break;
                        	default:
                                	break;
                	}

		}
		System.out.println(totalStake);
	}
}
