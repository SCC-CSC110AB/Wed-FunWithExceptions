package wed.funwithexceptions;

import java.util.Scanner;

/**
 *
 * @author john
 */
public class WedFunWithExceptions {

    public static int MIN_CELSIUS_VALUE = -40;
    public static int MAX_CELSIUS_VALUE = 50;
    public static int MIN_FAHRENHEIT_VALUE = -40;
    public static int MAX_FAHRENHEIT_VALUE = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        boolean isUserInputValid = false;
        int temperatureValue;
        String temperatureUnit;

        do {
            System.out.println(
                    "Please enter in a temperature value: (e.g. 20 C): "
            );

            try {
                temperatureValue = stdin.nextInt();
                temperatureUnit = stdin.nextLine();
                temperatureUnit = temperatureUnit.trim();

//            String mahString = "   mah string    ";
//            mahString = mahString.trim(); // mahString == "mah string"
                if (temperatureUnit.equalsIgnoreCase("c")) {
                    if (temperatureValue >= MIN_CELSIUS_VALUE
                            && temperatureValue <= MAX_CELSIUS_VALUE) {
                        isUserInputValid = true;
                    } else {
                        System.out.println("Invalid temperature value");
                    }
                } else if (temperatureUnit.equalsIgnoreCase("f")) {
                    if (temperatureValue >= MIN_FAHRENHEIT_VALUE
                            && temperatureValue <= MAX_FAHRENHEIT_VALUE) {
                        isUserInputValid = true;
                    } else {
                        System.out.println("Invalid temperature value");
                    }
                } else {
                    System.out.println("Invalid temperature unit");
                }
            } catch (Exception justABadThing) {
                System.out.println(
                    "Just everything is wrong with what you gave me"
                );
                stdin.nextLine();
            }

        } while (!isUserInputValid);
    }

}
