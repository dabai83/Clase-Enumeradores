/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeradores2;

/**
 *
 * @author Albert
 */
public class Interruptor {
   private Estado_bombilla estado;

    /**
     *
     * @param estado
     */
    public Interruptor(Estado_bombilla estado) {
        this.estado = estado;
    }

    /**
     * 
     * @return
     */
    public Estado_bombilla getEstado() {
        return estado;
    }

    /**
     * Trae el Estado.
     * @param estado
     */
    public void setEstado(Estado_bombilla estado) {
        this.estado = estado;
    }
   


    }      
    

