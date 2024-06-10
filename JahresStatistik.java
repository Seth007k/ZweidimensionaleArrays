package JahresStatistik;
import MonatsVerbrauch.MonatsVerbrauch;
import java.util.ArrayList;
import java.util.Random;

public class JahresStatistik {
    private static int zeile = 4;
    private static int spalte = 14;
    private static int verbraucherNr = 1001;
    public static int[][] jahresStatistik = new int[zeile][spalte];
    private static Random zufallsWert = new Random();
    public static ArrayList<MonatsVerbrauch> limitUeberschritten = new ArrayList();
    public static void befuellen() {


        for (int i = 0; i < jahresStatistik.length; i++) {
            for (int j = 0; j < jahresStatistik[i].length; j++) {
                if (jahresStatistik[i][0] == 0) {
                    jahresStatistik[i][0] = verbraucherNr;
                    verbraucherNr++;
                } else {
                    jahresStatistik[i][j] = zufallsWert.nextInt(101);     //
                }
            }
        }
    }
    public static void berechneLimitUeberschreitung(int limit){
        int kleinsterWert = jahresStatistik[0][2];
        int groessterWert = jahresStatistik[0][2];


        for (int i = 0; i < jahresStatistik.length; i++) {
            for (int j = 2; j < jahresStatistik[i].length; j++) {
                if(jahresStatistik[i][j] > limit){
                    limitUeberschritten.add(new MonatsVerbrauch(jahresStatistik[i][0],j,jahresStatistik[i][j]));
                }
                if (jahresStatistik[i][j] < kleinsterWert) {
                    kleinsterWert = jahresStatistik[i][j];
                }
                if(jahresStatistik[i][j] > groessterWert){
                    groessterWert = jahresStatistik[i][j];
                }
            }
        }
    }

}


