public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int middle = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print (word.charAt(i));
			if (i == word.length() / 2) {
				middle = i - 1;
			}
		}
		System.out.print ("\nThe middle character is " + word.charAt(middle));
	}
}
