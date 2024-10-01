public class KöttätandeVäxt extends Växt{ //ärver frå

    private final double basVätska;
    private final double tillskottPerMeter;


    public KöttätandeVäxt(String namn, double höjd, double basVätska, double tillskottPerMeter) {
        super(namn, höjd);
        this.basVätska = basVätska;
        this.tillskottPerMeter = tillskottPerMeter;
    }

    @Override
    public double räknaVätska() {     // ärvda metoder från klassen växt, (polymorfism)
        return basVätska + (tillskottPerMeter * getHöjd());
    }

    @Override
    public String typAvVätska() {    // ärvda metoder från klassen växt, (polymorfism)
        return "protein dryck";
    }
}
