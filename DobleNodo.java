/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *NodoDoble:
 *Esta clase permite crear objetos que almacenan un valor determinado y dos referencias 
 *a objetos del mismo tipo. 
 * @param <E>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar
 * los NodosDobles
 **/
public class DobleNodo<E>{
	private E valor; 
	private DobleNodo<E> next; 
	private DobleNodo<E> prev; 
	
	public DobleNodo(E valor, DobleNodo<E> next,DobleNodo<E> prev){
		this.valor=valor;
		this.next=next; 
		this.prev=prev;
	}
	
	public void setValor(E valor){
		this.valor=valor;
	}
	
	public void setNext(DobleNodo<E> next){
		this.next=next;
	}
	
	public void setPrev(DobleNodo<E> prev){
		this.prev=prev;
	}
	
	public E valor(){
		return valor;
	}
	
	public DobleNodo<E> next(){
		return next;
	}
	
	public DobleNodo<E> prev(){
		return prev; 
	}
}

