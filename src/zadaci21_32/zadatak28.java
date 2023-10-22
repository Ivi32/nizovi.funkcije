package zadaci21_32;

public class zadatak28 {
    public static void main(String[] args) {
        //Napisati fuknciju koja vraca double duzinu stranice kvadrata za prosledjenu double povrsinu kvadrata.
        System.out.println(stranicaKvadrata(100));
    }
    static double stranicaKvadrata(double povrsina){
        return Math.sqrt(povrsina);
    }
}
