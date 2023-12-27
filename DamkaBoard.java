public class DamkaBoard {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		for (int r = 0; r < size; r++) {
			if (r%2 == 0) {
				for (int i = 0; i < size; i++) {
					System.out.print ("* ");
				}
			} else {
				for (int j = 0; j < size; j++) {
					System.out.print (" *");
				}
			}
			System.out.println();
		}
	}
}
