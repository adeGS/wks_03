/*5-Hacer un pseudoc�digo que imprima los n�meros impares hasta el 100 y que imprima
cuantos impares hay */

public class PsH3Ej05 {

	public static void main(String[] args) {
			int num, contador;
			num = 1;
			contador = 0;
			System.out.println("Numeros comprendidos entre 0 y 100:");
			for(num = 1; num < 100; num++){
				if(num % 2 == 1){
					System.out.println(num);
				}
				contador = contador + 1;
				contador++;
				
			}System.out.println("La cantidad de numeros impares comprendidos entre 0 y 100 son : " + contador);
	}//main

}//class
