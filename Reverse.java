public class Reverse {
	public static void main (String[] args){
		String word = args[0];
		int middle = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print (word.charAt(i));
		}
		if (word.length()%2 != 0) {
			middle = word.length() / 2;
		} else {
			middle = (word.length() / 2) - 1;
		}
		System.out.print ("\nThe middle character is " + word.charAt(middle));
	}
}
