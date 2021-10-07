package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor digite uma palavra:");
		String word = scanner.nextLine();
		
		if (isPalindrome(word)) {
			System.out.println("A palavra digitada é um palindrome!");
		} else {
			System.out.println("A palavra digitada não é um palindrome!");
		}
		
		scanner.close();
	}
	
	public static boolean isPalindrome(String word) {
		if (word.length() == 1) {
			return true;
		}
		
		if (word.charAt(0) == word.charAt(word.length() - 1)) {
			return isPalindrome(word.substring(1, word.length() - 1));
		}
		return false;
	}
}
