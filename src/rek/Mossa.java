package rek;

import rek.Pezzi.Pezzo;

public class Mossa extends Casella {
    public Mossa(Scacchiera s) {
        super(s);
    }

    public Mossa(Pezzo p, Scacchiera s) {
        super(p, s);
    }
}
