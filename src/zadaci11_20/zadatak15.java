package zadaci11_20;

import java.util.Scanner;

public class zadatak15 {
    static boolean staJeVece(int[] niz){
        int suma = 0;
        int proizvod = 1;
        boolean sumaJeVeca = false;
        for (int i = 0; i < niz.length; i++) {
            suma += niz[i];
            proizvod *= niz[i];
        }
        if ( suma > proizvod)
            sumaJeVeca = true;
        return sumaJeVeca;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja ispituje da li je suma niza veca od njegovog proizvoda.
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko elemenata unosite? ");
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            niz[i] = sc.nextInt();
        }

        boolean daLiJeSumaVeca = staJeVece(niz);
        System.out.println("Suma je veca od proizvoda: " + daLiJeSumaVeca);
    }
}
