package kruh;

import java.util.Scanner;

public class Main {
	
	
	

	public static void main(String[] args) {
	Funkcie f= new Funkcie();
	
	Scanner sc= new Scanner(System.in);
	int r= sc.nextInt();
	
	System.out.println("Obsah kruhu:" + f.vypocetObsahuKruhu(r));
	System.out.println("Obvod kruhu:" + f.vypocetObvoduKruhu(r));

}
}
