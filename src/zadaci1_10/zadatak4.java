package zadaci1_10;

import java.util.Scanner;

public class zadatak4 {
    static void unazadZaTri(int[] x){
        for (int i = x.length-1; i >= 0 ; i-=3) {
            System.out.print(x[i] + " ");
        }
    }
    public static void main(String[] args) {
        //-//-. Ispisati svaki treci element u obrnutom redosledu.
        //Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
        //b) Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);
        System.out.println("Koiko elemenata unosite? ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj.");
            niz[i] = sc.nextInt();
        }
        //for (int i = n-1; i >= 0 ; i-=3) {
            //System.out.print(niz[i] + " ");
        //}
        unazadZaTri(niz);

    }
}
