package ControlFlowCollections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPart3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String arrayName = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String strArray []= arrayName.split("\\.");

        String sentence = "";

        for(int i =0; i < sentence.length();i++) {
            sentence +=".";
        }
        System.out.println(Arrays.toString(strArray));
    }


    }

