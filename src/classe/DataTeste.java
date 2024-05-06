package classe;

public class DataTeste {

	public static void main(String[] args) {

//		Código que eu implementei
		Data D1 = new Data(13, 9, 2002);

		Data D2 = new Data();

		System.out.println("A data informada é: " + D1.obterDataFormatada());
		System.out.println("A data informada é: " + D2.obterDataFormatada());
		
		System.out.println();
		
//		Código implementado no curso
		Data d1 = new Data();
		
		var d2 = new Data(31, 12, 2020);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
	}
}
