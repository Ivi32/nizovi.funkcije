package zadaci21_32;

import java.util.Scanner;

public class zadatak25 {
    static double stepenRadijan(double stepen){
        final double PI = 3.14;
        return PI*stepen/180;
    }

    static double radijanStepen(double radijan) {
        final double PI = 3.14;
        return  radijan * 180/ PI;
    }


        public static void main(String[] args) {
        //a)Napisati funkciju koja konvertuje stepene u radijane.
        //b)Napisati funkciju koja konvertuje radijane u stepene.
        //(360 stepeni = 2*PI radijana)
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost u stepenima.");
        double stepen = sc.nextDouble();
        double radijan = stepenRadijan(stepen);
        System.out.println("Vrednost u radijanima je: " + radijan);
    }
}
