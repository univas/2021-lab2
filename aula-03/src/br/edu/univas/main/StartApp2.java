package br.edu.univas.main;

import java.util.Scanner;

public class StartApp2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o dia da semana:");
		int dayOfWeek = scanner.nextInt();
		
		String day = getDayOfWeek(dayOfWeek);
		System.out.println("Dia escolhido: " + day);
		
		scanner.close();
	}
	
	public static String getDayOfWeek(int dayOfWeek) {
		if (dayOfWeek == 1) {
			return "Domingo";
		} else if (dayOfWeek == 2) {
			return "Segunda-feira";
		} else if (dayOfWeek == 3) {
			return "Terça-feira";
		} else if (dayOfWeek == 4) {
			return "Quarta-feira";
		} else if (dayOfWeek == 5) {
			return "Quinta-feira";
		} else if (dayOfWeek == 6) {
			return "Sexta-feira";
		} else if (dayOfWeek == 7) {
			return "Sabado";
		} else {
			return "Dia inválido!";
		}
	}
	
	public static String getDayOfWeekVersion2(int dayOfWeek) {
		String day = "Dia inválido!";
		
		if (dayOfWeek == 1) {
			day = "Domingo";
		} else if (dayOfWeek == 2) {
			day = "Segunda-feira";
		} else if (dayOfWeek == 3) {
			day = "Terça-feira";
		} else if (dayOfWeek == 4) {
			day = "Quarta-feira";
		} else if (dayOfWeek == 5) {
			day = "Quinta-feira";
		} else if (dayOfWeek == 6) {
			day = "Sexta-feira";
		} else if (dayOfWeek == 7) {
			day = "Sabado";
		}
		
		return day;
	}
	
}
