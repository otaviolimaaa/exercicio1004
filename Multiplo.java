package estruturacondicional;
import java.util.Scanner;
public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe um valor:");
		a = ler.nextDouble ();

		String msg = a % 5 == 0 ? "O numero" + a +  "é multiplo de 5" : "Não é muliplo de 5";
		System.out.println(msg); // 
	}
}