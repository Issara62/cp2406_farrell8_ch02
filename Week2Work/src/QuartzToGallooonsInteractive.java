/**
 * Created by jc320588 on 8/08/16.
 */
import javax.swing.JOptionPane;
public class QuartzToGallooonsInteractive {
    public static void main(String[] args) {
        double QuartsInGalons = 4;
        double PaintJob;
        String PaintJobString;

        PaintJobString = JOptionPane.showInputDialog(null, "Enter your nautical miles", "Nautical Miles",
                JOptionPane.INFORMATION_MESSAGE);

        PaintJob = Double.parseDouble(PaintJobString);

        JOptionPane.showMessageDialog(null, PaintJob + " quarts of paint requires " + (PaintJob / QuartsInGalons) +
                " gallons of paint and "+ (PaintJob % QuartsInGalons) + " quarts");
    }
}
