/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *StackSimple: Esta clase es una clase hija de AbstractStack<E>
 *la cual implementa los metodos faltantes en la clasde Padre
 *utilizando los metodos de la clase SimplementeEnlazada<E>
 **/

public class StackSimple<E> extends AbstractStack<E>{

	private SimplementeEnlazada<E> lista;
	
	public StackSimple(){
		lista = new SimplementeEnlazada<E>();
	}
	public void empty() {
		// TODO Auto-generated method stub
		while(lista.size()!=0){
			lista.removeFirst();
		}
	}

	public void push(E x) {
		// TODO Auto-generated method stub
		lista.addFirst(x);
	}

	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return lista.removeFirst();
	}

	public int size() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	public E peek() throws Exception {
		// TODO Auto-generated method stub
		return lista.getFirst();
	}

}
