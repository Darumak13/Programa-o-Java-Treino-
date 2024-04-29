package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String Salario1 = "", Salario2 ="", Salario3="";
		
		System.out.print(Locale.getDefault());
		
		System.out.print("Digite o 1º salario: ");
		Salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o 2º salario: ");
		Salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite o 3º salario: ");
		Salario3 = entrada.next().replace(",", ".");
		
		double Sal1 = Double.parseDouble(Salario1);
		double Sal2 = Double.parseDouble(Salario2);
		double Sal3 = Double.parseDouble(Salario3);
		
		double media = (Sal1 + Sal2 + Sal3)/3;
		
		System.out.println("A média salaria dos 3 meses é " + media);
	
		entrada.close();
	}
}
