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
    private String url = "jdbc:mysql://localhost:3306/kfzwerkstatt";
    
    
    
    public Datenbank(){
        
    }
    public Connection getConnection()throws Exception{
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
           
            conn = DriverManager.getConnection(url,"root","");
            
        } catch (Exception e) {
            
            e.printStackTrace();
            throw e;
        }
        return conn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
