package zadaci1_10;

import java.util.Scanner;

public class zadatak5 {
    static int proizvodClanovaNiza(int[] x){
        int proizvodClanova = 1;
        for (int i = 0; i < x.length; i++) {
            proizvodClanova *= x[i];
        }
        return proizvodClanova;
    }
    public static void main(String[] args) {
    //-//-. Izracunati proizvod elemenata tog niza.
        //Primer: [2, 4] -> 8
        //b) Napisati funkciju koja racuna proizvod elemenata zadatog niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva unosite? ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        int proizvod = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj.");
            niz[i] = sc.nextInt();
            //proizvod *= niz[i];
        }
        proizvod = proizvodClanovaNiza(niz);
        System.out.println("Proizvod: " + proizvod);
    }
}
