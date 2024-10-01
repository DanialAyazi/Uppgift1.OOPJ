public abstract class Växt implements Vätska{ // implementerar vätska

    private String namn;
    private double höjd;

    public Växt(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }

    public String getNamn() {
        return namn;
    }

    public double getHöjd(){
        return höjd;
    }

    public abstract double räknaVätska(); //  inplementerad metod från interfacet "vätska"

    public String typAvVätska() {
        return null;
    }



}
