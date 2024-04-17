package menopriezvisko;

public class Main {

	public static void main(String[] args) {
		Help hlp= new Help();
		String meno;
		String priezvisko;
		int rokNarodenia;
		char inicial;
		
		meno=hlp.ziskajMeno();
		priezvisko=hlp.ziskajPriezvisko();
		rokNarodenia=hlp.ziskajRokNarodenia();
		inicial1= hlp.zistiInicial(meno);
		inicial2= hlp.zistiInicial(priezvisko);
		
		System.out.println("inicialy:"+ hlp.zistiInicial(meno));
		System.out.println("Vek:"+ hlp.zistiVek(rokNarodenia));
		

	}

}
