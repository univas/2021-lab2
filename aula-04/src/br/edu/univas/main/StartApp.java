package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nomeCandidato = readName(scanner);
		
		String telefoneCandidato = readCellphone(scanner);

		printWelcome(nomeCandidato, telefoneCandidato);
		
		scanner.close();
	}
	
	public static String readName(Scanner scanner) {
		System.out.println("Por favor, digite seu nome:");
		return scanner.nextLine();
	}
	
	public static String readCellphone(Scanner scanner) {
		System.out.println("Por favor, digite seu telefone:");
		return scanner.nextLine();
	}
	
	public static void printWelcome(String nome, String telefone) {		
		System.out.println("Seja bem vindo: " + nome);
		System.out.println("Estamos enviando um SMS para o número: " + telefone);
	}
}
