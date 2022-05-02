package Technology;

import java.util.Scanner;

public class SmartPhone extends Computer{

    //Scanner input = new Scanner(System.in);

    private double autonomy;

    public SmartPhone(String aBrandName, double aMemory, double aWeigth, double autonomy) {
        super(aBrandName, aMemory, aWeigth);

        this.autonomy = autonomy;
    }

    public void time(double autonomy) {

        //System.out.println("Enter your hour ");

        //autonomy = input.nextDouble();

        if(autonomy > 10){
            System.out.println("You have a good battery ");
        }

    }
}
