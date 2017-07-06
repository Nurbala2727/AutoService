/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Denis
 */
public class Auto {
    
   private int fahrgestellnummer;
    private String hersteller;
    private String modell;
    private String farbe;
    private int ps;
    private String halter;

    public Auto() {

    }

    public Auto(int fahrgestellnummer, String hersteller, String modell, String farbe, int ps, String halter) {
        this.fahrgestellnummer = fahrgestellnummer;
        this.hersteller = hersteller;
        this.modell = modell;
        this.farbe = farbe;
        this.ps = ps;
        this.halter = halter;
    }

    public int getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(int fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    
    
    public String getHalter() {
        return halter;
    }

    public void setHalter(String halter) {
        this.halter = halter;
    }
    
    @Override
    public String toString() {
        return fahrgestellnummer + ":" + hersteller + ":" + modell + ":" + farbe + ":" + ps+ ":" + halter;
    }
}
