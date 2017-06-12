/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.ArrayList;

import javax.ws.rs.*;

import model.Zugriffsverwaltung;
import dto.Auto;

import com.google.gson.Gson;
/**
 *
 * @author Denis
 */

@Path("/autoService")
public class AutoService {
    
    
    @GET
    @Path("/autoliste")
    @Produces("application/json")
    public String getAutoListe(){
        String autos = null;
        ArrayList<Auto> autoListe = new ArrayList<>();
        
        try {
            autoListe = new Zugriffsverwaltung().getAutoListe();
            Gson gson = new Gson();
            autos = gson.toJson(autoListe);
        } catch (Exception e) {
            
        }
        
        return autos;
    }
}
