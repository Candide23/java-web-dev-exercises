package ControlFlowCollections;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       int[]a = {1,1,2,3,5,8};

        System.out.print("Enter your number: ");
        int b = input.nextInt();

       for(int i = 0; i <a.length;i++) {
           if(a[i]%b==0){
               System.out.println("is even number");
           }else{
               System.out.println("is odd number");
           }
       }
    }
}
