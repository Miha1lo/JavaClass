package ua.ithillel.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < GlobalRating.data.length; i++) {
            System.out.print(GlobalRating.data[i].category + ":");
            System.out.println(Arrays.toString(GlobalRating.data[i].statistic));
        }
    }
}
