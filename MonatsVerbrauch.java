package MonatsVerbrauch;
public class MonatsVerbrauch {
    int verbraucherNr;
    int monat;
    int verbrauch;
    public MonatsVerbrauch(int verbraucherNr, int monat, int verbrauch) {
        this.verbraucherNr = verbraucherNr;
        this.monat = monat;
        this.verbrauch = verbrauch;
    }

    public int getVerbraucherNr() {
        return verbraucherNr;
    }
    public int getMonat() {
        return monat;
    }
    public int getVerbrauch() {
        return verbrauch;
    }

}
