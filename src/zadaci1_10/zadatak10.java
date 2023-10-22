package zadaci1_10;

public class zadatak10 {

    static int najmanjiElement(int[] niz){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if( niz[i] < min )
                min = niz[i];
        }
        return min ;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja vraca najmanji element niza.
        int[] niz = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int min = najmanjiElement(niz);
        System.out.println(min);
    }
}
