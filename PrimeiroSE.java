package estruturacondicional;

import java.util.Scanner;

public class PrimeiroSE {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;

		System.out.println("Digete um valor:");
		numero = ler.nextInt ();
		if(numero >=10) {
			System.out.println("O numero é maior que 10");
		}
	
		else {
			System.out.println("O numero é menor que 10");
		}
		ler.close ();
		
		
		


	}

}
