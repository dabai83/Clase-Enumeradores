/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracion;

/**
 *
 * @author Albert
 */
public abstract class Legislador extends personas {
    private String provinciaQueRepresenta;

    public Legislador(String provinciaQueRepresenta, String nombre, String apellido) {
        super(nombre, apellido);
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }
    public String getCamaraEnQueTrabaja(){
        return "";
    } 

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }

    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }
    
  
    
}
