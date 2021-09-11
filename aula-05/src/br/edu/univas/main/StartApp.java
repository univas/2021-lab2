package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		int age = 20;
		
		increment(age);
		
		System.out.println("Valor do age: " + age);
		
		String name = "Rodrigo";

		changeValue(name);
		
		System.out.println("Novo nome: " + name);
		
		int[] notas = {16, 3, 10};
		
		changeNotas(notas);
		
		System.out.println("Notas: ");
		System.out.println(notas[0]);
		System.out.println(notas[1]);
		System.out.println(notas[2]);
		
		int[] idades = {80, 81, 82};
		changeIdade(idades);
		
		System.out.println("Idades: ");
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
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
	public static void changeIdade(int[] idades) {
		idades = new int[]{1, 2, 3};
	}
	
}
