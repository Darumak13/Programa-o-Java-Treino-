package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Domingo -> 1
		// Quarta -> 4
		// terça -> 3

		String semana;

		System.out.println("Informe um dia da semana: ");
		semana = entrada.next();

		if (semana.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		} else if (semana.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		} else if (semana.equalsIgnoreCase("Terça")
				|| semana.equalsIgnoreCase("Terca")) {
			System.out.println("3");
		} else if (semana.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		} else if (semana.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		} else if (semana.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		} else if (semana.equalsIgnoreCase("Sábado")
				|| semana.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Dia da semana Invalida!");
		}

		entrada.close();
	}
}
