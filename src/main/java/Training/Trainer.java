package Training;

import Oefening.Oefening;
import Oefening.OefeningStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
    private String name;
    private String club;
    private Training training;
    private boolean adminStatus;


    public Training getTraining() {
        return training;
    }

    public Trainer(String name, String club, boolean adminStatus) {
        this.name = name;
        this.club = club;
        this.adminStatus = adminStatus;
    }
    public void makeTraining() {
        this.training = new Training(new ArrayList<>());
        TrainingMenu menu = new TrainingMenu(this);

        this.training = menu.getMenu();
    }


    public String getClub() {
        return this.club;
    }

    public boolean getAdminStatus() {
        return this.adminStatus;
    }
}
