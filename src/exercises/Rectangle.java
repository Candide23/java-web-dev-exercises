package exercises;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your length");
        int l = input.nextInt();
        System.out.print("Enter your width");
        int w = input.nextInt();

        int areaOfRectangle = l*w;

        System.out.println("The area of rectangle is: " + areaOfRectangle);
    }

}
