package ControlFlowCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {


        ArrayList <Integer> evenNumber = new ArrayList<>();
        ArrayList <String> listWord = new ArrayList<>();


        evenNumber.add(12);
        evenNumber.add(13);
        evenNumber.add(14);
        evenNumber.add(16);
        evenNumber.add(17);

        listWord.add("candy");
        listWord.add("cham");
        word(listWord);


        System.out.println(numbers(evenNumber) + " is even");



    }

    public static int  numbers(  ArrayList <Integer> evenNumber) {

        int sum = 0;
     for(int i = 0; i < evenNumber.size();i++ ) {
         if(evenNumber.get(i)%2 == 0){
             sum = sum+evenNumber.get(i);
         }

     }
        return sum;
    }

    public static void word( ArrayList <String> listWord) {

        for(int i = 0; i < listWord.size(); i++) {
            if(listWord.get(i).length() == 5){
                System.out.println(listWord.get(i));
            }
        }

    }

}
