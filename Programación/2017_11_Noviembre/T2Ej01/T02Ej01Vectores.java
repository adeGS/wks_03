
public class T02Ej01Vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vecNum [] = new int [20];
		double suma, media;
		int indice, supMedia, infMedia, igMedia;
		suma = 0;
		for(indice=0; indice < 20; indice++){
			vecNum[indice]= (int)Math.floor(Math.random() * 21 - 10);
			suma = suma + vecNum[indice];
		}
		System.out.println(suma);
		
		
		
		
		
		
	}//main

}//class
