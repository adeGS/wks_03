import java.util.Scanner;
public class Tabla {

	public static void main() {
		// TODO Auto-generated method stub

		Scanner teclado  = new Scanner(System.in);
		int letra;
		String frase = new String ();
		frase = teclado.next();
		System.out.println("Introduzca una frase");
			frase = teclado.next();
		System.out.println("Escriba una palabra de la frase");
		if (s1.startsWith(palabra+" ")){
			System.out.println("Es la primera palabra de la frase, posicion " +s1.indexOf(palabra));
		}else if (s1.indexOf(" " +palabra +" ")!=-1){
			System.out.println("La palabra empieza en la posicion " + (s1.indexOf(" " + palabra +" ") +1));
		}else if (s1.endsWith(" "+palabra)){
			System.out.println("Es la ultima palabra de la frase, posicion " + (s1.lastIndexOf(" "+palabra) + 1));
		} else{
			System.out.println("No se encuentra la palabra");
		}
		
	}//main

}//class
