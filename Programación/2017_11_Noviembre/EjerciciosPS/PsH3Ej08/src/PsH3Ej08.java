/*8.-Hacer un pseudocódigo que solo nos permita introducir S o N.**/
import java.util.*;
public class PsH3Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean valor;
		String respuesta;
		Scanner teclado = new Scanner (System.in);
		do{
			System.out.println("¿Te gusta la sandía? (teclea S ó N)");
			respuesta = teclado.nextLine();
		}while(respuesta.equals("S") && respuesta.equals("N") && respuesta.equals("s") && respuesta.equals("n"));
		System.out.println("¿Y el zuma de sandía?");
	}//main

}//class
