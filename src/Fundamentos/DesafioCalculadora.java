package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Ler num1
		// Ler num2
		// + - * / %
		
		double num1, num2;
		String Operacao;
		
		
		System.out.print("Digite o 1º número: ");
		num1 = entrada.nextDouble();
		
		System.out.print("Digite o 2º núemro: ");
		num2 = entrada.nextDouble();
		
		System.out.println("Informe a operação: ");
		Operacao = entrada.next();
		
		// Lógica
		double resultado = "+".equals(Operacao) ? num1 + num2 : 0;
		resultado = "-".equals(Operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(Operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(Operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(Operacao) ? num1 % num2 : resultado;
		
		
//		double Op = Double.parseDouble(Operacao);
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, Operacao, num2, resultado);
		
		entrada.close();
	}
}
