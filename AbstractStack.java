/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Clase Abstracta AbstractStack. Esta clase implementa la interface
 *ADT Stack e implementa el metodo isEmpty.
 **/

public abstract class AbstractStack<E> implements ADTStack<E> {
	
/**
 * Método: isEmpty
 * Funcionalidad: Determinar si una pila está vacía
 * pre: none
 * post: true(empty), false (not empty)
 *
 * /
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size()>0){
			return false;
		}
		return true;
	}
}
