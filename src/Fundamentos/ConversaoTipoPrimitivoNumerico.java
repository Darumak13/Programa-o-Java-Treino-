package Fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // Implícita
		System.out.println(a);
		
		float b = (float) 1.1234588888; // Explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // Explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // Explícita (CAST)
		System.out.println(f);
	}
}
