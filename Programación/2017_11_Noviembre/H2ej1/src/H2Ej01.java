import java.util.Scanner;
public class H2Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num1, num2, k, suma;
		System.out.println("Numero?");
		num1=teclado.nextInt();
		System.out.println("Numero mayor o igual que el anterior?");
		num2=teclado.nextInt();
		while(num2<num1){
			System.out.println("Numero mayor o igual que el anterior?");
			num2=teclado.nextInt();
		}
		// contamos con num1 y num2
		suma = 0;
		for(k = num1 ; k <= num2; k++){
			if(k % 2 != 0){
				suma = suma + k;
			}
		}
		System.out.println("La suma de los impares comprendidos entre " + num1 + " y " + num2 + " es: " + suma);
	}//main

}//class
