package zadaci11_20;

import java.util.Scanner;


public class zadatak14 {
    static int f(int[] niz){
        int max = niz[0];
        int min = niz[0];
        int[] c = new int[niz.length - 2];
        int brojacC =0;

        for (int i = 0; i < niz.length; i++) {
            if( niz[i] > max)
                 max = niz[i];
            if( niz[i] < min)
                min = niz[i];
        }

        for (int i = 0; i < niz.length; i++) {
            if( (niz[i] == max) || ( niz[i] == min))
                continue;
            else {
                c[brojacC] = niz[i];
                brojacC++;
            }
        }

        max = c[0];
        min = c[0];
        for (int i = 0; i < c.length; i++) {
            if( c[i] > max)
                max = c[i];
            if( c[i] < min)
                min = c[i] ;
        }
        return min + max;
    }

    public static void main(String[] args) {
        //Napisati funkciju koja vraca zbir drugog najmanjeg i drugog najveceg elementa niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko elemenata unosite? ");
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj.");
            niz[i] = sc.nextInt();
        }
        int zbir = f(niz);
        System.out.println(zbir);
    }
}
