package estruturas_selecao;

public class Programa {
	public static void main(String[] args) {
		
		int idade = 18;
		
		// if
		
		if (idade > 18) {
			System.out.println("idade é maior que 18");
		}
		
		
		// if else
		
		if (idade > 18) {
			System.out.println("idade é maior que 18");
		} else {
			System.out.println("idade não é maior que 18");
		}
		
		// if...else else...if
		
		if (idade < 18) {
			System.out.println("idade é menor que 18");
		} else if (idade < 60) {
			System.out.println("idade esta entre 18 e 60");
		} else {
			System.out.println("idade é maior que 60");
		}
		
		// switch
		
		int diaDaSemana = 2;
		switch (diaDaSemana) {
			case 1:
				System.out.println("segunda");
				break;
			case 2:
				System.out.println("terça");
				break;
			default:
				System.out.println("dia incorreto");
		}
		
		// operador ternário
		
		boolean podeDirigir = (idade > 18) ? true : false;
		
	}
}
