/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Nodo: Esta clase permite crear objetos que almacenan un valor determinado y una 
 *referencia de otro objeto de la mimsa clase con los cuales es posible crear una lista.
 * @param <E>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar el
 * Nodo
 **/
public class Nodo<E> {
	private E valor;
	private Nodo<E> next;
	
	public Nodo(E valor, Nodo<E> next){
		this.valor=valor;
		this.next=next;
	}
	
	public Nodo(E valor){
		this(valor, null);
	}
	
	public Nodo<E> next(){
		return next;
	}
	
	public void setNext(Nodo<E> next){
		this.next=next;
	}
	
	public E valor(){
		return valor;
	}
	
	public void setValor(E valor){
		this.valor = valor;
	}
}
