package ua.ithillel.java;

public class Score {

    String category;
    int[] statistic;

    {
        statistic = new int[10];
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = (int) (Math.random() * 10);
        }
    }


}
