
public class ReverseOrder {
	public static void main(String args[]) {
		displaySeriesReverse(10, 1);

	}

	public static void displaySeriesReverse(int start, int end) {
		for (int s = start; s >= end; s--) {
			System.out.println(s);
		}
	}			
}
