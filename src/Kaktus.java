public class Kaktus extends Växt{

    private final double vätskaPerDag;

    public Kaktus(String namn, double höjd, double vätskaPerDag) {
        super(namn, höjd);
        this.vätskaPerDag = vätskaPerDag;
    }

    @Override
    public double räknaVätska() {     // ärvda metoder från klassen växt, (polymorfism)
        return vätskaPerDag;
    }

    @Override
    public String typAvVätska(){     // ärvda metoder från klassen växt, (polymorfism)
        return "Mineral vatten";
    }
}
