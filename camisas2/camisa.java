
package camisas2;

/**
 *
 * @author Marco Antonio MArtinez
 */
public class camisa {
    public int id;
    public String descripcion;
    public float precio;
    public int NumCamisas;
    public String cadena;

    public int getId() {
        return id;
    }

    public int getNumCamisas() {
        return NumCamisas;
    }

    public camisa(int id, String descripcion, float precio, int NumCamisas) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.NumCamisas = NumCamisas;
    }

    public void setNumCamisas(int NumCamisas) {
        this.NumCamisas = NumCamisas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        cadena = "ID:"+id+"DESCRIPCION:"+descripcion+"PRECIO:"+precio+"Numero de camisas:"+NumCamisas ;
    return cadena;
    }
    
    
}
