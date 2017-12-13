/*1.	Leer una frase de máximo 80 caracteres y escribirla progresivamente 
 es decir si la frase es: “ciervo”,  el programa debe imprimir
 c
 ci
 cie
 cier
 cierv
 ciervo 
 */
import java.util.*;
public class T04Ej01 {

	public static void main(String[] args) {
		String frase, fin;
		char letra;
		final int MAX_LONGITUD = 80;
		int lineas, caracter;
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("Frase de hasta "+ MAX_LONGITUD + " caracteres: ");
			frase = teclado.nextLine();
		}while(frase.length() > MAX_LONGITUD);
		/*for(lineas = 0; lineas < frase.length(); lineas++){
			
			for (caracter = 0; caracter <= lineas; caracter++){
				System.out.print(frase.charAt(caracter));
			}
			System.out.println();//escribir una linea
		}*/
		/*for(lineas = 0;lineas < frase.length(); lineas++){
			System.out.println(frase.substring(0, lineas + 1));
		}*/
		fin="";
		lineas=0;
		while( lineas < frase.length() ){
			letra = frase.charAt(lineas);
			fin = fin + letra;
			System.out.println(fin);
			lineas++;
		}
	}//main
}//class











