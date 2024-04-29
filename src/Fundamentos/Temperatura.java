package Fundamentos;

import java.util.*;

public class Temperatura {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double C, F, ajuste = 32, fator = 5.0 / 9.0;

		System.out.print("Informe o valor do F: ");
		F = entrada.nextDouble();

		C = (F - ajuste) * fator;

		System.out.printf("C = %.2f", C);

		entrada.close();

	}
}
