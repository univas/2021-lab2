package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int option = 0;
		do {
			printMenu();
			option = scanner.nextInt();

			if (!isValidOption(option)) {
				System.out.println("Por favor, digite uma opção correta!");
				continue;
			} else if (option == 9) {
				System.out.println("Bye bye");
				break;
			}

			System.out.println("Digite o valor do primeiro número:");
			int a = scanner.nextInt();
			System.out.println("Digite o valor do segundo número:");
			int b = scanner.nextInt();
			int result = 0;

			if (option == 1) {
				result = sum(a, b);
			} else if (option == 2) {
				result = sub(a, b);
			} else if (option == 3) {
				result = mult(a, b);
			} else if (option == 4) {
				result = div(a, b);
			}

			System.out.println("O resultado do cálculo é: " + result);

		} while (option != 9);
		scanner.close();
	}

	public static void printMenu() {
		System.out.println("***CALCULADORA***");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("9 - Sair");
		System.out.print("Digite sua opção: ");
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}

	public static boolean isValidOption(int option) {
		return (option >= 1 && option <= 4) || option == 9;
	}
}
