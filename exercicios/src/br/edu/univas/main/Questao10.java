package br.edu.univas.main;

import java.util.Scanner;

public class Questao10 {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Por favor, digite um número:");
//		int position = scanner.nextInt();
//		
//		System.out.println(fibonacci(position));
//		
//		scanner.close();
//	}
//	
//	public static int fibonacci(int x) {
//		if (x <= 2) {
//			return 1;
//		}
//		
//		return fibonacci(x - 1) + fibonacci(x - 2); 
//	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 1, b = 1, i = 0;
		System.out.println("Por Favor, Digite um Número: ");
		int input = scan.nextInt();
		System.out.println("O Resultado é: " + calc_Fib(a, b, i, input));
		scan.close();
	}

	public static int calc_Fib(int a, int b, int i, int input) {
		int c = a + b;
		i++;
		if (i == input) {
			return a;
		} else {
			return calc_Fib(b, c, i, input);
		}
	}
}
