package ua.ithillel.java;

public class Score {

    String category;
    double[] statistic;

    {
        statistic = new double[10];
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = Math.random() * 10;
        }
    }


}
