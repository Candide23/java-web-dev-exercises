package Technology;

import java.util.Scanner;

public class Laptop extends Computer{

    //Scanner input = new Scanner(System.in);

    private String color;

    public Laptop(String aBrandName, double aMemory, double aWeigth,String aColor) {
        super(aBrandName, aMemory, aWeigth);
        this.color = aColor;
    }

    public void findColor(String color) {

        //System.out.println("Enter your color ");

        //color = input.nextLine();

        if(color != "black") {
            System.out.println("I don't really like that ");
        }
    }



}
