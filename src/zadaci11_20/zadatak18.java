package zadaci11_20;

import java.util.Scanner;

public class zadatak18 {
    static int[] pravimNoviNiz(int[] niz){
        int duzinaNiza = 0;
        if( niz.length % 2 == 0)
            duzinaNiza = niz.length/2;
        else
            duzinaNiza = niz.length/2 + 1;


        int[] prvaPolovina = new int[duzinaNiza];
        for (int i = 0; i < prvaPolovina.length; i++) {
            prvaPolovina[i] = niz[i];
        }
         int[] drugaPolovina = new int[duzinaNiza];

        int pomeranjeNiza = 0;
        if (niz.length % 2 == 0)
            pomeranjeNiza = duzinaNiza;
        else
            pomeranjeNiza = duzinaNiza-1;


        for (int i = 0; i < drugaPolovina.length; i++) {
            drugaPolovina[i] = niz [i + pomeranjeNiza];
        }

        int[] noviNiz = new int[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            noviNiz[i] = prvaPolovina[i] + drugaPolovina[i];
        }
        return noviNiz;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja deli proslednjen niz na dva jednaka dela i onda ih sabira element po element.
        //Npr:
        //[1, 2, 3, 4, 5, 6] -> [1, 2, 3] + [4, 5, 6] -> [5, 7, 9]
        //[1, 2, 3, 4, 5] -> [1, 2, 3] + [3, 4, 5] -> [4, 6, 8]
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko elemenata unosite? ");
        int n = sc.nextInt();
        int[] niz = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            niz[i] = sc.nextInt();
        }
        int[] noviNiz = pravimNoviNiz(niz);
        for (int element:noviNiz) {
            System.out.println(element);
        }
    }
}
