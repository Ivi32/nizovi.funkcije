package zadaci1_10;

public class zadatak8 {

    static void parniBrojevi(int[] niz){
        for (int i = 0; i <niz.length ; i++) {
            if( i % 2 == 0 && i != 0)
                System.out.println(niz[i]);
        }
    }
    public static void main(String[] args) {
        //Napisati funkciju koja ispisuje sve parne brojeve zadatog niza.
        int[] niz = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        parniBrojevi(niz);
    }
}
