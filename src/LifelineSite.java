public class LifelineSite extends Site {
    private int _units;
    private int _rate;
    private double TAX_RATE;


    public LifelineSite (int _units, int _rate, double TAX_RATE) {
        this._units =_units;
        this._rate = _rate;
        this.TAX_RATE = TAX_RATE;
    }



    public double getBillableAmount() {

        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }
}
