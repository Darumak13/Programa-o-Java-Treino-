package classe;

public class Data {

	int Dia;
	int Mes;
	int Ano;
	
	Data(int DiaInicial, int MesInicial, int AnoInicial){
		Dia =  DiaInicial;
		Mes = MesInicial;
		Ano = AnoInicial;
	}
	
	Data(){
		Dia = 1;
		Mes = 1;
		Ano = 1970;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", Dia, Mes, Ano);
	}
}
