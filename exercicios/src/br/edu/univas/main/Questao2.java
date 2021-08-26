package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o ano do seu nascimento:");
		int age = scanner.nextInt();
		
		int idadeAtual = calcAge(age);
		System.out.println("Você tem " + idadeAtual + " anos de idade.");
		
		scanner.close();
	}
	
	public static int calcAge(int anoNascimento) {
		return 2021 - anoNascimento;
	}
	
}
