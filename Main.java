package Main;
import Output.Output;
import JahresStatistik.JahresStatistik;

public class Main {
    public static void main(String[] args) {

        JahresStatistik.befuellen();

        Output.ausgeben();

        JahresStatistik.berechneLimitUeberschreitung(80);

        Output.ausgabeLimitUeberschreitung();
    }
} //abstrakte ; Interfaces noch