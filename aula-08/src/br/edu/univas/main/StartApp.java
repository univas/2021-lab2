package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Time;

public class StartApp {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Time time1 = new Time();
		System.out.println("Por favor, digite o nome do time:");
		time1.nome = scanner.nextLine();
		
		System.out.println("Por favor, digite a pontuação do time:");
		time1.pontuacao = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Time cadastrado:");
		System.out.println("Nome: " + time1.nome);
		System.out.println("Pontuacao: " + time1.pontuacao);
		
		Time time2 = new Time();
		System.out.println("Time cadastrado 2:");
		System.out.println("Nome: " + time2.nome);
		System.out.println("Pontuacao: " + time2.pontuacao);
		
		Time time3 = null;
		System.out.println("Time cadastrado 3:");
		System.out.println(time3);
		
		int[] idades = new int[5];
		String[] nomes = new String[5];
		Time[] times = new Time[4];
		
		int[][] idades2 = new int[3][5];
		String[][] nomes2 = new String[4][9];
		Time[][] times2 = new Time[4][18];
		
		for (int i = 0; i < 4; i++) {
			Time t = new Time();
			System.out.println("Por favor, digite o nome do time:");
			t.nome = scanner.nextLine();
			
			System.out.println("Por favor, digite a pontuação do time:");
			t.pontuacao = scanner.nextInt();
			scanner.nextLine();
			
			times[i] = t;
		}
		
		System.out.println("\n\nTimes cadastrados\n\n");
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Nome: " + times[i].nome);
			System.out.println("Pontuação: " + times[i].pontuacao);
		}
		
		scanner.close();
	}
}
