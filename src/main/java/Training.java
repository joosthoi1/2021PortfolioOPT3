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
}
