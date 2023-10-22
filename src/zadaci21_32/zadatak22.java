package zadaci21_32;

public class zadatak22 {
    public static void main(String[] args) {
        //a) Napisati funkciju koja ispituje da li je niz monoton ili nije.
        // Niz je monoton ako je ili rastuci ili opadajuci ili konstantan, ali ne i rastuci i opadajuci.
        //b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije.
        // Niz je strogo monoton ako je iskljucivo rastuci ili iskljucivo  opadajuci i u nikojem delu nije konstantan (nema ponavljajucih elemenata)

        //int[] niz = {1,2,3,4,5};
        //int[] niz = {5,4,3,2,1};
        //int[] niz = {4,4,4,4,4};
        //int[] niz = {1,2,3,4,2,1};
        int[] niz = {1,2,3,4,5};
        System.out.println(monoton(niz));
        System.out.println(strogoMonoton(niz));

    }

    static boolean monoton(int[] niz){
        boolean rastuca = true;
        boolean opadajuci = true;
        boolean jednak = true;

        for (int i = 0; i < niz.length - 1; i++) {
            if ( niz[i] > niz[i+1]  ) {
                rastuca = false;
            }
            if ( niz[i] < niz[i+1] ) {
                opadajuci = false;
            }
            if ( niz[i] != niz[i+1] ) {
                jednak = false;
            }
        }

        if(rastuca || opadajuci || jednak)
            return true;
        else
            return false;
    }

    static boolean strogoMonoton(int[] niz){
        boolean rastuca = true;
        boolean opadajuci = true;


        for (int i = 0; i < niz.length - 1; i++) {
            if ( niz[i] >= niz[i+1] ) {
                rastuca = false;
            }
            if ( niz[i] <= niz[i+1] ) {
                opadajuci = false;
            }
        }

        if(rastuca || opadajuci)
            return true;
        else
            return false;
    }
}
