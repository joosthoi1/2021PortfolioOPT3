package Oefening;

import java.util.ArrayList;
import java.util.Scanner;

public class OefeningStore {
    private static ArrayList<Oefening> oefeningen = new ArrayList<>();

    private static void addOefeningen() {
        OefeningStore.oefeningen.add(new ConditieOefening(6, "shuttles",2, 100));
        OefeningStore.oefeningen.add(new ConditieOefening(10, "push-ups",2, 50));
        OefeningStore.oefeningen.add(new HockeyOefening(20, "Verleggen", 2,"Pasing"));
        OefeningStore.oefeningen.add(new HockeyOefening(20, "Driehoekspel", 2,"Drijven"));
    }
    public static ArrayList<Oefening> getOefeningen() {
        if (OefeningStore.oefeningen.isEmpty()) {
            OefeningStore.addOefeningen();
        }
        return OefeningStore.oefeningen;
    }
    public static Oefening selectMenu(ArrayList<Oefening> x) {


        Scanner scanner = new Scanner(System.in);
        int i;
        for (i=0; i < x.size(); i++) {
            System.out.println("----------");
            System.out.println(i + 1);
            System.out.println(x.get(i).displayDetails());
        }
        System.out.println("----------");
        System.out.println(i + 1);
        System.out.println("Exit");
        System.out.println("----------");

        System.out.println("Selecteer een oefening om toe te voegen");
        int oefeningIndex = scanner.nextInt();
        scanner.nextLine();

        if (oefeningIndex <= x.size()) {
            return x.get(oefeningIndex-1);
        }
        return null;
    }
}
