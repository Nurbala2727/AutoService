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

/**
 *
 * @author Denis
 */
public class DBZugriff {

    public ArrayList<Auto> getAutos(Connection conn) throws SQLException {
        ArrayList<Auto> autoliste = new ArrayList<>();
        PreparedStatement pstm = conn.prepareStatement("SELECT * FROM Auto");
        ResultSet rs = pstm.executeQuery();

        try {
            while (rs.next()) {
                Auto auto = new Auto();
                auto.setFahrgestellnummer(rs.getString(1));
                auto.setHalter(rs.getNString(2));
                auto.setHersteller(rs.getNString(3));
                auto.setKennzeichen(rs.getString(4));
                auto.setkW(rs.getInt(5));
                auto.setModelname(rs.getString(6));
                autoliste.add(auto);
            }
        } catch (SQLException e) {
            
        }
        return autoliste;

    }

}
