package br.edu.univas.main;

import java.util.Scanner;

public class StartApp2 {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String nomeCandidato = readName();
		
		String telefoneCandidato = readCellphone();

		printWelcome(nomeCandidato, telefoneCandidato);
		
		scanner.close();
	}
	
	public static String readName() {
		System.out.println("Por favor, digite seu nome:");
		return scanner.nextLine();
	}
	
	public static String readCellphone() {
		System.out.println("Por favor, digite seu telefone:");
		return scanner.nextLine();
	}
	
	public static void printWelcome(String nome, String telefone) {		
		System.out.println("Seja bem vindo: " + nome);
		System.out.println("Estamos enviando um SMS para o número: " + telefone);
	}
}
