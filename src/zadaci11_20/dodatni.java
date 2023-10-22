package zadaci11_20;

public class dodatni {
    static int[] kreirajNiz(int[] a, int[] b){
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[a[i]]= b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        //Napisati funkciju **int[] kreirajNiz** koja prima dva niza integera istih duzina a i b,
        // i vraca novi niz integera iste te duzine.
        //Element niza a na poziciji i predstavlja indeks u nizu kojeg treba vratiti
        // na koji treba smestiti broj koji se nalazi na poziciji i u nizu b.
        //Pretpostaviti da u nizu a nemaju elementi koji ukazuju na indekse van granica niza kojeg treba vratiti
        // kao i da nema ponavljanja elemenata u nizu a.
        //Pretpostaviti da su nizovi a i b barem jednoclani nizovi.
        //Npr
        //Input: [4, 3, 2, 1, 0], [-10, -20, -30, -40, -50]
        //Output: [-50, -40, -30, -20, -10]
        int[] a = { 4, 3, 2, 1, 0  };
        int[] b = { -10, -20, -30, -40, -50};
        int[] c = kreirajNiz( a, b );
        for (int element:c) {
            System.out.println(element);
        }

    }
}
