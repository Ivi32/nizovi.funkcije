package zadaci1_10;

public class zadatak7 {
    static void neparniBrojevi(int[] niz){
        for (int i = 0; i <niz.length ; i++) {
            if( niz[i] % 2 != 0)
                System.out.println(niz[i]);
        }
    }
    public static void main(String[] args) {
        //Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza.
        int[] niz = { 21, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        neparniBrojevi(niz);
    }
}
