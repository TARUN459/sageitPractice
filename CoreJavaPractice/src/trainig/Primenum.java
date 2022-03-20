package trainig;

public class Primenum {

	public static void main(String[] args) {
		// divisible by 1 or by itself

		int num =7;
		int temp = 0;
		for(int i=2;i<num;i++) {
			if(i%num==0) {
				temp+=1;
			}
		}
		if(temp>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
