public class HockeyOefening extends Oefening {
    private String handeling;
    public HockeyOefening(int oefeningTijd, String naam, String handeling) {
        super(oefeningTijd,naam);
        this.handeling = handeling;
    }

    @Override
    public String displayDetails() {
        String output =
                "Dit is oefening " + this.naam + "\n" +
                "Hij duurt ongeveer " + this.oefeningTijd + " minuten\n" +
                "In deze oefening wordt vooral getraint op " + this.handeling;
        return output;
    }
}
