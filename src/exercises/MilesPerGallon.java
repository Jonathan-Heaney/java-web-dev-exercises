package exercises;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed?");
        Double gallonsOfGas = input.nextDouble();

        Double milesPerGallon = milesDriven / gallonsOfGas;
        System.out.println("Your car gets " + milesPerGallon + " miles per gallon.");
    }

}
