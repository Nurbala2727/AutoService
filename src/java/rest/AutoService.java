/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import model.Zugriffsverwaltung;
import dto.Auto;

import com.google.gson.Gson;

/**
 *
 * @author Denis
 */
@Path("autoService")
public class AutoService {

    @GET
    @Path("/liste")
    //@Produces("application/json")
    @Produces({"application/json"})
    public String getAutoListe() {
        String autos = "";
        ArrayList<Auto> autoListe = new ArrayList<>();

        try {
            autoListe = new Zugriffsverwaltung().getAutoListe();
            Gson gson = new Gson();
            autos = gson.toJson(autoListe);
        } catch (Exception e) {

        }

        System.out.println(autos);
        return autos;
    }

    @GET
    @Path("/auto/{fgnr}")
    @Produces({"application/json"})
    public String getAuto(@PathParam("fgnr") int fgnr) {
        String autoS="";
        Auto auto = new Auto();
        try {

            auto = new Zugriffsverwaltung().getAuto(fgnr);
            Gson gson = new Gson();
            autoS = gson.toJson(auto);
        } catch (Exception e) {

        }

        return autoS;
    }

    @GET
    @Path("/message")
    @Produces(MediaType.TEXT_PLAIN)
    public String MessageResource() {
        return "Hallo i bims dem Denis ";

    }

}
