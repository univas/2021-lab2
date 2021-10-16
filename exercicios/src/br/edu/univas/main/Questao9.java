package br.edu.univas.main;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor digite a base:");
		int base = scanner.nextInt();
		
		System.out.println("Por favor digite o expoente:");
		int expoente = scanner.nextInt();
		
		System.out.println(calcPotencia(base, expoente));
		
		scanner.close();
	}
	
	public static long calcPotencia(int x, int y) {
		if (y == 1) {
			return x;
		}
		
		return x * calcPotencia(x, y - 1);
	}
}
