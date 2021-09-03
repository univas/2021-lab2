package br.edu.univas.main;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite alguma coisa:");
		String word = scanner.nextLine();
		
		word = removeSpaces(word);
		
		System.out.println("A palavra sem espa�o ficou: " + word);
		
		scanner.close();
	}
	
	public static String removeSpaces(String word) {
		String wordWithoutSpace = word;
		
		//remover espa�o vazio do inicio
		while (wordWithoutSpace.startsWith(" ")) {
			wordWithoutSpace = wordWithoutSpace.substring(1);
		}
		
		//remover espa�o vazio do final
		while (wordWithoutSpace.endsWith(" ")) {
			int lenght = wordWithoutSpace.length();
			wordWithoutSpace = wordWithoutSpace.substring(0, lenght - 1);
		}
		
		return wordWithoutSpace;
	}
}
