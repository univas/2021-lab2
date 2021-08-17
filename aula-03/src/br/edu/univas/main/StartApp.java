package br.edu.univas.main;

public class StartApp {

	public static void main(String[] args) {
		sum(10, 5);
		sum(100, 73);
		sum(294, -44);
		
		int result = sub(10, 7);
		System.out.println("Resultado da subtração: " + result);
		
		int a = 19;
		int b = 22;
		float c = sub(a, b);
		System.out.println("Resultado da subtração: " + c);
		
		//versão 1
		boolean canDoPix = containsBalance();
		if (canDoPix == true) {
			System.out.println("Podemos fazer o PIX!");
		} else {
			System.out.println("Sem saldo para prosseguir com o PIX!");
		}
		
		//versão 2
		boolean canDoPix2 = containsBalance();
		if (canDoPix2) {
			System.out.println("Podemos fazer o PIX!");
		} else {
			System.out.println("Sem saldo para prosseguir com o PIX!");
		}
		
		//versão 3
		if (containsBalance()) {
			System.out.println("Podemos fazer o PIX!");
		} else {
			System.out.println("Sem saldo para prosseguir com o PIX!");
		}
	}
	
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static boolean containsBalance() {
		//consultamos o saldo
		return true;
	}
}
