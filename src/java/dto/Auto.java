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
    
    private int auto_id;
    private int fahrgestellnummer;
    private String kennzeichen;
    private String halter;
    private String hersteller;
    private String modell;
    private String farbe;
    private int ps;
    

    public Auto() {
        
    }

    public Auto(int fahrgestellnummer, String kennzeichen, String halter, String hersteller, String modell, String farbe, int ps) {
        this.fahrgestellnummer = fahrgestellnummer;
        this.kennzeichen = kennzeichen;
        this.halter = halter;
        this.hersteller = hersteller;
        this.modell = modell;
        this.farbe = farbe;
        this.ps = ps;
    }

    public Auto(int auto_id, int fahrgestellnummer, String kennzeichen, String halter, String hersteller, String modell, String farbe, int ps) {
        this.auto_id = auto_id;
        this.fahrgestellnummer = fahrgestellnummer;
        this.kennzeichen = kennzeichen;
        this.halter = halter;
        this.hersteller = hersteller;
        this.modell = modell;
        this.farbe = farbe;
        this.ps = ps;
    }

    
    
    
    public int getAuto_id() {
        return auto_id;
    }

    public void setAuto_id(int auto_id) {
        this.auto_id = auto_id;
    }

    public int getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(int fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getHalter() {
        return halter;
    }

    public void setHalter(String halter) {
        this.halter = halter;
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

    
    
    @Override
    public String toString() {
        return auto_id+":"+fahrgestellnummer + ":"+ kennzeichen+":"+halter+":"+  hersteller + ":" + modell + ":" + farbe + ":" + ps;
    }
}
