package Training;

import Oefening.Oefening;

import java.util.ArrayList;

public class Training {
    private ArrayList<Oefening> oefeningen;

    public Training(ArrayList<Oefening> oefeningen) {
        this.oefeningen = oefeningen;
    }

    public String voldoendeTijd() {
        int trainingsDuur = 0;
        for (Oefening oefening:
             this.oefeningen) {
            trainingsDuur += oefening.getOefeningTijd();
        }
        if (trainingsDuur >= 90) {
            return "lang";
        }
        else if (trainingsDuur < 75) {
            return "kort";
        }
        return "goed";
    }

    public ArrayList<Oefening> getOefeningen() {
        return oefeningen;
    }

    public void displayTrainingOefeningen() {
        for (Oefening oefening:
             this.oefeningen) {
            System.out.println(oefening.displayDetails());
            System.out.println();
        }
    }

    public void addOefening(Oefening oefening){
        this.oefeningen.add(oefening);
    }
}
