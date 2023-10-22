package zadaci21_32;

public class zadatak22_2 {
    public static void main(String[] args) {
        int[] x = {1,2,3,7,8,5};
        boolean b = strogoMonotonNiz(x);
        System.out.println(b);
    }

    public static boolean strogoMonotonNiz(int[] niz) {
        boolean flag = true;

        for (int i = 0; i < niz.length - 1; i++) {
            if ((niz[i] >= niz[i + 1]) || (niz[i] <= niz[i + 1])) //dodati jednako kod oba uslova za zadatak kad je monoton
            {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
