//Universidad Del valle de Guatemala 
//Algoritmos y Estructura de Datos 
//Interface de Listas Enlazadas 
//Pedro Joaquin Castillo Coronado 14224
//Freddy José Ruíz  Gatica 14592

public class SimplementeEnlazada<E> extends ListaAbstracta<E>{
	private Nodo<E> cabeza;
	//protected int count;
	 
	public SimplementeEnlazada(){
		super();
		cabeza = null;
		//count = 0;
	}
	
	/*public int size() {
		// TODO Auto-generated method stub
		int elementos=0;
		Nodo<E> apuntador = cabeza;
		while(apuntador!=null){
			elementos++;
			apuntador = apuntador.next();
		}
		return elementos;
	}*/

	public void addFirst(E value) {
		// TODO Auto-generated method stub
		cabeza = new Nodo<E>(value, cabeza);
		count++;
	}

	
	public E removeFirst() {
		// TODO Auto-generated method stub
		Nodo<E> temporal = cabeza;
		cabeza = cabeza.next();
		count--;
		return temporal.valor();
	}

	public E removeLast() {
		// TODO Auto-generated method stub
		Nodo<E> apuntador = cabeza;
		Nodo<E> previo = null;
//		Assert.pre(cabeza != null, "Lista no empezada");
		while(apuntador.next() != null){
			previo = apuntador;
			apuntador = apuntador.next();
		}
		if(previo==null)
			cabeza = null;
		else
			previo.setValor(null);
		count--;
		return apuntador.valor();
	}

	public void addLast(E value) {
		// TODO Auto-generated method stub
		Nodo<E> temporal = new Nodo<E>(value,null);
		if(cabeza != null){
			Nodo<E> apuntador = cabeza;
			while(apuntador.next() != null){
				apuntador = apuntador.next();
			}
			apuntador.setNext(temporal);
		}
		else
			cabeza = temporal;
		count++;
		
	}

	public E getFirst() {
		// TODO Auto-generated method stub
		return cabeza.valor();
	}

	public E getLast() {
		// TODO Auto-generated method stub
		Nodo<E> apuntador = cabeza;
		while(apuntador.next()!= null){
			apuntador = apuntador.next();
		}
		return apuntador.valor();
	}

	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Nodo<E> apuntador = cabeza;
		while(apuntador != null && !apuntador.valor().equals(value)){
			apuntador = apuntador.next();
		}
		return apuntador != null;
	}

}