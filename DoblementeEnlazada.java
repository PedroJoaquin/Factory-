//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado 14224
//Freddy José Ruíz  Gatica 14592

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
		if(cabeza==null){
			cabeza = new DobleNodo<E>(value,null,null);
			count++;
		}
		else if(cabeza!=null){
			DobleNodo<E> temp= cabeza;
			cabeza= new DobleNodo<E>(value,temp,null);
			temp.setPrev(cabeza);
			count++;
		}
		}
	

	public E removeFirst() {
		// TODO Auto-generated method stub
		if(cabeza==null){
			return null;
		}
		else if(cabeza!=null){
			DobleNodo<E> temp =cabeza;
			cabeza=temp.next();
			cabeza.setPrev(null);
			count--;
			return temp.valor();
		}
		return null;
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