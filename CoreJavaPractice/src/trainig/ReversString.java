package trainig;

public class ReversString {

	public static void main(String[] args) {
		
		String name = "tarun";
		String rev ="";
		System.out.println(name.length());
		int len = name.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
