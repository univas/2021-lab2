package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] convidados = new String[50];
		
		for (int i = 0; i < 50;) {
			System.out.println("Por favor, digite o nome:");
			String nome = scanner.nextLine();
			
			if (convidadoEstaNaLista(convidados, nome, i)) {
				System.out.println("Convidado já está na lista");
				
			} else {
				convidados[i] = nome;
				i++;
			}
		}
		
		scanner.close();
	}
	
	public static boolean convidadoEstaNaLista(String[] lista, 
			String nome, int posicao) {
		
		for (int i = 0; i < posicao; i++) {
			if (nome.equals(lista[i])) {
				return true;
			}
		}
		
		return false;
	}
}
