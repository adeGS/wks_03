/*22.-Introducir una frase por teclado. Imprimirla cinco veces en filas consecutivas, pero cada
impresión ir desplazada cuatro columnas hacia la derecha.**/
import java.util.*;
public class PsH3Ej22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int i = 5;
		String frase;
		System.out.println("Introduzca la frase que quiere que salga por pantalla");
		frase = teclado.nextLine();
		i = 0;
		for(i = 1; i <= 5; i++){
			//System.out.printf("%4d" + frase);
			System.out.println(frase);
		}//for
		
	}//main

}//class
