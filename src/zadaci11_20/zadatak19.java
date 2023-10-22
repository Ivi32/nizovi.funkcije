package zadaci11_20;

public class zadatak19 {
    static void saberiNizove(int[] n, int[] k){

        if(n.length == k.length) {
            int[] noviNiz = new int[n.length];
            for (int i = 0; i < k.length ; i++) {
                noviNiz[i] = n[i] + k[i];
            }
            for (int element:noviNiz) {
                System.out.println(element);
            }
        }
        else if(n.length > k.length){
            int[] noviNiz = new int[n.length];
            for (int i = 0; i < n.length; i++) {
                if(i<k.length){
                    noviNiz[i] = n[i] + k[i];
                    continue;
                }
                noviNiz[i] = n[i];
            }
            for (int element:noviNiz) {
                System.out.println(element);
            }
        }
        else if(k.length > n.length){
            int[] noviNiz = new int[k.length];
            for (int i = 0; i < k.length; i++) {
                if(i<n.length){
                    noviNiz[i] = n[i] + k[i];
                    continue;
                }
                noviNiz[i] = k[i];
            }
            for (int element:noviNiz) {
                System.out.println(element);

            }
        }
    }
    public static void main(String[] args) {
        //Napisati funkciju koja sabira dva niza proizvoljne duzine.
        //Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]

        int[] n = { 1, 2, 3 };
        int[] k = { 1, 2, 3, 4, 5 };
        saberiNizove( n, k );
    }
}