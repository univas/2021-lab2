package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] notaAlunos = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Por favor, digite a nota:");
			notaAlunos[i] = scanner.nextInt();
		}

		int[] notaAlunosComSituacao = calculaSituacaoAlunos(notaAlunos);
		
		int alunosPassaram = quantidadeAlunosPassaram(notaAlunosComSituacao);
		
		System.out.println("Quantidade de alunos que passaram: " + alunosPassaram);
		
		scanner.close();
	}
	
	public static int[] calculaSituacaoAlunos(int[] notas) {
		int[] notaAlunosComSituacao = new int[20];
		
		for (int i = 0, j = 0; i < 10; i++, j += 2) {
			notaAlunosComSituacao[j] = notas[i];
			int situacao = 0;
			if (notas[i] >= 60) {
				situacao = 1;
			}
			
			notaAlunosComSituacao[j + 1] = situacao;
		}
		
		return notaAlunosComSituacao;
	}
	
	public static int quantidadeAlunosPassaram(int[] notaAlunosComSituacao) {
		int quantidade = 0;
		
		for (int i = 1; i < 20; i += 2) {
			if (notaAlunosComSituacao[i] == 1) {
				quantidade++;
			}
		}
		
		return quantidade;
	}
}
