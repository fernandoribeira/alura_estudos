package estruturas_repeticao;

public class Programa {
	public static void main(String[] args) {
		
		// while
		
		int contador = 1;
		while (contador <= 10) {
			System.out.print(contador + " ");
			contador++;
		}
		System.out.println();
			
		// for

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// do while
		
		contador = 1;
		do {
			System.out.print(contador + " ");
			contador++;
		} while (contador <= 10);
		
	}
}
