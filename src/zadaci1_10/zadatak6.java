package zadaci1_10;

import java.util.Scanner;

public class zadatak6 {
    static int izracunavanjeProizvoda(int x, int y, int z){
        return x*y*z;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja racuna proizvod 3 broja.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi tri broja: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int proizvod = izracunavanjeProizvoda(a,b,c);
        System.out.println(proizvod);


    }
}
