public abstract class Oefening {
    protected int oefeningTijd;
    protected String naam;
    public Oefening(int oefeningTijd, String naam) {
        this.oefeningTijd = oefeningTijd;
        this.naam = naam;
    }

    public int getOefeningTijd() {
        return this.oefeningTijd;
    }

    public String getNaam() {
        return naam;
    }

    public abstract String displayDetails();
}
