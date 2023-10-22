package zadaci1_10;

import java.util.Scanner;

public class zadatak1 {
    static void nizUnazad(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }
    public static void main(String[] args) {

        //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
        //Primer: [4, 2, 3, 5] -> 5 3 2 4
        //b) Napraviti funkciju koja ispisuje dat niz u obrnutom redosledu.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite 6 brojeva.");
        int n = 6;
        int[] niz = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Unesi broj.");
            niz[i] = sc.nextInt();
        }

        //for (int i = n-1; i >= 0 ; i--) {
           //System.out.print(niz[i] + " ");
        //}
        nizUnazad(niz);
    }
}
