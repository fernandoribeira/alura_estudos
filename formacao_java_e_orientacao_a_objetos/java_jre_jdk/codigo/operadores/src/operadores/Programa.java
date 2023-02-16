package operadores;

public class Programa {
	public static void main(String[] args) {
		
		// Operadores aritmeticos
		
		int valor1 = 10;
		int valor2 = 2;
		
		int soma = valor1 + valor2;
		int subtracao = valor1 - valor2;
		int multiplicação = valor1 * valor2;
		int divisao = valor1 / valor2;
		int resto = valor1 % valor2;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicação);
		System.out.println(divisao);
		System.out.println(resto);
		System.out.println();
		
		// Operadores de atribuição acumulativa
		
		valor1 += 2;
		System.out.println(valor1);
		valor1 -= 2;
		System.out.println(valor1);
		valor1 *= 2;
		System.out.println(valor1);
		valor1 /= 2;
		System.out.println(valor1);
		valor1 %= 2;
		System.out.println(valor1);
		System.out.println();
		
		// Operadores incremento e decremento
		
		System.out.println(valor2++);
		System.out.println(++valor2);
		System.out.println(valor2--);
		System.out.println(--valor2);
		System.out.println();
				
		// Operadores comparativos
		
		boolean valor;
		valor = valor1 > valor2;
		System.out.println(valor);
		valor = valor1 >= valor2;
		System.out.println(valor);
		valor = valor1 < valor2;
		System.out.println(valor);
		valor = valor1 <= valor2;
		System.out.println(valor);
		valor = valor1 == valor2;
		System.out.println(valor);
		valor = valor1 != valor2;
		System.out.println(valor);
		System.out.println();
		
		// Operadores lógicos
		
		if (1 > 0 && 10 > 9) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		if (1 < 0 && 10 > 9) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		if (1 < 0 && 10 < 9) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		
		if (1 > 0 || 10 > 9) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		if (1 < 0 || 10 > 9) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
		
		if (1 < 0 || 10 < 9) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
				
		System.out.println(!true);
		System.out.println(!false);
 
		
	}
}
