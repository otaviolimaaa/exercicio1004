package estruturacondicional;

import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dom ,seg , ter , qua , qui , sex , sab ,dia,numero;
		System.out.println("Digete o numero do valor da semana");
		numero = ler.nextInt();

		if (numero == 1) {
			System.out.println("O dia é domingo");
		}
		else if (numero == 2) {
			System.out.println("O dia é segunda");
	}
	   else if (numero == 3) {
		System.out.println("O dia é terça");
}		
      else if (numero == 4) {
	  System.out.println("O dia é quarta");
      }
      else if (numero == 5) {
    System.out.println("O dia é quinta");
      }
    else if (numero == 6) {
    	System.out.println("O dia é sexta");
    }
    else if (numero == 7){
    	System.out.println("O dia é sabado");
    	
    }
    else {
    	System.out.println("O dia não existe");
    }
    	
      }

}
