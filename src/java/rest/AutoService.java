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
        return autos;
    }

    @GET
    @Path("/auto/{fgnr}")
    @Produces({"application/json"})
    public String getAuto(@PathParam("fgnr") int fgnr) {
        String autoS = "";
        Auto auto = new Auto();
        try {

            auto = new Zugriffsverwaltung().getAuto(fgnr);
            Gson gson = new Gson();
            autoS = gson.toJson(auto);
        } catch (Exception e) {

        }

        return autoS;
    }
  
    @POST
    @Path("/anlegen")
    @Produces(MediaType.TEXT_HTML)
    public String setAutoNeu(@FormParam("fahrgestellnummer") int fgnr,
            @FormParam("kennzeichen") String kennzeichen,
            @FormParam("halter") String halter,
            @FormParam("hersteller") String hersteller,
            @FormParam("modell") String modell,
            @FormParam("farbe") String farbe,
            @FormParam("ps") int ps) {
        Auto a = new Auto(fgnr, kennzeichen, halter, hersteller, modell, farbe, ps);
        try {
            Zugriffsverwaltung zgriff = new Zugriffsverwaltung();
            zgriff.setAuto(a);

        } catch (Exception e) {
        }
        return "Auto wurde erstellt!" + "<br><br><a href=\"http://localhost:8084/AutoServiceIHKGfI/index.jsp\">Zurück zur Startseite</a>";
    }

    @POST
    @Path("/update")
    @Produces(MediaType.TEXT_HTML)
    public String updateAuto(@FormParam("id") int id,
            @FormParam("fahrgestellnummer") int fgnr,
            @FormParam("kennzeichen") String kennzeichen,
            @FormParam("halter") String halter,
            @FormParam("hersteller") String hersteller,
            @FormParam("modell") String modell,
            @FormParam("farbe") String farbe,
            @FormParam("ps") int ps) {
        Auto a = new Auto(id, fgnr, kennzeichen, halter, hersteller, modell, farbe, ps);

        System.out.println(a.toString());
        try {
            Zugriffsverwaltung zgriff = new Zugriffsverwaltung();
            zgriff.updateAuto(a);

        } catch (Exception e) {
        }
        return "Auto wurde geändert!" + "<br><br><a href=\"http://localhost:8084/AutoServiceIHKGfI/index.jsp\">Hier geht es zur Startseite</a>";
    }

    @POST
    @Path("/delete")
    @Produces(MediaType.TEXT_HTML)
    public String deleteAuto(@FormParam("id") int id) {

        try {

            Zugriffsverwaltung zugriff = new Zugriffsverwaltung();
            zugriff.deleteAuto(id);
        } catch (Exception e) {
        }

        return "Auto wurde gelöscht!" + "<br><br><a href=\"http://localhost:8084/AutoServiceIHKGfI/index.jsp\">Hier geht es zur Startseite</a>";
    }

    @GET
    @Path("/message")
    @Produces(MediaType.TEXT_PLAIN)
    public String MessageResource() {
        return "Hallo i bims dem Denis ";

    }

}
