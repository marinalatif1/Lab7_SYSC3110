public  class Site {
    protected static final double TAX_RATE = 0.50;
    protected final double _unit;
    protected final double _rate;

    public Site(double _unit, double rate) {
        this._unit = _unit;
        this._rate = rate;
    }
    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    protected double getBaseAmount() {
        return 0;
    }

    protected double getTaxAmount(double base) {
        return 0;
    }

}
