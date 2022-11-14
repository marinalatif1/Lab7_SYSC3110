public class ResidentialSite extends Site {
    private int _units;
    private int _rate;
    private double TAX_RATE;


    public ResidentialSite(int _units, int _rate, double TAX_RATE) {
        this._units =_units;
        this._rate = _rate;
        this.TAX_RATE = TAX_RATE;

    }
    


    public double getBillableAmount() {

        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
