package zadaci21_32;

import java.util.Random;

public class zadatak30 {
    public static void main(String[] args) {
        //Napisati funkciju koja vraca broj pokusaja koji su bili potrebni da javin nasumicni generator brojeva
        // pogodi zadati celi broj iz intervala [1, 100].


        System.out.println(rezultatMathRandom());
    }

    static int rezultatMathRandom(){
        double randomBroj;
        int brojac = 0;
        Random rand = new Random();

        do {
            brojac++;
            randomBroj = rand.nextDouble();
            System.out.println(randomBroj);
        } while (randomBroj >= 1 || randomBroj <=100);
        return brojac;
    }
}
