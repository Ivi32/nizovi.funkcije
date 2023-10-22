package zadaci11_20;

public class zadatak13 {
    static int[] nadoveziNizove(int[] a, int[] b,  int[] x){
        int[] c = new int[a.length + b.length + x.length];

        for (int i = 0; i < a.length; i++) {
            c[i]  = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            c[i+a.length]  = b[i];
        }

        for (int i = 0; i < x.length; i++) {
            c[i+a.length+b.length]  = x[i];
        }

        return c;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja nadovezuje 2 niza, drugi na kraj prvog.
        //Primer: [1, 2, 3] [17, 20, -3, 14, 20] -> [1, 2, 3, 17, 20, -3, 14, 20]
        int[] a = { 1, 2, 3 };
        int[] b = { 17, 20, -3, 14, 20};
        int[] x = { 132, 120, -13, 114, 120};
        int[] c = nadoveziNizove( a, b , x);
        for (int element:c) {
            System.out.println(element);
        }
    }
}
