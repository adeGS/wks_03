/*6- Hacer un pseudocódigo que imprima todos los números naturales que hay desde la unidad 
hasta un numero que introducimos por teclado
*/
import java.util.*;
public class PsH3Ej06 {

	public static void main(String[] args) {
		int num, numParada, numMax;
		Scanner teclado = new Scanner(System.in);
		Scanner numFinal;
		String frase;
		num = 1;
		System.out.println("\nIntroduzca un numero donde quiere que termine de contar:");
		numParada = teclado.nextInt();
		teclado.nextLine();/*para limpiar el buffer*/
		numMax = numParada;
		for(num = 1; num < numMax ; num++){
			System.out.println("Los numeros son " + num);
		}
		
	}//main

}//class
