package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int age = 20;
		
		increment(age);
		
		System.out.println("Valor do age: " + age);
		
		String name = "Rodrigo";

		changeValue(name);
		
		System.out.println("Novo nome: " + name);
		
	}
	
	public static void increment(int value) {
		value++;
	}
	
	public static void changeValue(String name) {
		name = "NovoNomeParaVocê";
	}
	
	public static void changeNotas(int[] variaveis) {
		variaveis[2] = 9;
		variaveis[1] = 84;
		variaveis[0] = 33;
	}
	
}
