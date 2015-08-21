/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Clase DoblementeNelazada<E>: Esta clase permite la creacion de una lista
 *doblemente enlazada  
 **/

public class DoblementeEnlazada<E> extends ListaAbstracta<E>{
	//private int count;
	private DobleNodo<E> cabeza;
	private DobleNodo<E> cola; 
	
	public DoblementeEnlazada(){
		super();
		cabeza=null;
		cola=null;
		//count=0; 
	}
	
	//public int size() {
		// TODO Auto-generated method stub
		//return count;
	//}

	public void addFirst(E value) {
		// TODO Auto-generated method stub
		cabeza= new DobleNodo<E>(value,cabeza,null);
		if (cola==null){
			cola=cabeza;
		}
		count++;
		}
	

	public E removeFirst() {
		// TODO Auto-generated method stub
			E temp =cabeza.valor();
			cabeza=cabeza.next();
			cabeza.setPrev(null);
			count--;
			return temp;
		
	}

	public E removeLast() {
		// TODO Auto-generated method stub
			DobleNodo<E> temp=cola;
			cola=temp.prev();
			cola.setNext(null);
			count--;
			return temp.valor();
		}
	

	public void addLast(E value) {
		// TODO Auto-generated method stub
			DobleNodo<E> temp= cola;
			cola= new DobleNodo<E>(value,null,temp);
			temp.setNext(cola);
			count++;
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		return cabeza.valor();
	}

	public boolean contains(Object value) {
		// TODO Auto-generated method stub
		DobleNodo<E> temp=cabeza;
		int contador=0;
		while (temp.next()!=null){
			if(value==temp.valor()){
				contador++;
				temp=temp.next();
			}
			else{
				temp=temp.next();
			}
		}
		if(contador>0){
			return true;
		}
		else{
			return false;
		}
	}

}
