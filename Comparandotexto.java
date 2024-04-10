package estruturacondicional;

import java.util.Scanner;

public class Comparandotexto {

	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
		String palavra1, palavra2 ;
    System.out.println("Informe a primeira paavra:");
    palavra1 = ler.nextLine();
    
    System.out.println("Informe a segunda palvra:");{
    palavra2 = ler.nextLine();}
    if (palavra1.equals(palavra2)) {
    	System.out.println("As palavras são iguais");
	} 
		else {
			System.out.println("as palavra são diferentes");
		}
    ler.close();
	} }
