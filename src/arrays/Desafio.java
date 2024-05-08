package arrays;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Meu código implementado
		int n;
		double somaNotas = 0.0;
		
		System.out.print("Informe quantas notas serão inseridas: ");
		n = entrada.nextInt();
		
		double[] notas = new  double[n];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i + 1) + "º nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		for(double nota: notas) {
			somaNotas +=nota;
		}
		
		double mediaNotas;
		
		mediaNotas = somaNotas/n;
		
		System.out.printf("A média das " + n + " notas é %.2f ",mediaNotas );
		
		System.out.println();
		
		/*------------------------------------------------------------------*/
		
		// Código implementado no curso
		System.out.print("Quantas notas: ");
	
		int qtdeNotas = entrada.nextInt();
		
		double[] Notas = new double[qtdeNotas];
		
		for (int i = 0; i < Notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			Notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for(double nota: Notas) {
			total += nota;
		}
		
		double media = total / Notas.length;
		System.out.println("A média é " + media + "!");
		entrada.close();
		
	}
	
}
