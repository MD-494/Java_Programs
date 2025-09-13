package Abstraction.MusicalInstruments;

/**
 * Guitar class implements the Instruments interface.
 */
public class Guitar implements Instruments {

    //Implementation of play method
    public void play() {
        System.out.println("Strumming the Guitar");
    }

    //Implementation of tune method
    public void tune() {
        System.out.println("Tuning the Guitar");
    }
}
