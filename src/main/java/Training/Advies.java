package Training;

import java.util.ArrayList;

public final class Advies {
    private ArrayList<String> geveriefeerderClubs;
    private static Advies instance;

    private Advies() {
        this.geveriefeerderClubs = new ArrayList<String>();
    }

    public static Advies getInstance() {
        if (instance == null) {
            instance = new Advies();
        }
        return instance;
    }
    public void addClub (String club) {
        this.geveriefeerderClubs.add(club);
    }
    public boolean magAdviesKrijgen (boolean clubAccount, String club, boolean adminAccount) {
        boolean isVerified = this.geveriefeerderClubs.contains(club);

        return (clubAccount && isVerified) || adminAccount;
    }
    public boolean magAdviesKrijgen (Trainer account) {
        boolean clubAccount = account.getClub() != null;
        String club = account.getClub();
        boolean adminAccount = account.getAdminStatus();
        return magAdviesKrijgen(clubAccount,club,adminAccount);
    }

    /**
     * Returns a new Training.Suggestie object of a certain category
     *
     * @param teamLeeftijd 0 = A leeftijd, 1 = B leeftijd
     * @param klasse       0 = subtop, 1 = 1e klasse, 2 = 2e klasse
     * @param type         the type of suggestion
     * @param geslacht     0 = male, 1 = female
     */
    public Suggestie geefSuggestie (int teamLeeftijd, int klasse, String type, int geslacht) {
        return new Suggestie(1 + teamLeeftijd + klasse + geslacht);
    }
}