/*7- Introducir tantas frases como queramos y contarlas.
 * */

import java.util.*;
public class PsH3Ej07 {

	public static void main(String[] args) {
		Scanner  teclado  = new Scanner (System.in);
		String frase = new String ();
		int num;
		num = 0;
		System.out.println("Escriba por teclado la frase que quiera: ");
		while(num >= 0){
			frase  = teclado.nextLine();
			num++;//dado que empezamos a contar desde 1, inicio con 0.
			//System.out.println();
			System.out.println( frase + " es la frase número " + num);
		}

	}//main

}//class

