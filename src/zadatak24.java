public class zadatak24 {
    public static void main(String[] args) {
        //Napisati funkciju koja vraca konvertovani zadati iznos
        // zadate valute u neku drugu zadatu valutu, ako su moguce valute i njihovi kursevi zadati kao:
        //EUR = 117.26 RSD
        //USD = 107.79 RSD
        //JPY = 0.81 RSD
        //pod uslovom da su prodajni i kupovni kursevi isti.
        //Npr:
        //"EUR", "RSD", 10 -> 1172.6
        //"EUR", "JPY", 100 -> 14476.54
        //"USD", "USD", 0.26 -> 0.26
        System.out.println(euroToRsd(10));
        System.out.println(rsdToJpy(euroToRsd(100)));
        System.out.println(rsdToUsa(usdToRsd(0.26)));

    }


    static double euroToRsd(double iznos){
        return iznos * 117.26;
    }
    static double rsdToEuro(double iznos){
        return iznos / 117.26;
    }

    static double usdToRsd(double iznos){
        return iznos * 107.79;
    }

    static double rsdToUsa(double iznos){
        return iznos / 107.79;
    }

    static double jpyToRsd(double iznos){
        return iznos * 0.81;
    }

    static double rsdToJpy(double iznos){
        return iznos / 0.81;
    }
}
