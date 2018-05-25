package enumeradores1;

/**
*  Emun para los tipos de piedras y el peso de la misma.
* @author Albert
* @version 1.1
*/
public enum tipopiedras {


    CALIZA(1200),

    /**
     *
     */
    MARMOL(1423.55),

    /**
     *
     */
    PIZARRA(1325),

    /**
     *
     */
    CUARZITA(1466.22);
    private final double peso;

    private tipopiedras(double peso) {
        this.peso = peso;
    }

    /**
     *
     * @return retorna el peso del tipo de piedra.
     */
    public double getPeso() {
        return peso;
    }

}
