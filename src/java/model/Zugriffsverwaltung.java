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

    public ArrayList<Auto> getAutoListe() throws Exception {

        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        return dbz.getAutoListe(conn);

    }

    public Auto getAuto(int fgnr) throws Exception {

        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        return dbz.getAuto(conn, fgnr);

    }

    public void setAuto(Auto a) throws Exception {

        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        dbz.setAuto(a, conn);

    }

    public void updateAuto(Auto a) throws Exception {

        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        dbz.updateAuto(a, conn);

    }

    public void deleteAuto(int id) throws Exception {

        Datenbank db = new Datenbank();
        Connection conn = db.getConnection();
        DBZugriff dbz = new DBZugriff();
        dbz.deleteAuto(conn,id);

    }
}
