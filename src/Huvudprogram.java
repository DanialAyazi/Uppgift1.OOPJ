import javax.swing.*;

public class Huvudprogram {
    public Huvudprogram() {

        Växt[] växter = {
                new Kaktus("Igge", 0.2, 0.02),
                new Palm("Laura", 5, 0.5),
                new Palm("Olof", 1, 0.5),
                new KöttätandeVäxt("Meatloaf", 0.7, 0.1, 0.2),
        };

        Boolean växtHittad = false; // initaliserar växthittad till falsk, för att sedan sätta till sant om växt blir hittat. 

        String input = JOptionPane.showInputDialog("Vilken växt vill du ge vätska till?");


        for (Växt växt : växter) {
            if (växt.getNamn().equalsIgnoreCase(input)) {
                String meddelande = String.format("%s behöver %.2f liter %s \n per dag.",
                        växt.getNamn(), växt.räknaVätska(), växt.typAvVätska());
                JOptionPane.showMessageDialog(null, meddelande);
                växtHittad = true;
                break;
            }
        }

        if (!växtHittad) {
            JOptionPane.showMessageDialog(null, "Växten finns inte!");
        }
    }
        public static void main (String[]args){
            Huvudprogram huvudprogram = new Huvudprogram();
        }


}

