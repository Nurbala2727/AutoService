/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Denis
 */
public class Datenbank {
    
    private Connection conn;
    private String url = "jdbc:mysql://127.0.0.1:3306/autoservice";
    
    public Connection getConnection()throws Exception{
        
        try {
            conn = DriverManager.getConnection(url,"roor","");
            return conn;
        } catch (Exception e) {
            throw e;
        }
    }
}
