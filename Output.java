package Output;
import MonatsVerbrauch.MonatsVerbrauch;
import static JahresStatistik.JahresStatistik.jahresStatistik;
import static JahresStatistik.JahresStatistik.limitUeberschritten;

public class Output {

    public static void ausgeben(){
        for (int i = 0; i < jahresStatistik.length; i++) {
            for (int j = 0; j < jahresStatistik[i].length; j++) {
                System.out.print(jahresStatistik[i][j] + " " );
            }
            System.out.println(" ");
        }

    }

    public static void ausgabeLimitUeberschreitung(){
        for (MonatsVerbrauch verbrauch : limitUeberschritten) {
            System.out.println("Verbrauchernummer: " + verbrauch.getVerbraucherNr());
            System.out.println("Monat: " + verbrauch.getMonat());
            System.out.println("Verbrauch: " + verbrauch.getVerbrauch());
        }

    }
}
