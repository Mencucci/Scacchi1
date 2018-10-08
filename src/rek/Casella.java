package rek;

import rek.Pezzi.Pezzo;

public class Casella {

    private Pezzo pezzo;
    private Scacchiera scacchiera;

    /**
     * Costruisce una {@Casella} senza alcun {@Pezzo} al suo interno.
     *
     * @param s {@code Scacchiera} cui la {@code Casella} appartiene.
     */
    public Casella(Scacchiera s) {
        pezzo = null;
        scacchiera = s;
    }

    /**
     * Costruisce una {@code Casella} con un Pezzo al suo interno.
     *
     * @param p
     * @param s
     */
    public Casella(Pezzo p, Scacchiera s) {
        pezzo = p;
        scacchiera = s;
    }

    /**
     * Restituisce il {@code Pezzo} attualmente posizionato sulla cella.
     *
     * @return
     * @throws CasellaVuotaException
     */
    public Pezzo getPezzo() throws CasellaVuotaException {
        if(pezzo == null) throw new CasellaVuotaException();
        else return pezzo;
    }

    /**
     * Posiziona un {@code Pezzo} su questa {@code Casella}.
     *
     * Può fallire se la casella non è vuota.
     *
     * @param p {@code Pezzo} il pezzo da posizionare
     * @return {@code boolean} {@code true} se l'operazioneha avuto successo, {@false altrimenti}.
     */
    public boolean setPezzo(Pezzo p) {
        if(isEmpty()) {
            pezzo = p;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Svuota questa {@code Cella} togliendo il {@code Pezzo} da essa.
     *
     */
    public void clearCell() {
        pezzo = null;
    }
    /**
     * Esiste o meno un {@code Pezzo} su questa {@Casella}.
     * @return
     */
    public boolean isEmpty() {
        try {
            if(null != this.getPezzo())
                return false;
        }

        catch (CasellaVuotaException e) {
            return true;
        }
        finally {
            System.out.println("Eccezione non gestita in Casella.isEmpty()");
            return false;
        }
    }

    public Scacchiera getScacchiera() {return this.scacchiera;}
}
