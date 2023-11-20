public class interface2 {
    public static void main(String[] args) {
        // Creating an object of the class that implements both interfaces
        Piano myPiano = new Piano();

        // Calling methods from both interfaces
        myPiano.play();  // Method from PlayableInstrument interface
        myPiano.tune();  // Method from TunableInstrument interface
    }
}
interface PlayableInstrument {
    void play();
}

// Second interface
interface TunableInstrument {
    void tune();
}

// Class implementing both interfaces
class Piano implements PlayableInstrument, TunableInstrument {
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the piano");
    }
}