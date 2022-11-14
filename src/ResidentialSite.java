public class ResidentialSite extends Site {

    public ResidentialSite(double _unit, double _rate) {
        super(_unit, _rate);
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    public double getBaseAmount() {
        return _unit * _rate;
    }}
