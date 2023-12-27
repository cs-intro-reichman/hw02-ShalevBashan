/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int current = (int)(Math.random() * 10);
		boolean wasLower = true;
		int next = (int)(Math.random() * 10);
		System.out.print (current + " ");
		while (wasLower) {
			next = (int)(Math.random() * 10);
			if (next < current) {
				wasLower = false;
			} else {
				System.out.print (next + " ");
			}
			current = next;
			next = (int)(Math.random() * 10);
		} 
	}
}
