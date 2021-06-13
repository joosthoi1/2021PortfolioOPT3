package Oefening;

public class ConditieOefening extends Oefening{
    private int gemmideldeVerbrandeCalorien;
    public ConditieOefening(int oefeningTijd, String naam, int categorie, int gemmideldeVerbrandeCalorien) {
        super(oefeningTijd, naam, categorie);
        this.gemmideldeVerbrandeCalorien = gemmideldeVerbrandeCalorien;
    }

    @Override
    public String displayDetails() {
        String output =
                "Dit is oefening " + this.naam + "\n" +
                "Hij duurt ongeveer " + this.oefeningTijd + " minuten\n" +
                "Hij verbrand ongeveer " + this.gemmideldeVerbrandeCalorien + " caloriën";
        return output;
    }

    @Override
    String voorbereiding() {
        return "Zorg dat je - voordat je deze oefening doet - je spieren lekker warm maakt DMV inlopen en stretchen";
    }

    @Override
    String uitleg() {
        return "Gedurende " + this.oefeningTijd + "min gaan we de oefening " + this.naam + " doen.";
    }
}
