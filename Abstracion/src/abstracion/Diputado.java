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
public class Diputado extends Legislador{

    public Diputado(String provinciaQueRepresenta, String nombre, String apellido) {
        super(provinciaQueRepresenta, nombre, apellido);
    }

    @Override
    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        super.setProvinciaQueRepresenta(provinciaQueRepresenta); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getProvinciaQueRepresenta() {
        return super.getProvinciaQueRepresenta(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return ("Trabajo en la cama de diputado"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
