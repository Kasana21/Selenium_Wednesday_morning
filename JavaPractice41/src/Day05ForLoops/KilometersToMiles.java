package Day05ForLoops;

public class KilometersToMiles {
    public static void main(String[] args) {
    /*
    Print KPH & MPH conversion table like you see on the right side.
Your friend Mike Smith just rented a European sports car. Mike lives in the USA, and he is afraid he will get a speeding ticket because the car’s speedometer indicates kilometers per hour (KPH). He has asked you to write a program that displays a table of speeds in kilometers per hour with their values converted to miles per hour (MPH) (1 mile = 0.62 kilometer).
The table that your program displays should show speeds from 20 kilometers per hour thru 140 kilometers per hour, in increments of 10, along with their values converted to miles per hour.

KPH    MPH
-------------
20     12
30     18
40     24
50     31
60     37
70     43
80     49
90     55
100    62
110    68
120    74
130    80
140    86
     */
        System.out.println("KPH\t\tMPH");
        System.out.println("--------------");

        for (int i = 20; i <141 ; i+=10) {
            System.out.println(i+"\t\t"+(i*62/100));
        }
    }
}
