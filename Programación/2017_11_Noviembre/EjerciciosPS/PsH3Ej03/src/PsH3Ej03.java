/*3-Hacer un pseudoc�digo que imprima los n�meros pares entre 0 y 100*/

public class PsH3Ej03 {

	public static void main(String[] args) {
		int num;
		num = 1;
		while(num <= 100){
			if(num % 2 == 0){
				System.out.println(num);
			}
			num++;
		}
	}//main

}//class


