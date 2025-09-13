package abstraction.musicalinstruments;

public class MusicalInstruments {
    public static void main(String[] args) {

        Instruments guitar = new Guitar();
        guitar.play();
        guitar.tune();

        Instruments piano = new Piano();
        piano.play();
        piano.tune();
    }
}
