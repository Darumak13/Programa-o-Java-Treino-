package Fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipo numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56788;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipo numéricos reias
		float salario = 11_445.44F;
		double vendaAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numéro de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendaAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias " + estaDeFerias);
		System.out.println("Status: " +status);
	}
}
