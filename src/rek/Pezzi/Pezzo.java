package rek.Pezzi;

import rek.Casella;
import rek.Colore;
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

    abstract boolean doMove(Casella c);
}
