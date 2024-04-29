package Fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comproSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comproSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou o Sorvete\"? " + comproSorvete);
		System.out.println("Mais saudável\"? " + maisSaudavel);
		
//		System.out.println("Os dois trabalhos derão certo ? " + (trabalho1 && (!trabalho2)));
//		System.out.println("Comprou a televisão de 50 ? " + (trabalho1 && (!trabalho2)));
//		
//		System.out.println("\n");
//		System.out.println("Um dos trabalho deu certo ? " + (trabalho1 || trabalho2));
//		System.out.println("Comprou a televisão de 32 ? " + (trabalho1 || trabalho2));
//		
//		System.out.println("\n");
//		System.out.println("");
	}
}
