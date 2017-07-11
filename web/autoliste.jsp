<%-- 
    Document   : autoliste
    Created on : 06.07.2017, 18:38:23
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/head_data.jsp" %>
        <script> 
        window.onload=listeUpdate();
          <%@include file="WEB-INF/function.js" %>    
        </script>
    </head>
    <body>
        <%@include file="WEB-INF/header.jsp" %>

        <%@include file="WEB-INF/nav.jsp" %>

        <div class="inhalt">

            <h1> Bereich: Autoliste anzeigen</h1>

            <table id="table">
                <tr id="tablehead">
                    <th class="th">Auto-ID</th>
                    <th class="th">Fahrgestellnummer</th>
                    <th class="th">Kennzeichen</th> 
                    <th class="th">Halter</th>
                    <th class="th">Hersteller</th>
                    <th class="th">Modelname</th>
                    <th class="th">Farbe</th>
                    <th class="th">PS</th>
                   
                </tr>
                
            </table>



        </div>

    </body>
</html>
