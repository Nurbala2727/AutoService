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
                auto.setFahrgestellnummer(rs.getInt(1));
                auto.setHersteller(rs.getString(2));
                auto.setModell(rs.getString(3));
                auto.setFarbe(rs.getString(4));
                auto.setPs(rs.getInt(5));
                auto.setHalter(rs.getString(6));
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

                auto.setFahrgestellnummer(rs.getInt(1));
                auto.setHersteller(rs.getString(2));
                auto.setModell(rs.getString(3));
                auto.setFarbe(rs.getString(4));
                auto.setPs(rs.getInt(5));
                auto.setHalter(rs.getString(6));

            }
        } catch (SQLException e) {

        }
        return auto;

    }

    public void setAuto(Auto a, Connection conn) {
        int fahrgestellnummer = a.getFahrgestellnummer();
        String hersteller = a.getHersteller();
        String modell = a.getModell();
        String farbe = a.getFarbe();
        int ps = a.getPs();
        String halter = a.getHalter();

        try {

            String sqlString = "INSERT INTO Auto "
                    + " (Fahrgestellnummer, Hersteller, Modell, Farbe, PS, Besitzer) "
                    + " VALUES (?,?,?,?,?,? )";
            PreparedStatement stmt = conn.prepareStatement(sqlString);
            stmt.setInt(1, fahrgestellnummer);
            stmt.setString( 2, hersteller );
            stmt.setString(3,modell);
            stmt.setString(4,farbe);
            stmt.setInt(5,ps );
            stmt.setString(6,halter);
            
            
            int anzahl = stmt.executeUpdate();
            
        } catch (Exception e) {
        }
    }
}
