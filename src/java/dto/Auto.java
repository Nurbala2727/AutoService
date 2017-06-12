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
    
    private String hersteller;
    private String modelname;
    private String fahrgestellnummer; 
    private String kennzeichen;
    private String halter;
    private int kW;
    
    public Auto(){
        
    }

    public Auto(String hersteller, String modelname, String fahrgestellnummer, String kennzeichen, String halter, int kW) {
        this.hersteller = hersteller;
        this.modelname = modelname;
        this.fahrgestellnummer = fahrgestellnummer;
        this.kennzeichen = kennzeichen;
        this.halter = halter;
        this.kW = kW;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public void setFahrgestellnummer(String fahrgestellnummer) {
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

    public int getkW() {
        return kW;
    }

    public void setkW(int kW) {
        this.kW = kW;
    }
    
    
    
    
}
