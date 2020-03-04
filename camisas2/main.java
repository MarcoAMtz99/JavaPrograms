
package camisas2;
import java.util.Scanner;
/**
 *
 * @author 84859
 */
public class main {
    public static void main(String[] args) {
        int NumCamisas;
        int respuesta;
        
        Scanner read = new Scanner(System.in);
        Scanner expresion = new Scanner(System.in);
        
        
        camisa Camisa1 = new camisa(1,"camisa de manga larga",190,0);
        camisa Camisa2 = new camisa(2,"camisa casual de manga larga",230,0);
        camisa Camisa3 = new camisa(3,"camisa formal de manga larga",310,0);
        descuentos desc = new descuentos();
        System.out.println("Elige tu camisa con eligiendo del 1 al 3");
          Camisa1.toString();
                 Camisa2.toString();
                     Camisa3.toString();
            respuesta = expresion.nextInt();
                
               switch(respuesta){
   
                case 1 :
                             System.out.println("Ingresa el numero de camisas ");
                             NumCamisas = read.nextInt();
                             Camisa1.setNumCamisas(NumCamisas);
                             desc.descuento(Camisa1.getNumCamisas(),Camisa1.getPrecio());
                          break; 
   
                case 2 :
                             System.out.println("Ingresa el numero de camisas 2");
                             NumCamisas = read.nextInt();
                             Camisa2.setNumCamisas(NumCamisas);
                              desc.descuento(Camisa2.getNumCamisas(),Camisa2.getPrecio());
                          break; 
                case 3 :
                              System.out.println("Ingresa el numero de camisas 3");
                              NumCamisas = read.nextInt();
                              Camisa3.setNumCamisas(NumCamisas);
                              desc.descuento(Camisa2.getNumCamisas(),Camisa3.getPrecio());
                          break; 
                
  
                       default : 
                            System.out.println("No entiendo la expresion sorry");
                           break;
                           }
            }
    }
