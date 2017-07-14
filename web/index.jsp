<%-- 
    Document   : index
    Created on : 06.07.2017, 16:20:08
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/head_data.jsp" %>

        <script>
            <%@include file="WEB-INF/function.js" %>
           window.onload = indexAktuell();
        </script>
    </head>
    <body>

        <%@include file="WEB-INF/header.jsp" %>

        <%@include file="WEB-INF/nav.jsp" %>
        <div class="inhalt">

            <h1> Willkommen beim Auto Service der IHK GfI</h1>


            <p >
                <div class="headline">
                    Informationen<br>
                </div>
                Hier finden Sie aktuelle Informationen 
             </p>

            <p >
                <div class="headline">
                    Anzahl aller Autos<br>
                </div>
                <a href="autoliste.jsp" id="linkListe"></a>
             </p>



            <p >
                <div class="headline">
                    In bearbeitung<br>
                </div>
            </p>

            <p >
                <div class="headline">
                    Bereit zur Abholung<br>
                </div>
            </p>

            <p >
                <div class="headline">
                    Problemmeldungen!!!<br>
                </div>
            </p>
        </div>


    </body>
</html>
