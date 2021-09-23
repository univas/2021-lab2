package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		int[] notas = readNotes();
		
		int min = findMinValue(notas);
		int max = findMaxValue(notas);
	
		System.out.println("A menor nota foi: " + min);
		System.out.println("A maior nota foi: " + max);
	}
	
	public static int[] readNotes() {
		Scanner scanner = new Scanner(System.in);
		int[] notas = new int[25];
		
		for (int i = 0; i < 25; i++) {
			System.out.println("Por favor, digite a nota:");
			notas[i] = scanner.nextInt();
		}
		
		scanner.close();
		return notas;
	}
	
	public static int findMinValue(int[] notas) {
		int min = notas[0];
		
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] < min) {
				min = notas[i];
			}
		}
		
		return min;
	}
	
	public static int findMaxValue(int[] notas) {
		int max = notas[0];
		
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > max) {
				max = notas[i];
			}
		}
		
		return max;
	}
	
}
