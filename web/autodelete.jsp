<%-- 
    Document   : autodelete
    Created on : 11.07.2017, 19:54:50
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
            
            <h1> Bereich: Auto löschen</h1>
            
            <form id="bearbeiten" action="rest/autoService/delete" method="POST">
                <fieldset>
                    <legend>KFZ Informationen:</legend>
                    Auto ID:<br>
                    <input type="text" name="id"id="id" readonly=""><br>
                    Fahrgestellnummer:<br>
                    <input type="text" name="fahrgestellnummer" id="fahrgestellnummer" size="50"> 
                    <input type="button" value="Anzeigen" onclick="autoInListeEintragen()"><br>
                    
                    Kennzeichen:<br>
                    <input type="text" name="kennzeichen" id="kennzeichen" size="50" ><br>
                    
                    Halter:<br>
                    <input type="text" name="halter" id="halter" size="50"><br>
                    
                    Hersteller:<br>
                    <input type="text" name="hersteller" id="hersteller" size="50"><br>
                    
                    Model:<br>
                    <input type="text" name="modell" id="modell" size="50"><br>
                    
                    Farbe:<br>
                    <input type="text" name="farbe" id="farbe" size="50"><br>
                    
                    PS:<br>
                    <input type="text" name="ps" id="ps" size="50"><br><br>
                    
                    <input type="submit" value="Löschen" >
                    
                </fieldset>
            </form> 
            
            
            
            
        </div>
    </body>
</html>
