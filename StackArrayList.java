/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 2
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Clase: StackArrayList
 *Esta clase hereda la clase abstractStack y hace un override
 *sobre los métodos que la clase abstracta implementa.
 **/

import java.util.*;

public class StackArrayList<E> extends AbstractStack<E> {
	/**
	 * Objeto de tipo ArrayList. Este objeto nos permitira 
	 * utilizar los métodos de la clase vector para implementar
	 * la Stack 
	 */
	private ArrayList<E> controlador;

	/**
	 * Constructor de la clase 
	 */
	public StackArrayList(){
	controlador =  new ArrayList<E>();;
	}
	
	/* (non-Javadoc)
	 * @see ADTStack#empty()
	 */
	public void empty() {
		controlador.clear();
		
	}

	/* (non-Javadoc)
	 * @see ADTStack#push(java.lang.Object)
	 */
	public void push(E x) {
		controlador.add(x);		
		/*System.out.println("El número guaraddo es:"+x);*/
	}

	public E pop() throws Exception {
		if(controlador.size()>0){	
			E var = controlador.get(controlador.size()-1);
			controlador.remove(controlador.size()-1);
			return var;
		}
		return null;
	}

	
	public int size() {
		return controlador.size();
	}

	public E peek() throws Exception {
		if(controlador.size()>0){
			return controlador.get(controlador.size()-1);
			
		}
			
		return null;
	}
	public ArrayList<E> getVector(){
		return controlador;
	}	
}
