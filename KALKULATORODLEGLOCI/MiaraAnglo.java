package com.marcin.kalulatorodleglosci;

public abstract class MiaraAnglo {
    
    protected double odl;
    protected double mang;
    protected String info;
    public MiaraAnglo(double odl, double mang) {
        this.odl = odl;
        this.mang = mang;
        this.info = info();
    }
    
    public abstract double policzOdl();
    
    public String info(){
        return "to jest nowy obiekt klasy MiaraAnglo";
    }
}
