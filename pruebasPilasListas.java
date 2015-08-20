import static org.junit.Assert.*;

import org.junit.Test;


public class pruebasPilasListas {
CalPostFix  calculadora;
double val=0;
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
