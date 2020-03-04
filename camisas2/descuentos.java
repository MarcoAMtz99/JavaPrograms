
package camisas2;

/**
 *
 * @author Marco Antonio Martinez
 */
public class descuentos {
         float precioFin,precioaux,descuento=0 ;
          public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
         
    public String descuento (int camisas,float precio){
        
        if(camisas<3){
            
            precioFin = camisas*precio;
            System.out.println("El precio a pagar es: "+precioFin);
             return "hols "+precioFin;
             
        }else if(camisas<=5 && camisas>=3){
            
            precioFin = precio*camisas;
            precioaux =(float)(precioFin*0.05);
            descuento = precioFin-precioaux;
            System.out.println("El precio a pagar es: "+descuento);
             return "El precio a pagar es: "+ descuento ;
        }else{
            
            precioFin = camisas*precio;
            precioaux = (float)(precioFin*0.08);
            descuento = precioFin-precioaux;
            System.out.println("El precio a pagar es: "+descuento);
             return "El precio a pagar es: "+descuento;
             
        }
        
    }

  
}
