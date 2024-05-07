package classe;

public class Data {

	int Dia;
	int Mes;
	int Ano;

	Data(){
		//Dia = 1;
		//Mes = 1;
		//Ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int Dia, int Mes, int Ano){
		this.Dia =  Dia;
		this.Mes = Mes;
		this.Ano = Ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; 
		return String.format(formato, this.Dia, Mes, Ano);
	}
}
