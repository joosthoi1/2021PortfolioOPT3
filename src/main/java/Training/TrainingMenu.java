package Training;

import Oefening.Oefening;
import Oefening.OefeningStore;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingMenu {
    Trainer trainer;
    Training training;
    public TrainingMenu(Trainer trainer) {
        this.trainer = trainer;
        this.training = trainer.getTraining();
    }

    public Training getMenu() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            System.out.println(
                    "1 Voeg oefening toe aan training\n" +
                            "2 Laat voorlopige training zien\n" +
                            "3 Laat suggestie oefeningen zien\n" +
                            "4 Geef weer hoe een oefening werkt\n" +
                            "5 exit\n" +
                            "Maak uw keuze\n"
            );
            int keuze = scanner.nextInt();
            scanner.nextLine();
            switch (keuze) {
                case 1:
                    this.addOefening();
                    break;
                case 2:
                    this.training.displayTrainingOefeningen();
                    break;
                case 3:
                    this.krijgAdvies();
                    break;
                case 4:
                    this.oefeningVoor();
                    break;
                case 5:
                    running = false;
                    break;
            }
        }
        return this.training;
    }
    private void oefeningVoor() {
        Oefening oefening = OefeningStore.selectMenu(this.training.getOefeningen());
        if (oefening != null) {
            oefening.doeOefeningVoor();
        }
        else {
            System.out.println("Geen oefening geselecteerd");
        }
    }
    private void addOefening() {
        Oefening oefening = OefeningStore.selectMenu(OefeningStore.getOefeningen());
        if (oefening != null) {
            this.training.addOefening(oefening);
        }
        else {
            System.out.println("Geen oefening geselecteerd");
        }
    }

    private void krijgAdvies() {
        if (Advies.getInstance().magAdviesKrijgen(this.trainer)) {
            System.out.println("Helaas is uw account niet bij een club geregistreerd die mee doet met het suggestie programma");
            return;
        }
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
        System.out.print("Training.Suggestie: Een oefening met categorie ");
        System.out.println(suggestie.getCategorie());

        ArrayList<Oefening> suggestieOefeningen = suggestie.getOefening();
        for (Oefening suggestieOefening:
                suggestieOefeningen) {
            System.out.println(suggestieOefening.displayDetails());
            System.out.println();
        }
        scanner.nextLine();
    }

}
