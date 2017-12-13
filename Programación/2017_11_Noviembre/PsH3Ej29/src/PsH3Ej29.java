/*29.-Simular cien tiradas de dos dados y contar las veces que entre los dos suman 10.*/
public class PsH3Ej29 {

	public static void main(String[] args) {
		int i, indiceAzar;
		int vecNumeros [] = {0, 1};
		int vecConta [] = new int [100];
		i = 0;
		for(i = 0; i <=1; i++){
			indiceAzar = (int) Math.floor(Math.random()*100 -1);
			vecConta [i] = vecNumeros [indiceAzar];
		}//for
		
	}//main

}//class
