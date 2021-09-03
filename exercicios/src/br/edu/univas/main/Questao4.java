package br.edu.univas.main;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o primeiro n�mero: ");
		int a = scanner.nextInt();
		
		System.out.println("Por favor, digite o segundo n�mero:");
		int b = scanner.nextInt();
		
		if (a == b) {
			System.out.println("Os n�meros digitados s�o iguais!");
		} else {
			int major = calcMajorNumber(a, b);
			System.out.println("O maior n�mero digitado foi: " + major);
		}
		
		scanner.close();
	}
	
	public static int calcMajorNumber(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		return secondNumber;
	}
	
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Por favor, digite o primeiro n�mero: ");
//		int a = scanner.nextInt();
//		
//		System.out.println("Por favor, digite o segundo n�mero:");
//		int b = scanner.nextInt();
//		
//		calcMajorNumber(a, b);
//		
//		scanner.close();
//	}
//	
//	public static void calcMajorNumber(int firstNumber, int secondNumber) {
//		if (firstNumber > secondNumber) {
//			System.out.println("O maior n�mero digitado foi: " + firstNumber);
//		} else if (secondNumber > firstNumber) {
//			System.out.println("O maior n�mero digitado foi: " + secondNumber);
//		} else {
//			System.out.println("Os n�meros digitados s�o iguais!");
//		}
//	}
}
