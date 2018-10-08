package rek.Pezzi;

import rek.Casella;
import rek.Colore;
import rek.Ecceizioni.MossaBaseException;
import rek.Mossa;
import rek.PezzoMangiatoException;

public abstract class Pezzo {

    private final Colore colore;
    // private final Scacchiera scacchiera;
    private Casella casella;
    // private int x,y;

    /**
     * Trova la posizione di questo {@Pezzo} nella sua {@Scacchiera}.
     *
     * @return
     * @throws PezzoMangiatoException
     */
    public Casella getPos() throws PezzoMangiatoException {
        return casella.getScacchiera().getPos(this);
    }

    public Pezzo(Casella ca, Colore co){
        this.casella = ca;
        this.colore = co;
    }

    /*
    /**
     * Mossa del {@pezzo}.
     *
     * @param c {@code Casella} bersaglio su cui muovere il pezzo.
     * @throws MossaBaseException o sue sottoclassi per vari errori di mossa.
     * /
    abstract void doMove(Casella c) throws MossaBaseException;
    */

    abstract public Mossa[] getLegalMoveset();

    abstract public void selectMove(Mossa m);
}
