package estruturacondicional;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int mes;

		System.out.println("Informe o mes: ");

		mes = ler.nextInt();

		switch (mes) {

		case 1:

			System.out.println("O mes é Janeiro");

			break;

		case 2:

			System.out.println("O mes é Fevereiro");

			break;

		case 3:

			System.out.println("O mes Março");

			break;

		case 4:

			System.out.println("O mes é Abril");

			break;

		case 5:

			System.out.println("O mes é maio");

			break;

		case 6:

			System.out.println("O mes Junho");

			break;

		case 7:

			System.out.println("O mes é Julho");

			break;
	case 8:

		System.out.println("O mes é Agosto");

		break;
	case 9:

	System.out.println("O mes é Setembro");

	break;
	case 10:

		System.out.println("O mes é Outubro");

		break;
	case 11:

		System.out.println("O mes é Novembro");

		break;
	case 12:

		System.out.println("O mes é Dezembro");

		break;

}}}
