/**
 * Created by jc320588 on 8/08/16.
 */

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        double KILOMETERS = 1.825;
        double MILES = 1.150779;
        double length;
        String lengthString;

        lengthString = JOptionPane.showInputDialog(null, "Enter your nautical miles", "Nautical Miles",
                JOptionPane.INFORMATION_MESSAGE);

        length = Double.parseDouble(lengthString);
        JOptionPane.showMessageDialog(null,lengthString + " nautical miles is " + (length * KILOMETERS) +
                " kilometers and " + String.format("%.2f", length * MILES) + " miles.");





    }

}
