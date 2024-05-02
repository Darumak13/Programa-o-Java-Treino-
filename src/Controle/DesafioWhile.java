package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Meu código

//		double nota = 0, total = 0;
//		
//		while (nota != -1 ) {
//			System.out.println("Digite uma nota valida for entre 0 à 10");
//			nota = entrada.nextDouble();
//			if(nota <= 10 nota >= 0) {
//				total += nota;
//			} else {
//				System.out.println("Nota invalida!");
//			}
//			System.out.println("Pressione -1 para sair || Digite uma nota valida");
//		}

		// Código do curso feito

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota inválida!!! ;D");
			}
		}

		// Média dos dois códigos

		// Calcular a média

		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();

	}
}
