package Technology;

import java.util.Scanner;

public class Computer {

    Scanner input = new Scanner(System.in);

    private String brandName;
    private double memory;
    private double weight;

    public Computer(String aBrandName, double aMemory, double aWeigth) {
        super();
        this.brandName = aBrandName;
        this.memory = aMemory;
        this.weight = aWeigth;
    }

   public void goodComputer(double memory){

       //System.out.println("Enter your number ");

       //memory = input.nextDouble();


       if(memory >=16){
           System.out.println("is a good computer");
        }else {
            System.out.println("You need to invest to a good computer");
        }
   }

   public void findBrand(double weight) {

       //System.out.println("Enter your number ");

       weight = input.nextDouble();
        if(weight <=10 ) {
            System.out.println("I guess that it's Desk computer");
        }
   }




}
