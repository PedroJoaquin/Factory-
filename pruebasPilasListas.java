import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Clase pruebaPilasListas
 * Es la encargada de ejecutar todas las pruebas de los métodos
 * generados en las implementaciones de cada una de las pilas y listas.
 * Verifica que el funcionamiento de isEmpty sea el correcto
 */
public class pruebasPilasListas {
CalPostFix  calculadora;
double val=0;


/**
 * ArrayTest:
 * Se encarga de comprobar que el método cálcular funcione para la implentación de arrays.
 * */
	@Test
	public void Arraytest() {
	 calculadora= new CalPostFix("1");
	try {
		calculadora.readFile("src\\texto.txt");
	}  
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		val=calculadora.calcular();
	}
	catch (Exception NullPointerException){
		System.out.println("OPS, no es posible realizar la operación");
		System.exit(0);
	}
	assertEquals(15 ,(int) val);
	}
	
/**
 * Vectortest:
 * Se encarga de comprobar que el método cálcular funcione para la implentación de vectores.
 * */
	@Test
	public void Vectortest() {
	calculadora= new CalPostFix("2");
	try {
		calculadora.readFile("src\\texto.txt");
	}  
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		val=calculadora.calcular();
	}
	catch (Exception NullPointerException){
		System.out.println("OPS, no es posible realizar la operación");
		System.exit(0);
	}
	assertEquals(15 ,(int) val);
	}
/**
 * Simpletest:
 * Se encarga de comprobar que el método cálcular funcione para la implentación de las listas simples.
 * */
	@Test
	public void Simpletest() {
		 calculadora= new CalPostFix("3");
			try {
				calculadora.readFile("src\\texto.txt");
			}  
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				val=calculadora.calcular();
			}
			catch (Exception NullPointerException){
				System.out.println("OPS, no es posible realizar la operación");
				System.exit(0);
			}
			assertEquals(15 ,(int) val);
	}
/**
 * Circulartest:
 * Se encarga de comprobar que el método cálcular funcione para la implentación de las listas circulares.
 * */
	
	@Test
	public void circularTest() {
		 calculadora= new CalPostFix("5");
			try {
				calculadora.readFile("src\\texto.txt");
			}  
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				val=calculadora.calcular();
			}
			catch (Exception NullPointerException){
				System.out.println("OPS, no es posible realizar la operación");
				System.exit(0);
			}
			assertEquals(15 ,(int) val);
	}
	}
