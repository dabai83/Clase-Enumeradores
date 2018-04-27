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
public class Bombilla {
    private Interruptor interruptor;

    public Bombilla(Interruptor interruptor) {
        this.interruptor = interruptor;
}

    public Interruptor getInterruptor() {
        return interruptor;
    }

    public void setInterruptor(Interruptor interruptor) {
        this.interruptor = interruptor;
    }
   public void verEstado() {

         System.out.println("la Bombilla esta "+ interruptor.getEstado());
    }
    public void CambiarEstado(Estado_bombilla estad) {
         if(estad == Estado_bombilla.ON) {
            interruptor.setEstado(Estado_bombilla.OFF);
         }
         else{
            interruptor.setEstado(Estado_bombilla.ON);    
         }   
    }   
}
