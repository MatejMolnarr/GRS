package main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Máš na výber 3 možnosti:");
		System.out.println("Vyber si 1,2,3:");
		System.out.println("1. Dobre ráno:");
		System.out.println("2. Dobrý deň:");
		System.out.println("3. Dobrý večer:");
		
		int vyber = scanner.nextInt();
		Pozdrav pozdravuj = new Pozdrav();
		switch (vyber) {
		case 1:
			pozdravuj.goodMorning();
			break;
		case 2:
			pozdravuj.goodDay();
			break;
		case 3:
			pozdravuj.goodEvening();
			break;
			default:
				System.out.println("Zlá voľba, Vyber si od 1 do 3.");
		}
		scanner.close();
		
		
	}

}
