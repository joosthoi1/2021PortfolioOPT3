public class Advies {
    private String[] geveriefeerderClubs;

    public Advies(String[] geveriefeerderClubs) {
        this.geveriefeerderClubs = geveriefeerderClubs;
    }

    public boolean magAdviesKrijgen (boolean clubAccount, String club, boolean adminAccount) {
        return true;
    }

    /**
     * Returns a new Suggestie object of a certain category
     *
     * @param teamLeeftijd 0 = A leeftijd, 1 = B leeftijd
     * @param klasse       0 = subtop, 1 = 1e klasse, 2 = 2e klasse
     * @param type         the type of suggestion
     * @param geslacht     0 = male, 1 = female
     */
    public Suggestie geefSuggestie (int teamLeeftijd, int klasse, String type, int geslacht) {
        return new Suggestie(0);
    }
}
