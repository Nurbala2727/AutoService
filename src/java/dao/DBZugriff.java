/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Auto;
import java.sql.Statement;

/**
 *
 * @author Denis
 */
public class DBZugriff {

    public DBZugriff() {

    }

    public ArrayList<Auto> getAutoListe(Connection conn) throws SQLException {

        ArrayList<Auto> autoliste = new ArrayList<>();
        /*PreparedStatement pstm = conn.prepareStatement("SELECT * FROM Auto");
        ResultSet rs = pstm.executeQuery();
         */
        String query = "SELECT * FROM AUTO";

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(query);
        try {
            while (rs.next()) {
                Auto auto = new Auto();
                auto.setAuto_id(rs.getInt(1));
                auto.setFahrgestellnummer(rs.getInt(2));
                auto.setKennzeichen(rs.getString(3));
                auto.setHalter(rs.getString(4));
                auto.setHersteller(rs.getString(5));
                auto.setModell(rs.getString(6));
                auto.setFarbe(rs.getString(7));
                auto.setPs(rs.getInt(8));
                autoliste.add(auto);
            }
        } catch (SQLException e) {

        }

        return autoliste;

    }

    public Auto getAuto(Connection conn, int fgnr) throws SQLException {

        Auto auto = new Auto();

        try {

            String sqlString = "SELECT * FROM Auto "
                    + "WHERE "
                    + "FAHRGESTELLNUMMER=" + fgnr;
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(sqlString);

            while (rs.next()) {
                auto.setAuto_id(rs.getInt(1));
                auto.setFahrgestellnummer(rs.getInt(2));
                auto.setKennzeichen(rs.getString(3));
                auto.setHalter(rs.getString(4));
                auto.setHersteller(rs.getString(5));
                auto.setModell(rs.getString(6));
                auto.setFarbe(rs.getString(7));
                auto.setPs(rs.getInt(8));
                

            }
        } catch (SQLException e) {

        }
        return auto;

    }

    public void setAuto(Auto a, Connection conn) {
        int fahrgestellnummer = a.getFahrgestellnummer();
        String kennzeichen = a.getKennzeichen();
        String hersteller = a.getHersteller();
        String modell = a.getModell();
        String farbe = a.getFarbe();
        int ps = a.getPs();
        String halter = a.getHalter();

        try {

            String sqlString = "INSERT INTO Auto "
                    + " (Fahrgestellnummer,Kennzeichen,Halter, Hersteller, Modell, Farbe, PS) "
                    + " VALUES (?,?,?,?,?,?,? )";
            PreparedStatement stmt = conn.prepareStatement(sqlString);
            stmt.setInt(1, fahrgestellnummer);
            stmt.setString( 2, kennzeichen );
            stmt.setString(3,halter);
            stmt.setString(4,hersteller);
            stmt.setString(5,modell );
            stmt.setString(6,farbe);
            stmt.setInt(7,ps);
            
            
            int anzahl = stmt.executeUpdate();
            
        } catch (SQLException e) {
        }
    }
    
    
     public void updateAuto(Auto a, Connection conn) {
        int id = a.getAuto_id();
        int fahrgestellnummer = a.getFahrgestellnummer();
        String kennzeichen = a.getKennzeichen();
        String halter = a.getHalter();
        String hersteller = a.getHersteller();
        String modell = a.getModell();
        String farbe = a.getFarbe();
        int ps = a.getPs();
         System.out.println(a.toString());
        try {

            String sqlString = "UPDATE Auto "
                    + " SET Fahrgestellnummer= ?,"
                    + " Kennzeichen= ?,"
                    + " Halter= ? ,"
                    + " Hersteller= ?,"
                    + " Modell= ? ,"
                    + " Farbe= ?,"
                    + " PS = ?"
                    + " WHERE auto_id = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sqlString);
            stmt.setInt(1, fahrgestellnummer);
            stmt.setString( 2, kennzeichen );
            stmt.setString(3,halter);
            stmt.setString(4,hersteller);
            stmt.setString(5,modell );
            stmt.setString(6,farbe);
            stmt.setInt(7,ps);
            stmt.setInt(8, id);
            System.out.println(stmt.toString());
            int anzahl = stmt.executeUpdate();
            
        } catch (SQLException e) {
        }
    }
    
     
     public void deleteAuto(Connection conn, int id){
         
         try {
             String sqlString= "DELETE FROM Auto WHERE auto_id=?";
             PreparedStatement stmt = conn.prepareStatement(sqlString);
             stmt.setInt(1, id);
             
             int anzahl = stmt.executeUpdate();
         } catch (SQLException e) {
         }
         
         
     }
     
     
}
