package zadaci1_10;

import java.util.Scanner;

public class zadatak2 {
        static void svakiDrugi(int[] x) {
        for (int i = 0; i < x.length; i += 2) {
            System.out.println(x[i]);
        }
    }
        public static void main (String[]args){

            //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
            //Primer: [1, 2, 3, 4, 5] -> 1 3 5
            //b) Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.
            Scanner sc = new Scanner(System.in);
            System.out.println("Koliko cete uneti brojeva?");
            int n = sc.nextInt();
            int[] niz = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Unesi broj.");
                niz[i] = sc.nextInt();
            }
            //for (int i = 0; i < n; i+=2) {
            //System.out.println(niz[i]);
            //}
            svakiDrugi(niz);
    }
}
