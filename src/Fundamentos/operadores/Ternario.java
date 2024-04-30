package Fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		double media = 5.6;		
		String resultadoFinal = media >= 7.0 ? 
				"aprovado." : "em recuperação.";
		
		System.out.println("O aluno está "+ resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesnconto = bomComportamento && passouPorMedia;
		String resultado = temDesnconto ? "Sim." : "Não";
		
		System.out.printf("Tem desconto? %s" ,resultado);
	}
}
