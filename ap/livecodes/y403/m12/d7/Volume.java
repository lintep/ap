package ap.livecodes.y403.m12.d7;

import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        // Read price per pack

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the price for a six-pack: ");
        double packPrice = in.nextDouble();

        System.out.print("Please enter the price for a two-liter bottle: ");
        double bottlePrice = in.nextDouble();

        final double CANS_PER_PACK = 6;
        final double CAN_VOLUME = 0.355; // 12 oz. = 0.355 l
        final double BOTTLE_VOLUME = 2;

        // Compute and print price per liter

        double packPricePerLiter = packPrice / (CANS_PER_PACK * CAN_VOLUME);
        double bottlePricePerLiter = bottlePrice / BOTTLE_VOLUME;

        System.out.printf("Pack price per liter: %8.2f", packPricePerLiter);
        System.out.println();

        System.out.printf("Bottle price per liter: %8.2f", bottlePricePerLiter);
        System.out.println();

        System.out.println(bottlePricePerLiter);
    }
}
