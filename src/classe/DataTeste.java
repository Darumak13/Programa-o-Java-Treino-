package classe;

public class DataTeste {

	public static void main(String[] args) {

//		Código que eu implementei
		Data D1 = new Data();
		D1.Dia = 13;
		D1.Mes = 9;
		D1.Ano = 2002;

		Data D2 = new Data();
		D2.Dia = 25;
		D2.Mes = 12;
		D2.Ano = 1932;

		System.out.println("1º data informada é: " + D1.Dia + "/" + D1.Mes + "/" + D1.Ano);
		System.out.println("2º data informada é: " + D2.Dia + "/" + D2.Mes + "/" + D2.Ano);
		
		System.out.println();
		
//		Código implementado no curso
		Data d1 = new Data();
		d1.Dia = 7;
		d1.Mes = 11;
		d1.Ano = 2021;
		
		var d2 = new Data();
		d2.Dia = 31;
		d2.Mes = 12;
		d2.Ano = 2020;
		
		System.out.printf("%d/%d/%d\n", d1.Dia, d1.Mes, d1.Ano);
		System.out.printf("%d/%d/%d\n", d2.Dia, d2.Mes, d2.Ano);
	}
}
