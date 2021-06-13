package Run;

import Training.Trainer;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("joost", "GMHC", false);
        trainer.makeTraining();
    }
}
