public class Palm extends Växt{

    private final double vattenPerMeter;

    public Palm(String namn, double höjd, double vattenPerMeter) {
        super(namn, höjd);
        this.vattenPerMeter = vattenPerMeter;
    }

    @Override
    public double räknaVätska() { // ärvda metoder från klassen växt, (polymorfism)
        return getHöjd() * vattenPerMeter;
    }

    @Override
    public String typAvVätska() { // ärvda metoder från klassen växt, (polymorfism)
        return "Kran vatten";

    }

}
