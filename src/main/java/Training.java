import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

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

    public void krijgAdvies() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Team leeftijd?");
        int leeftijd = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Welke klasse speelt het team?");
        int klasse = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Wat is het type suggestie?");
        String type = scanner.nextLine();
        System.out.println("Is het een mannen of vrouwen team?");
        int geslacht = scanner.nextInt();
        scanner.nextLine();

        Suggestie suggestie = Advies.getInstance().geefSuggestie(leeftijd,klasse,type,geslacht);
        System.out.println(suggestie.getCategorie());
    }

    public void displayTrainingOefeningen() {
        for (Oefening oefening:
             this.oefeningen) {
            System.out.println(oefening.displayDetails());
        }
    }
}
