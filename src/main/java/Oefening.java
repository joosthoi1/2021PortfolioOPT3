public abstract class Oefening {
    protected int oefeningTijd;
    protected String naam;
    protected int categorie;
    public Oefening(int oefeningTijd, String naam, int categorie) {
        this.oefeningTijd = oefeningTijd;
        this.naam = naam;
        this.categorie = categorie;
    }

    public int getOefeningTijd() {
        return this.oefeningTijd;
    }

    public String getNaam() {
        return naam;
    }
    public int getCategorie() {
        return categorie;
    }

    public abstract String displayDetails();
}
