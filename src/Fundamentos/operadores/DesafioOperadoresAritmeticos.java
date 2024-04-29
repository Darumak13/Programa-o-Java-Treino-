package Fundamentos.operadores;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
//		Variaveis que armazena o primeiro resultado
		int a = 6 * (3 + 2) ;
		int b = (int) Math.pow(a, 2);		
		int c = b / (3 * 2);
		
		System.out.println(c + "\n");
		
//		Variaveis que armazena o segundo resultado
		int d = 1 - 5;
		int e = 2 - 7;
		int f = d * e;
		int g = f / 2;
		int h =	(int) Math.pow(g, 2);
		
		System.out.println(h + "\n");
		
//		Variavel que armazena o resultado do primero - o segundo
		int i = c - h;

		System.out.println(i + "\n");
		
		int k = (int) Math.pow(i, 3);
		int l = (int) Math.pow(10, 3);
		
		int m = k/l;
		
		System.out.println(m);
	}

}
