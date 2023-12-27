public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		boolean isP = true;
		for(int d = 1; d < num; d++) {
			if (num%d == 0) {
				sum = sum + d;
			}
		}
		if (num == sum) {
			System.out.print (num + " is a perfect number since " + num + " = 1");
			for(int d = 2; d < num; d++) {
				if (num%d == 0) {
					System.out.print (" + " + d);
				}
			}
		}
		else {
			System.out.println (num + " is not a perfect number");
		}
	}
}
