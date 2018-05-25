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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Interruptor a = new Interruptor(Estado_bombilla.getON());
       //Interruptor b = new Interruptor(Estado_bombilla.getOFF());
       Bombilla p = new Bombilla(a);
       p.verEstado();
       p.CambiarEstado(a.getEstado());
       p.verEstado();
      // p.getInterruptor();
       
     // Bombilla c[];
        //for (Bombilla bombilla : c) {
      //   bombilla.CambiarEstado(Estado_bombilla.OFF);
    //    }
       
    }    
}
