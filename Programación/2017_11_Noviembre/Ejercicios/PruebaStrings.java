import java.util.*;
public class PruebaStrings {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/*String cad1, cad2;
		cad1 = "lolo";
		cad2 = "lolo";
		if(cad1 == cad2){
			System.out.println("Las referencias de las cadenas coinciden");
		}
		cad1 = "hola";
		cad2 = new String("hola");
		if(cad1 == cad2){
			System.out.println("Las referencias de las cadenas coinciden");
		}else{
			System.out.println("Las referencias de las cadenas NO coinciden");
		}
		if(cad1.equals(cad2)){
			System.out.println("El contenido de las cadenas coincide");
		}
		cad1 = "hola";
		cad2 = new String("zzpaf");
		if(cad1.compareTo(cad2) > 0){
			System.out.println(cad1 + " va despues en orden alfabetico que " +cad2);
		}else if(cad1.compareTo(cad2) < 0){
			System.out.println(cad1.compareTo(cad2));
			System.out.println(cad1 + " va antes en orden alfabetico que " +cad2);
		}*/
		
		String letraLeida;
		String letrasControl = "TRWAGMYFPDXBNJZSQVHLCKE";
		int num = 18274201;
		System.out.println(letrasControl.charAt(num % 23) + " es la letra e control");
		do{
			System.out.println("Letra?");
			letraLeida = teclado.nextLine();
		}while(letraLeida.length()>1);
		if (letraLeida.charAt(0) == letrasControl.charAt(num % 23) ){
			System.out.println("La letra es correcta");			
		}else{
			System.out.println("La letra esta mal");			
		}
	}//main

}//class









