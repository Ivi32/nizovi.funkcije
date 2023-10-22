package zadaci11_20;

import java.util.Scanner;

public class zadatak16 {
    static double prosecnaVrednostNiza(double[] niz){
        double suma = 0;

        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
        }
        double prosecnaVrednost = suma/niz.length;
        return prosecnaVrednost;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja racuna prosecnu vrednost double[] niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko elemenata unosite? ");
        int n = sc.nextInt();
        double[] niz = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj. ");
            niz[i] = sc.nextDouble();
        }
        double prosecnaVrednostNiza = prosecnaVrednostNiza(niz);
        System.out.println("Prosecna vrednost niza je: " + prosecnaVrednostNiza);
    }
}
