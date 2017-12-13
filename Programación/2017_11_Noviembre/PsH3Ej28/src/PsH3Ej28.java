/*28.-Simular el lanzamiento de una moneda al aire e imprimir si ha salido cara o cruz.**/


public class PsH3Ej28 {

	public static void main(String[] args) {
		int i, indiceAzar;
		int cara = 1;
		int cruz = 0;
		i = 0;
		for(i = 0; i <=1; i++){
			indiceAzar = (int) Math.floor(Math.random()*2);
			if(indiceAzar == cruz){
				System.out.println("Ha salido cara");
			}//if
			//System.out.println("¿Quieres saber que saldría la próxima vez?");
			
			
		}//for
		
	}//main

}//class
