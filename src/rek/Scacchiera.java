package rek;

import rek.Pezzi.Pezzo;

import java.awt.*;

public class Scacchiera {

    Casella[][] griglia;
    // griglia[row][column];
    // griglia[X][Y];
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

    public Casella getCellAbove(Casella c) throws IndexOutOfBoundsException
    {
        if(c.getY() >= SIZE) throw new IndexOutOfBoundsException();
        return griglia[c.getX()][c.getY() + 1];
    }

    public Casella GetCellBelow(Casella c) throws IndexOutOfBoundsException {
        if(c.getY() == 0) throw new IndexOutOfBoundsException();
        return griglia[c.getX()][c.getY() - 1];
    }

    public Casella GetCellLeft(Casella c) throws IndexOutOfBoundsException {
        if(c.getX() == 0) throw new IndexOutOfBoundsException();
        return griglia[c.getX() - 1][c.getY()];
    }

    public Casella GetCellRight(Casella c) throws  IndexOutOfBoundsException {
        if(c.getX() >= SIZE) throw new IndexOutOfBoundsException();
        return griglia[c.getX() + 1][c.getY()];
    }
}
