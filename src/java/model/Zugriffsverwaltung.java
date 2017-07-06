/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Auto;
import dao.DBZugriff;
import dao.Datenbank;
/**
 *
 * @author Denis
 */
public class Zugriffsverwaltung {
    
    
    public ArrayList<Auto> getAutoListe() throws Exception{
        
        ArrayList<Auto> autoliste = new ArrayList<>();
        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        autoliste = dbz.getAutos(conn);
        return autoliste;
        
    }
    
    public Auto getAuto(int fgnr) throws Exception{
        
        Auto auto = new Auto();
        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        auto = dbz.getAuto(conn, fgnr);
        return auto;
        
    }
    
    
}
