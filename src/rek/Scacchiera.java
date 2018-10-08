package rek;

import rek.Pezzi.Pezzo;

public class Scacchiera {

    Casella[][] griglia;
    // griglia[row][column];
    /*
    | T | C | A | Q | K | A | C | T |
    ...
    | T | C | A | Q | K | A | C | T |
     */
    private static final int SIZE = 8;


    public Scacchiera() {
        griglia = new Casella[SIZE][SIZE];


    }

    /**
     * Restituisce la {@Casella} cui {@code Pezzo} appartiene.
     *
     *
     * @param p {@code Pezzo} il pezzo da cercare.
     * @return {@code Casella} casella in cui si trova {@code Pezzo}
     * @throws PezzoMangiatoException
     */
    public Casella getPos (Pezzo p) throws PezzoMangiatoException {
        for(Casella[] row : griglia) {
            for (Casella c : row) {
                try {
                    if (c.getPezzo() == p) return c;
                }
                catch (CasellaVuotaException e) {
                    // do nothing
                }
            }
        }
        throw new PezzoMangiatoException();
    }
}
