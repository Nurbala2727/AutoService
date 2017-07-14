<%-- 
    Document   : autoerstellen
    Created on : 06.07.2017, 17:47:54
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%@include file="WEB-INF/head_data.jsp" %>
       
       <script>
           
          <%@include file="WEB-INF/function.js" %> 
        </script>
    </head>
    <body>
       <%@include file="WEB-INF/header.jsp" %>
        
        <%@include file="WEB-INF/nav.jsp" %>
        
        
        
        <div class="inhalt">
            <h1> Bereich: Auto erstellen</h1>
            <form id="ertellen" action="rest/autoService/anlegen" method="post" >
                <fieldset>
                    <legend>KFZ Informationen:</legend>
                    
                    Fahrgestellnummer:<br>
                    <input type="text" name="fahrgestellnummer" id="fahrgestellnummer" size="50" pattern="[0-9A-HJ-NPR-Z]{17}"><br>
                    Kennzeichen:<br>
                    <input type="text" name="kennzeichen" id="kennzeichen" size="50" pattern="[A-ZÜÖÄ]{1,3}[A-Z]{1,2}[1-9]{1}[0-9]{0,3}"><br>
                    Halter:<br>
                    <input type="text" name="halter" id="halter" size="50"><br>
                    Hersteller:<br>
                    <input type="text" name="hersteller" id="hersteller" size="50"><br>
                    Modell:<br>
                    <input type="text" name="modell" id="modell" size="50"><br>
                    Farbe:<br>
                    <input type="text" name="farbe" id="farbe" size="50"><br>
                    PS:<br>
                    <input type="text" name="ps" id="ps" size="50"><br><br>
                    
                    <input type="button" name="pruefe" id="pruefe" value="Prüfen" onclick="pruefen()"
                    
                    <input type="submit" id="anlegen" name="alegen" value="Anlegen">
                </fieldset>
            </form> 
            <p id="auto_ergebnis">
                
            </p>
        </div>
    </body>
</html>
