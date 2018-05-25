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
public class Casa {
    private Bombilla bombilla[];

    public Casa(Bombilla[] bombilla) {
        this.bombilla = bombilla;
    }

    public Bombilla[] getBombilla() {
        return bombilla;
    }

    public void setBombilla(Bombilla[] bombilla) {
        this.bombilla = bombilla;
    }
    
}
