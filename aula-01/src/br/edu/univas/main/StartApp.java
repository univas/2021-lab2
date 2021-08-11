package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		
		short a1 = 10;
		byte a2 = 11;
		int a3 = 12;
		long a4 = 13;
		float a5 = 14.0f;
		double a6 = 15.0;
		boolean a7 = true;
		char a8 = 'R';
		String a9 = "Univas";
		
		a4 = 8;
		if (a4 > 10) {
			System.out.println("a4 é sim maior que 10!");
		} 
		
		if (a2 == 10) {
			System.out.println("A variavel a2 é igual a 10!");
		} else {
			System.out.println("A variavel a2 é diferente de 10!");
		}
		
		if (a1 == 5) {
			System.out.println("A variavel a1 é igual a 5!");
		} else if (a1 == 6) {
			System.out.println("A variavel a1 é igual a 6!");
		} else if (a1 == 7) {
			System.out.println("A variavel a1 é igual a 7!");
		} else {
			System.out.println("A variavel a1 é igual a 8!");
		}
		
		switch(a1) {
			case 5: 
				System.out.println("A variavel a1 é igual a 5!");
				break;
			case 6: 
				System.out.println("A variavel a1 é igual a 6!");
				break;
			case 7: 
				System.out.println("A variavel a1 é igual a 7!");
				break;
			default: 
				System.out.println("A variavel a1 é igual a 8!");
		}
		
		if (a1 == 5 && a2 == 6 && a3 == 7) {
			System.out.println("Lógica E");
		}
		
		if (a1 == 5 || a2 == 6 || a3 == 7) {
			System.out.println("Lógica OU");
		}
		
		if (a1 == 5 && (a2 == 6 || a2 == 7) && (a3 == 7 || a3 == 8)) {
			System.out.println("Lógicas misturadas!");
		}
		
		System.out.println("FOR");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("WHILE");
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("DO/WHILE");
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	
		int[] notas = new int[10];
		notas[0] = 5; // primeira posição
		notas[9] = 1; // ultima posição
		
		int soma = notas[0] + notas[9];
		System.out.println("A soma deu: " + soma);
		
		//tipo_variavel nome_variavel = valor_para_a_variavel;
		int idade = 30;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Por favor, digite seu nome:");
		String nome = leitura.nextLine();
		System.out.println("Seja bem vindo(a): " + nome);
		
		System.out.println("Por favor, digite o ano atual:");
		int anoAtual = leitura.nextInt();
		System.out.println("Estamos no ano de: " + anoAtual);
		
		leitura.close();
	}
	
}
