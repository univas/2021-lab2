package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Aluno;

public class Questao12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno[] alunos = new Aluno[100];
		int currentPosition = 0;

		int option = 0;
		
		do {
			printMenu();
			option = readIntValue(scanner);
			
			if (option == 1) {
				createNewAluno(scanner, alunos, currentPosition);
				currentPosition++;

			} else if (option == 2) {
				printAlunos(alunos, currentPosition);

			} else if (option != 3) {
				System.out.println("Por favor digite uma opção correta!");
			} else {
				System.out.println("Até mais!");
			}
			
		} while (option != 3);
		
		scanner.close();
	}

	public static void createNewAluno(Scanner scanner, Aluno[] alunos, int currentPosition) {
		System.out.println("Cadastro de novo aluno");
		
		Aluno aluno = new Aluno();
		System.out.println("Por favor digite o nome: ");
		aluno.nome = scanner.nextLine();
		
		System.out.println("Por favor digite o CPF:");
		aluno.cpf = readIntValue(scanner);
		
		System.out.println("Por favor digite a data de nascimento:");
		aluno.dataNascimento = readIntValue(scanner);
		
		System.out.println("Por favor digite o endereço:");
		aluno.endereco = scanner.nextLine();

		alunos[currentPosition] = aluno;
	}
	
	public static void printAlunos(Aluno[] alunos, int currentPosition) {
		System.out.println("Alunos cadastrados:::");
		
		for (int i = 0; i < currentPosition; i++) {
			System.out.println("Aluno " + (i + 1) + ":");
			
			Aluno aluno = alunos[i];
			System.out.println("Nome: " + aluno.nome);
			System.out.println("CPF: " + aluno.cpf);
			System.out.println("Data de Nascimento: " + aluno.dataNascimento);
			System.out.println("Endereço: " + aluno.endereco);
		}
	}
	
	public static void printMenu() {
		System.out.println("1. Cadastrar Aluno");
		System.out.println("2. Listar alunos cadastrados");
		System.out.println("3. Sair");
	}
	
	public static int readIntValue(Scanner scanner) {
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
}