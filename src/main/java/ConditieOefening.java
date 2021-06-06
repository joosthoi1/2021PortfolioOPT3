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
}
