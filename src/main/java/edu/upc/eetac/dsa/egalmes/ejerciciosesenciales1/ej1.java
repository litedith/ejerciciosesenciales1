package edu.upc.eetac.dsa.egalmes.ejerciciosesenciales1;
import java.io.*;
public class ej1 {
	
	 
	   public static void main(String [] arg)  throws BigNumberException{
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	 
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\numeros.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	         	{
	        	 String [] numeros = linea.split("-");
	        	 for (int i = 0; i < numeros.length ; i++) 
	        		 	{
	        		     int entero = Integer.parseInt(numeros[i]);
	        			 if (entero > 1000)
	        			 {
	        				 throw new BigNumberException();
	        			 }
	        				
	        			 else
	        				 {
	        				 System.out.println(numeros[i]);
	        				 }
	        			
	        		 	}
	        			 
	        	     }
	      }
	         catch (BigNumberException b)
	         {
	        	 b.BigNumberException();
	         }
	     
	      catch(Exception e){
	         e.printStackTrace();
	      }
	    
	     /* catch (FileNotFoundException e) {
	    	    e.printStackTrace(); 
	    	    throw new RuntimeException(e);
	    	}
	    	catch (fileOpenFailed) {
       	doSomething;
    		} catch (sizeDeterminationFailed) {
        doSomething;
    	} catch (memoryAllocationFailed) {
        doSomething;
    	} catch (readFailed) {
        doSomething;
    	} catch (fileCloseFailed) {
        doSomething;
    	}*/
	      finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
	}

