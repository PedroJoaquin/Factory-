/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *Cicular: Esta clase permite crear listas circulares utilizando Nodos simples
 * @param <E>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar la
 * Lista
 **/
public class Circular<E> extends ListaAbstracta<E>{
	private Nodo<E> cabeza;
	//private int elementos;
	
	/**
	 * Método: Circular
	 * Funcionalidad:
	 * Constructor en la primera posición y el count igual a 0
	 */
	public Circular(){
		super();
		cabeza=null;
		//elementos=0;
	}
	/*public int size() {
		return elementos;
	}*/
	
	public void addFirst(E value) {
		Nodo<E> temp= new Nodo<E>(value);
		if (cabeza== null){//Lista vacía
		cabeza=temp; //Se inicializa en null para crear la referencia a la cabeza
		cabeza.setNext(cabeza);
		}
		else{
			temp.setNext(cabeza.next());
		    cabeza.setNext(temp);
		}
		count++;
		}
	public E removeFirst(){
		Nodo <E> apuntador = cabeza; //Iniciando el recorrido desde el comienzo
		Nodo <E> temporal= cabeza;
		while(apuntador.next() != cabeza){
			apuntador=apuntador.next();//Almacena el nodo siguiente
		}
	if (apuntador != cabeza){
		apuntador.setNext(cabeza.next());
		cabeza=apuntador;
		count--;
	}
	else{
		cabeza=null;
		count--;
	}
		return temporal.valor();
	}
	public E removeLast(){
		Nodo <E> apuntador = cabeza; //Iniciando el recorrido desde el comienzo
		Nodo <E> temporal= cabeza;
		while(apuntador.next() != cabeza){
			apuntador=apuntador.next();//Almacena el nodo siguiente
		}
	if (apuntador != cabeza){
		apuntador.setNext(cabeza.next());
		cabeza=apuntador;
		count--;
	}
	else{
		cabeza=null;
		count--;
	}
		return temporal.valor();
	};
	public void addLast(E value){ //Ya que la cola y la cabeza son iguales 
		addFirst(value);
		cabeza=cabeza.next();
	};
	public E getFirst(){
		return cabeza.valor();
	};
	public boolean contains (E value){
		Nodo<E> apuntador = cabeza;
		boolean exist=false;
		while(apuntador!=null){
			apuntador = apuntador.next();
		   if (apuntador.valor().equals(value) == true){
			   exist=true;
			}
			else{
				exist=false;
			}
		}
		return exist;
	};

}
