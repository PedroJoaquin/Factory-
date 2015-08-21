/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 2
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *Boris Cifuentes 14150
 *------------------------------------------------------------------
 *Interface Stack:
 *Esta clase genérica únicamente contiene los métodos genéricos a implementar en la controladora 
 *de la stack.
 * @param <P>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar la 
 * calculadora Stack.
 **/
import java.io.*;

public class CalPostFix implements ADTCalculadora<Double>{
	
	String texto = "" ;
	AbstractStack<Double> pila; 
	Double valor;
	Factory<Double> factory;
	
	public CalPostFix(String i){
			factory = new Factory<Double>();
			pila = factory.seleccion(i);
	}
	/* (non-Javadoc)
	 * @see Calculadora#readFile(java.lang.String)
	 */
	public void readFile(String file)throws FileNotFoundException, Exception{
        
        try{
        	File archivo = new File (file);
        	FileReader fr= new FileReader(archivo);
        	BufferedReader bf= new BufferedReader(fr);
      
            
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //Se leen las lineas hasta que encuentra una línea en blanco
               //Se almacena poco a poco 
            	texto= bfRead;
            	/*texto=texto+bfRead*/
            }        
        }catch(Exception e){ 
        	   System.err.println( "ARCHIVO NO ENCONTRADO" );
        }   
    }
    
	public double calcular(){
		char numero= 0 ;
		double operando1=0;
		double operando2=0;
		
		for(int i=0; i<texto.length();i++){
			numero=texto.charAt(i);
			System.out.println(numero);
			switch (numero){
			
			case '1':	
				pila.push(1.0);
				break;
			case '2' :	
				pila.push(2.0);
				break;
			case '3':	
				pila.push(3.0);
				break;
			case '4':	
				pila.push(4.0);
				break;
			case '5' :	
				pila.push(5.0);
				break;
			case '6' :	
				pila.push(6.0);
				break;
			case '7' :	
				pila.push(7.0);
				break;
			case '8':	
				pila.push(8.0);
				break;
			case  '9' :	
				pila.push(9.0);
				break;
			case '+' :
				try{
				operando2=pila.pop();
				operando1=pila.peek();
				pila.push((operando1+operando2));
				break;
				}
				catch(Exception e){
					break;
				}
			case '-':
				try{
					operando2=pila.pop();
					operando1=pila.peek();
					pila.push((operando1-operando2));
					break;
				}
				catch(Exception e){
					break;
				}
			case '*':
				try{
					operando2=pila.pop();
					operando1=pila.peek();
					pila.push((operando1*operando2));
					break;
				}
				catch(Exception e){
					break;
				}
			case '/':
				try{
					operando2=pila.pop();
					operando1=pila.peek();
					pila.push((operando1/operando2));
					break;
				}
				catch(Exception e){
					break;
				}
			//return pila.pop();
		}
			}
		try{
			valor= new Double(pila.pop());
		}
		catch(Exception e){
		}
		return valor;
	}
	
}

