package break_continue;

public class Programa {
	public static void main(String[] args) {

		// break

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// continue

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
