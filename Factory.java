/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Factory:Esta clase tiene como función generar uan instancia de 
 *las diferentes clases Stack.  
 * HOLA!!! Esto es una prueba XD
 **/

public class Factory<E> {
	
	public AbstractStack<E> seleccion(String i){
		if(i.equals("1")){
			return new StackVectorList<E>();
		}
		else if(i.equals("2")){
			return new StackArrayList<E>();
		}
		else if(i.equals("3")){
			return new StackSimple<E>();
		}
		else if(i.equals("4")){
			return new StackDoble<E>();
		}
		else if(i.equals("5")){
			return new StackCircular<E>();
		}
		else
			return null;
	}
	
}
