package menopriezvisko;

import java.util.Scanner;

public class Help {
	

String meno;
String priezvisko;
int rokNarodenia;
char inicial;

public char zistiInicial(String text) {
	return text.charAt(0);
}

public int zistiVek(int dátum) {
	return 2024- dátum;
}

public void ziskajMeno() {
	System.out.println("Zadaj meno");
	meno = sc.nextLine();
	
	
}


public void ziskajPriezvisko() {
System.out.println("Zadaj priezvisko");
priezvisko =sc.nextLine();
}	
public void ziskajRokNarodenia() {
	System.out.println("Zadaj rok narodenia");
	
}

}
