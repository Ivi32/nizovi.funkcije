package zadaci1_10;

import java.util.Scanner;

public class zadatak3 {
    static int racunanjeSume(int[] x){
        int suma = 0;
        for (int i = 0; i <x.length; i++) {
            suma += x[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        //Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Izracunati sumu tog niza.
        //Primer: [1, 2, 3, 4, 5] -> 15 (1 + 2 + 3 + 4 + 5 = 15)
        //b) Napraviti funkciju koja vraca sumu prosledjenog niza.
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko brojeva unosite? ");
        int n = sc.nextInt();
        int[] niz = new int[n];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesi broj.");
            niz[i] = sc.nextInt();
            //suma += niz[i];
        }
        suma = racunanjeSume(niz);
        System.out.println("Suma niza: " + suma);
    }
}
