package zadaci11_20;

public class zadatak12 {
    static int[] f(int[] a, int[] b){
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja sabira 2 niza iste duzine element po element.
        // (Dakle prosledjujemo 2 niza, a vracamo taj novi niz)
        //Primer: [2, 4, 6] + [1, 4, 4]  -> [3, 8, 10]
        int[] a = { 2, 4, 6 };
        int[] b = { 1, 4, 4 };
        int[] sumNiz = f( a, b);

        for( int element:sumNiz){
            System.out.println(element);
        }
    }
}
