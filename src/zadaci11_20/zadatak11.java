package zadaci11_20;

public class zadatak11 {
    static int[] duplikati(int[] x){
        int[] novi = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            novi[i] = 2*x[i];
        }
        return novi;
    }
    public static void main(String[] args) {
        //Napisati funkciju koja duplira sve elemente niza.
        //Primer: [1, 2, 3, 4, 5] -> [2, 4, 6, 8, 10]
        int[] niz = { 1, 2, 3, 4, 5 };
        int[] duplirano =duplikati(niz);
        for (int e:duplirano) {
            System.out.print(e + " ");
        }
    }
}
