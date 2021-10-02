package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		printName("Rodrigo Luís de Faria");
	}
	
	public static void printName(String name) {
		System.out.println(name);
		
		if (name.length() == 2) {
			String name2 = name.substring(0, 1);
			printName(name2);

		} else if (name.length() > 2) {
			int endIndex = name.length() - 1;
			String name2 = name.substring(0, endIndex);
			printName(name2);
		}
	}
	
}
