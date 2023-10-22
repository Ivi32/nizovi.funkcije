package zadaci11_20;

import java.util.Scanner;

public class zadatak17 {
    static boolean proveraImena(String[] niz){
        boolean ime = false;
        for (int i = 0; i < niz.length; i++) {
            if((niz[i].equals("Marija")) || (niz[i].equals("Petar")))
                ime = true;
        }
        return ime;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko elemenata unosite? ");
        int n = sc.nextInt();
        String[] niz = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime. " );
            niz[i] = sc.next();
        }
        boolean daLiImaImena = proveraImena(niz);
        if(daLiImaImena)
            System.out.println("da");
        else
            System.out.println("ne");
    }
}
