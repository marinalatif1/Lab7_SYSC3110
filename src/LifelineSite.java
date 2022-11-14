public class LifelineSite extends Site {

    public LifelineSite(double _unit, double _rate) {
        super(_unit, _rate);
    }

    public double getBaseAmount() {
        return _unit * _rate * 0.5;
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }


}
