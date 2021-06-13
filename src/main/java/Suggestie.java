import java.util.ArrayList;

public class Suggestie {
    private final int categorie;

    public Suggestie(int categorie) {
        this.categorie = categorie;
    }

    public int getCategorie() {
        return categorie;
    }
    public ArrayList<Oefening> getOefening() {
        ArrayList<Oefening> oefeningen = new ArrayList<>();
        for (Oefening oefening : OefeningStore.getOefeningen()) {
            if (oefening.getCategorie() == this.categorie) {
                oefeningen.add(oefening);
            }
        }
        return oefeningen;
    }
}
