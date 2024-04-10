package estruturacondicional;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double valor1,valor2,valor3,valor4,som,div ;

		System.out.println("Informe o primeiro valor:");
		valor1 = ler.nextDouble ();
		System.out.println("Informe o segundo valor:");
		valor2 = ler.nextDouble ();
		System.out.println("Informe o terceiro valor:");
		valor3= ler.nextDouble ();
		System.out.println("Informe o quarto valor:");
		valor4= ler.nextDouble ();

		som = valor1 + valor2 +valor3 + valor4;
		div = som/4;
		if (div >=6) {
			System.out.println("Voce foi aprovado,média:" + div);
		}
		else {
			System.out.println("Voce foi reprovado,média:" + div);

		}





	}

}
