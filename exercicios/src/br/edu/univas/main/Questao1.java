package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite uma palavra:");
		String word = scanner.nextLine();
		
		String aux = invert(word);
		System.out.println("A palavra invertida é: " + aux);
		
		scanner.close();
	}
	
	public static String invert(String word) {
		String invertedWord = "";
		
		int length = word.length();
		for (int i = length - 1; i >= 0; i--) {
			invertedWord += word.charAt(i);
		}
		
		return invertedWord;
	}
}
