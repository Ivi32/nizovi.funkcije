package zadaci1_10;

public class zadatak9 {
    static int najveciElement(int[] niz){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < niz.length; i++) {
            if( niz[i] > max )
                max = niz[i];
        }
        return max;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja vraca najveci element niza.
        int[] niz = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int max = najveciElement(niz);
        System.out.println(max);
    }
}
