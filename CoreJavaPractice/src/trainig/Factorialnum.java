package trainig;

public class Factorialnum {

	public static void main(String[] args) {
		// 5! =1*2*3*4*5
		
		int num = 5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);

	}

}
