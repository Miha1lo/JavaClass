package ua.ithillel.java;

public class GlobalRating {

    static Score[] data;

    static {
        data = new Score[4];

        Score s1 = new Score();
        s1.category = "views";
        data[0] = s1;

        Score s2 = new Score();
        s2.category = "actions";
        data[1] = s2;

        Score s3 = new Score();
        s3.category = "sharings";
        data[2] = s3;

        Score s4 = new Score();
        s4.category = "buying";
        data[3] = s4;
    }
}