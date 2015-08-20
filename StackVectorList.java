/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 4
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *------------------------------------------------------------------
 *StackVectorList:
 *Esta clase genérica únicamente contiene los métodos genéricos de la clase abstracta.
 * @param <E>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar la 
 * stackVectorList
 **/
import java.util.Vector;


public class StackVectorList<E> extends AbstractStack<E>{
	private Vector<E> controlador;
	
	public StackVectorList(){
	controlador = new Vector<E>();
	}

	public void empty() {
		// TODO Auto-generated method stub
		controlador.clear();
		
	}
	public void push(E x) {
		// TODO Auto-generated method stub
		controlador.add(x);		
		/*System.out.println("El número guaraddo es:"+x);*/
	}

	public E pop() throws Exception {
		// TODO Auto-generated method stub
		if(controlador.size()>0){	
			E var = controlador.get(controlador.size()-1);
			controlador.remove(controlador.size()-1);
			return var;
		}
		return null;
	}

	
	public int size() {
		// TODO Auto-generated method stub
		return controlador.size();
	}

	public E peek() throws Exception {
		// TODO Auto-generated method stub
		if(controlador.size()>0){
			return controlador.get(controlador.size()-1);
			
		}
			
		return null;
	}
	public Vector<E> getVector(){
		return controlador;
	}	
}