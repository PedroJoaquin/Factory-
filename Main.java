/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 2
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *Boris Cifuentes 14150
 *------------------------------------------------------------------
 *Main:
 *Esta clase es la encargada de interactuar con el usuario y mostrarle
 *el resultado obtenido por la calcuadora Postfix después de haber leído el
 *documento que contiene la  linea a operar.
 **/
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int a=2;
		double val=0;
	
	//Se declara y crea el objeto teclado
		while (a != 0){
			Scanner teclado = new Scanner(System.in);
			//Se solicitan los datos al usuario
			System.out.println ("BIENVENIDO A LA CALCULADORA POSTFIX");
			System.out.println ("Elija la forma de implementacion de la Pila:\n1.Vector\n2.ArrayList\n3.Lista Simpe\n4.Lista Doble\n5.Lista Circular\n");
			String opcion = teclado.nextLine();
			a= verificar(opcion);
			if (a==1){
				CalPostFix calculadora= new CalPostFix(opcion);
			try{
				calculadora.readFile("src\\texto.txt");
			}
			catch (Exception e){
				System.err.println( "ARCHIVO NO ENCONTRADO" );
			}

			try {
				val=calculadora.calcular();
			}
			catch (Exception NullPointerException){
				System.out.println("OPS, no es posible realizar la operación");
				System.exit(0);
			}
			System.out.println("¡Trabajo realizado!"+ val );
			a=0;
		}
		}
	}
	
	public  static int verificar(String i){
	    int val;
	    int verify;
		try {
			val= Integer.parseInt(i);
			if (val>0 && val <= 5){
				System.out.println("Número correcto");
				verify=1;
			}
			else {
				System.out.println("El número es incorrecto");
				verify=2;
			} 
		}
		catch (Exception e){
			System.out.println("No puedes ingresar una letra");
			verify=2;
		}
		return verify;
	}
}

   

