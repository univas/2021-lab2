package br.edu.univas.main;

import java.util.Scanner;

public class Questao6 {
	
	static String[] mesesDoAno = {"Janeiro", "Fevereiro", "Março",
			"Abril", "Maio", "Junho", "Julho",
			"Agosto", "Setembro", "Outubro",
			"Novembro", "Dezembro"};

	public static void main(String[] args) {
		float[] mediaTemperatura = createArrayMediaTemperatura();
		
		float mediaGeral = calculaMediaGeral(mediaTemperatura);
		
		verificaTemperatura(mediaTemperatura, mediaGeral);
		
		System.out.println("A média geral de temperatura foi de: " + mediaGeral);
		imprimeSituacao(mediaTemperatura);
	}
	
	public static float[] createArrayMediaTemperatura() {
		Scanner scanner = new Scanner(System.in);
		float[] mediaTemperatura = new float[12];
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite a média de temperatura do mês " + mesesDoAno[i]);
			mediaTemperatura[i] = scanner.nextFloat();
		}
		
		scanner.close();
		return mediaTemperatura;
	}
	
	public static float calculaMediaGeral(float[] temperaturas) {
		float somaTotal = 0.0f;
		for (int i = 0; i < 12; i++) {
			somaTotal += temperaturas[i];
		}
		
		return somaTotal / 12.0f;
	}
	
	public static void verificaTemperatura(float[] mediasTemperaturas, float mediaGeralTemperatura) {
		for (int i = 0; i < 12; i++) {
			if (mediasTemperaturas[i] > mediaGeralTemperatura) {
				mediasTemperaturas[i] = 1;

			} else if (mediasTemperaturas[i] < mediaGeralTemperatura) {
				mediasTemperaturas[i] = -1;
			
			} else {
				mediasTemperaturas[i] = 0;
			}
		}
	}
	
	public static void imprimeSituacao(float[] mediasTemperaturas) {
		for (int i = 0; i < 12; i++) {
			String situacao = "igual";
			if (mediasTemperaturas[i] == 1) {
				situacao = "acima";
			} else if (mediasTemperaturas[i] == -1) {
				situacao = "abaixo";
			}
			
			System.out.println(mesesDoAno[i] + " está " + situacao + " da media geral");
		}
	}
}
