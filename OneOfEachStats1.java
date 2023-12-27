public class OneOfEachStats1 {
	public static void main (String[] args) {
		int numOfFamilies = Integer.parseInt(args[0]);		
		int c2 = 0;
		int c3 = 0;
		int cMore = 0;
		double avg = 0;
		double avgC = 0;
		for (int i = 0; i < numOfFamilies; i++) {
			int cCount = 0;
			boolean girl = false;
			boolean boy = false;
			boolean both = false;
			while (!both) {
				if (Math.random() > 0.5) {
					boy = true;
				} else {
					girl = true;
				}
				cCount++;
				if (boy && girl) {
					both = true;
				}
			}
			avgC = avgC + cCount;
			if (cCount == 2) {
				c2++;
			} else if (cCount == 3) {
				c3++;
			} else {
				cMore++;
			}
		}
		avg = (double)(avgC/numOfFamilies);
		System.out.println ("Average: " + avg + " children to get at least one of each gender.");
		System.out.println ("Number of families with 2 children: " + c2);
		System.out.println ("Number of families with 3 children: " + c3);
		System.out.println ("Number of families with 4 or more children: " + cMore);
		if (c2 > cMore || c3 > cMore) {
			if (c2 > c3) {
				System.out.println ("The most common number of children is 2.");
			} else {
				System.out.println ("The most common number of children is 3.");
			}
		} else {
			System.out.println ("The most common number of children is 4 or more.");
		}
	}
}
