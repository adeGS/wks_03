/**
Escribir un programa, para que realice el juego del ahorcado. Este juego es como sigue:
El  ordenador  tiene  en una  cadena  la  palabra  a  adivinar,  que  deb�is  inicializar  al  comienzo 
del programa (elegirla al azar entre un vector de 50 palabras fijas).

El jugador dispone de 10 intentos.

Pulsa  una  letra  y  el  ordenador  escribe  en  pantalla  las  ocurrencias  de  esa  letra  y  su 
posici�n  en la  palabra  por ejemplo si la  palabra fuera �CARACOLA� y  el
jugador pulsa  la �C� el programa debe escribir: C --- C ---

Debe aparecer el n�mero de intento en el que estamos jugando

Si  el jugador da una  letra  que no existe, no debe  aparecer nada y debe a�adirse en las 
letras falladas que aparecer�n en otra cadena, en otra posici�n de la pantalla.

Si una letra ya fue jugada no debe permitirse jugarla de nuevo.

 */


import java.util.*;

public class EJprofundizacion1 {
		
	public static void main(String[] args) {
			String letra, palabra = null;
			Scanner teclado = new Scanner(System.in);
		    String letraSalida = new String("q");
			int numIntento ;
			String vecCadena [] = {"hola", "ve", "hi", "fuego", "vaya", "gula", "dato", "sentencia", "primitivo", "vector",
						"hola", "ve", "hi", "fuego", "vaya", "gula", "dato", "sentencia", "primitivo", "vector",
						"hola", "ve", "hi", "fuego", "vaya", "gula", "dato", "sentencia", "primitivo", "vector",
						"hola", "ve", "hi", "fuego", "vaya", "gula", "dato", "sentencia", "primitivo", "vector",
						"hola", "ve", "hi", "fuego", "vaya", "gula", "dato", "sentencia", "primitivo", "vector",};
			numIntento = 1;
			for (numIntento = 1; numIntento <= 10; numIntento++){
				System.out.println("Empiece con el intento n�mero " + numIntento + "(pulse " + letraSalida + " para salir): ");
				if(numIntento <=10){
					System.out.println("Introduzca una letra");
					letra = teclado.next();
				}
			}//for
				
				
				
		
			}//main
		
	}//class
