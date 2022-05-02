package exercises;

import java.util.Scanner;

public class Gallons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Hom many miles did you drive");
        int miles = input.nextInt();
        System.out.print("How much gas did you use during this travel ?:");
        int gas = input.nextInt();

        int gallonPerMiles = miles/gas;

        System.out.println("You use: " + gallonPerMiles + " MPG"  );
    }
}
