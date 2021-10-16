package br.edu.univas.main;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite um número:");
		int number = scanner.nextInt();
		
		System.out.println(calcFactorial(number));
				
		scanner.close();
	}
	
	public static long calcFactorial(int number) {
		if (number <= 1) {
			return 1;
		}
		
		return number * calcFactorial(number - 1);
	}
}
