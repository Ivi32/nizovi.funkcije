public class zadatak32 {
    public static void main(String[] args) {
        //Napisati funkciju koja za zadati niz celih brojeva vraca taj niz zarotiran za 2 mesta udesno
        //    Npr:
        //    [1, 2, 3, 4, 5] -> [4, 5, 1, 2, 3]
        int[] x = {1, 2, 3, 4, 5};
        int[] y = noviNiz(x);
        for (int e : y) {
            System.out.println(e);
        }
    }

    static int[] noviNiz(int[] niz) {
        int[] zadnjaDva = {niz[niz.length - 2], niz[niz.length - 1]};
        int[] ostatakNiza =new int[niz.length-2];
        for (int i = 0; i < ostatakNiza.length; i++) {
            ostatakNiza[i] = niz[i];
        }

        int index =0;
        int[] zarotiran = new int[niz.length];
        for (int i = 0; i < zarotiran.length; i++) {
            if(i<2)
                zarotiran[i] = zadnjaDva[i];
            else {
                zarotiran[i] = ostatakNiza[index];
                index++;
            }

        }
        return zarotiran;
    }
}