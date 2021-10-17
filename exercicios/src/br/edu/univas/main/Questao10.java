package br.edu.univas.main;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite um número:");
		int position = scanner.nextInt();
		
		System.out.println(fibonacci(position));
		
		scanner.close();
	}
	
	public static int fibonacci(int x) {
		if (x <= 2) {
			return 1;
		}
		
		return fibonacci(x - 1) + fibonacci(x - 2); 
	}

}
