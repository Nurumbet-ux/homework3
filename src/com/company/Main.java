package com.company;

import java.util.Arrays;

public class Main {
    public static double temp;

    public static void main(String[] args) {
        double[] noreason = {3.2, 2.4, -1.2, 3.4, 5.6, -7.8, 9.4, -2.3, 4.7, -3.9, 1.9, -12.4, -45.6, 1.7, -8.1};
        for (int i = 0; i < noreason.length; i++) {

            for (int j = i + 1; j < noreason.length; j++) {



                if (noreason[i] > noreason[j]) {

                    temp = noreason[i];

                    noreason[i] = noreason[j];

                    noreason[j] = temp;

                }
            }
            System.out.println(i+1+") "+ temp );

        }

    }
}
