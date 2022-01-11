
public class Sum {

	public static void main(String args[]) {
		
			sum(0,10);
	}
	public static void sum(int start, int end) {
		int result= 0;
		
		for(int s = 0 ; s <=end ; s++) {
			result = result + s;
		}
		
		System.out.println(result);
	}
}
