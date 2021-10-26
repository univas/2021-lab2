package br.edu.univas.main;

import java.util.Scanner;

public class Questao11 {
	
	public static String[] information = {
			"Nome do time:",
			"Saldo de gols:",
			"Número de jogos:",
			"Pontuação:"
	};

	public static void main(String[] args) {
		String[][] classificacao = readData();
		
		print(classificacao);
	}
	
	public static String[][] readData() {
		Scanner scanner = new Scanner(System.in);
		String[][] classificacao = new String[20][4];
		
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(information[j]);
				classificacao[i][j] = scanner.nextLine();
			}
		}
		
		scanner.close();
		return classificacao;
	}

	public static void print(String[][] data) {
		System.out.println("Classificação do Campeonato Brasileiro:");
				
		for (int i = 0; i < 20; i++) {
			System.out.println("Posição: " + (i + 1));
			
			for (int j = 0; j < 4; j++) {
				System.out.print(information[j]);
				System.out.println(data[i][j]);
			}
		}
	}
}
