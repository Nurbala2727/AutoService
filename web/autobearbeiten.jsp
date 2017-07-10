<%-- 
    Document   : autobearbeiten.jsp
    Created on : 10.07.2017, 19:50:48
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
       <%@include file="WEB-INF/head_data.jsp" %>
    </head>
    <body>

        <%@include file="WEB-INF/header.jsp" %>
        
        <%@include file="WEB-INF/nav.jsp" %>
        <div class="inhalt">
            
            <h1> Bereich: Auto bearbeiten</h1>
            
            <form id="ertellen" action="" method="">
                <fieldset>
                    <legend>KFZ Informationen:</legend>
                    Fahrgestellnummer:<br>
                    <input type="text" name="Farhgestellnummer" id="fahrgestellnummer" size="50"><br>
                    Kennzeichen:<br>
                    <input type="text" name="kennzeichen" id="kennzeichen" size="50" ><br>
                    Halter:<br>
                    <input type="text" name="halter" id="halter" size="50"><br>
                    Hersteller:<br>
                    <input type="text" name="hertseller" id="hersteller" size="50"><br>
                    Model:<br>
                    <input type="text" name="model" id="model" size="50"><br>
                    Farbe:<br>
                    <input type="text" name="farbe" id="farbe" size="50"><br>
                    PS:<br>
                    <input type="text" name="ps" id="ps" size="50"><br><br>
                    
                    <input type="button" value="Ändern" onclick="update()">
                    <input type="button" value="Löschen" onclick="remove()">
                </fieldset>
            </form> 
            
            
            
            
        </div>
    </body>
</html>
