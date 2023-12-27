public class OneOfEach {
	public static void main (String[] args) {
		int cCount = 0;
		boolean girl = false;
		boolean boy = false;
		boolean both = false;
		while (!both) {
			if (Math.random() > 0.5) {
				boy = true;
				System.out.print ("b ");
			} else {
				girl = true;
				System.out.print ("g ");
			}
			cCount++;
			if (boy && girl) {
				both = true;
			}
		}
		System.out.println ("\nYou made it... and you now have " + cCount + " children.");
	}
}