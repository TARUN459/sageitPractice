package trainig;

public class Reversenum {

	public static void main(String[] args) {
		int temp=1345;
		int rev=0;
		int rem=0;
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
	}

}
