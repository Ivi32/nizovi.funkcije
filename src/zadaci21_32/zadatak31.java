package zadaci21_32;

public class zadatak31 {
    public static void main(String[] args) {
        //Napisati funkciju koja za zadati niz celih brojeva i neki zadati ceo broj n vraca niz tih brojeva iz kojeg je uklanjeno svako
        //     pojavljivanje tog broja n, ako:
        //a)U zadatom nizu nema duplikata
        //b)U zadatom nizu moze biti duplikata

        int[]  nizBezPonavljanja = {1,2,3,3,3,4,5,6,7};
        int brojZaUklanjanjeN = 3;
            int[] nizBezBojaN = ukloniBrojNizNiza(nizBezPonavljanja,brojZaUklanjanjeN);

            for(int i = 0; i < nizBezBojaN.length; i++){
                 System.out.println(nizBezBojaN[i]);
            }
        }



       static int[] ukloniBrojNizNiza(int[] niz, int n) {

        int brojPonavanja = 0;

            for(int i = 0; i < niz.length; i++){
                if(niz[i]==n) {
                 brojPonavanja++;
                }
            }

            int[] nizBezPonavanja = new int[niz.length - brojPonavanja];
            int brojac = 0;
            for(int i = 0; i < niz.length; i++){
                if(niz[i]!=n) {
                 nizBezPonavanja[brojac] = niz[i];
                 brojac++;
                }

            }
            return nizBezPonavanja;
        }
}
