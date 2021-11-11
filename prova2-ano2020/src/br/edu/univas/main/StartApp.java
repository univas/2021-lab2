package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.Conta;

public class StartApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conta[] contas = new Conta[100];
		int option = 0;
		int currentIndex = 0; 
		
		do {
			printMenu();
			option = readIntegerValue(scanner);
			
			if (option == 1) {
				createConta(scanner, contas, currentIndex);
				currentIndex++;

			} else if (option == 2) {
				printSaldo(contas, currentIndex);
				
			} else if (option != 3) {
				System.out.println("Por favor, digite uma opção correta!");
			}
			
		} while (option != 3);
		
		scanner.close();
	}
	
	public static void createConta(Scanner scanner, Conta[] contas, int currentIndex) {
		System.out.println("Cadastro de Conta");
		
		Conta conta = new Conta();
		
		System.out.println("Por favor digite a descrição:");
		conta.description = scanner.nextLine();
		
		System.out.println("Por favor digite o valor:");
		conta.value = readFloatValue(scanner);
		
		System.out.println("Por favor digite a data de vencimento:");
		conta.dueDate = scanner.nextLine();
		
		System.out.println("Por favor digite o tipo de conta:");
		conta.type = scanner.nextLine();
		
		contas[currentIndex] = conta;
	}
	
	public static void printSaldo(Conta[] contas, int currentIndex) {
		float saldo = 0.0f;
		
		for (int i = 0; i < currentIndex; i++) {
			Conta conta = contas[i];
			
			if (conta.type.equals("Receita")) {
				saldo += conta.value;
			} else {
				saldo -= conta.value;
			}
		}
		
		System.out.println("O saldo atual é: " + saldo);
	}
	
	public static void printMenu() {
		System.out.println("\n\nCONTROLE DE CONTAS");
		System.out.println("1. Cadastro de Conta");
		System.out.println("2. Ver Saldo");
		System.out.println("3. Sair");
	}
	
	public static int readIntegerValue(Scanner scanner) {
		int temp = scanner.nextInt();
		scanner.nextLine();
		return temp;
	}
	
	public static float readFloatValue(Scanner scanner) {
		float temp = scanner.nextFloat();
		scanner.nextLine();
		return temp;
	}
}
