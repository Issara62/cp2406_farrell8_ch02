/**
 * Created by jc320588 on 8/08/16.
 */
public class NauticalMiles {
    public static void main(String[] args){
        double KILOMETERS = 1.825;
        double MILES = 1.150779;
        int nauticalMiles = 4;

        System.out.print(nauticalMiles + " nautical miles is " + (nauticalMiles * KILOMETERS) +
                " kilometers and " + String.format("%.2f", nauticalMiles * MILES) + " miles.");
    }
}
