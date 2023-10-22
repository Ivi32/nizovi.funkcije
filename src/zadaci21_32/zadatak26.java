package zadaci21_32;

public class zadatak26 {
    public static void main(String[] args) {
        //Napisati funkciju koji za zadat ugao u radijanima racuna zbir sinusa, kosinusa, tangensa i kotangensa tog ugla.
        System.out.println(zbir(0.64));
    }

    static double zbir(double  ugao){
        return Math.sin(ugao) + Math.cos(ugao) + Math.tan(ugao) + 1/Math.tan(ugao);
    }
}
