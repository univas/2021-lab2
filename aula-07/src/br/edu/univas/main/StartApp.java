package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] notas = new int[10][2];
		for (int i = 0; i < 10; i++) {
			System.out.println("Por favor digite a nota do aluno " + (i + 1));
			for (int j = 0; j < 2; j++) {
				System.out.println("Por favor digite a nota da prova " + (j + 1));
				notas[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Notas dos alunos:");
		for (int i = 0; i < 10; i++) {
			System.out.println("\nAluno " + (i + 1));
			for (int j = 0; j < 2; j++) {
				System.out.println("Prova " + (j + 1));
				System.out.println(notas[i][j]);
			}
		}
		
		int[] a = new int[10];
		int[] a1 = {1, 2, 4, 88, 23, 5435, 23, 23, 11, 90};
		
		int[][] notasT = {
				{1, 6, 9},
				{2, 7, 10},
				{3, 8, 11}
		};
		
		int[][] notasT2 = new int[3][3];
		notasT2[2][1] = 20;
		
		int[] notasRodrigo = {4, 8, 18}; 
		notasT2[1] = notasRodrigo;
		
		scanner.close();
	}
}
