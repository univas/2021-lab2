package br.edu.univas.main;

public class StartApp {
	
	public static void main(String[] args) {
		//executeSum();
		//executeSub();
		
		print("Rodrigo", 34, 1500f, false);
		
		String pessoa = "João";
		int xpto = 10;
		float abc = 123.3f;
		boolean qualquerCoisa = true;
		
		print(pessoa, xpto, abc, qualquerCoisa);
	}
	
	public static void executeSum() {
		int numberOne = 10;
		int numberTwo = 20;
		int sum = numberOne + numberTwo;
		
		System.out.println("A soma dos números é: " + sum);
		executeSub();
	}
	
	public static void executeSub() {
		int a = 100;
		int b = 34;
		int result = a - b;
		System.out.println("A subtração dos números é: " + result);
		
		stop(10);
		int x = 35;
		stop(x);
		
		sum(20, 10);
	}
	
	public static void stop(int pressao) {
		System.out.println(pressao);
	}
	
	public static void sum(int a, int b) {
		int sum = a + b;
		System.out.println("A soma deu: " + sum);
	}
	
	public static void print(String nome, int idade, 
			float salario, boolean estaChovendo) {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Está Chovendo: " + estaChovendo);
	}
}
