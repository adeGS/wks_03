/*4- Hacer un programa que imprima la suma de los 100 primeros n�meros.*/

public class PsH3Ej04 {

	public static void main(String[] args) {
		int num, suma;
		suma = 0;
		for(num = 1; num <= 100; num++){
			suma = suma + 1;
		}
		System.out.println("num+1: " + (num + 1) + " suma: " + suma);

	}//main

}//class
