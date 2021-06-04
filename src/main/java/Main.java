import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Training training = new Training(new ArrayList<Oefening>());

        training.addOefening(new ConditieOefening(6, "shuttles", 100));
        training.addOefening(new ConditieOefening(10, "push-ups", 50));
        training.addOefening(new HockeyOefening(20, "Verleggen", "Pasing"));
        training.addOefening(new HockeyOefening(20, "Driehoekspel", "Drijven"));

        System.out.print("De trainings tijd is ");
        System.out.print(training.voldoendeTijd());
        System.out.println();
        System.out.println();

        training.krijgAdvies();

        training.addOefening(new HockeyOefening(20, "Partij", "Inzicht"));
        System.out.print("De trainings tijd is ");
        System.out.print(training.voldoendeTijd());
        System.out.println();
        System.out.println();


        training.displayTrainingOefeningen();
    }
}
