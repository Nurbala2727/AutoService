<%-- 
    Document   : autoanzeigen
    Created on : 06.07.2017, 17:48:18
    Author     : Denis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="WEB-INF/head_data.jsp" %>
        <script> 
        
        function suchen(){
            
            var kennzeichen = $("#suche_kennzeichen");
            var halter = $("#suche_halter");
            var url ="http://localhost:8084/AutoServiceIHKGfI/rest/autoService/auto/"+kennzeichen.val();
            console.log(url);
            $.getJSON(url,function(data){ 
                var html="<table id=\"suche_auto\">";
                $.each(data,function(key,value){
                    html+="<tr><td class=\"suche_inhalt\">"+key+"</td><td class=\"suche_inhalt\">"+value+"</td>"
                });
                html+="</table>";
                $("#suche_ergebnis").html(html);
            });            
           
        };
       
        </script>
    </head>
    <body>
        <%@include file="WEB-INF/header.jsp" %>

        <%@include file="WEB-INF/nav.jsp" %>

        <div class="inhalt">
            <h1> Bereich: Auto anzeigen</h1>
            <form id="suchfeld" >
                <fieldset>
                    <legend>KFZ Such-Informationen:</legend>
                    Kennzeichen:<br>
                    <input type="text" name="kennzeichen" id="suche_kennzeichen"><br>
                    Halter:<br>
                    <input type="text" name="halter" id="suche_halter" ><br><br>
                    <input type="button" value="Suchen" onclick="suchen()">
                </fieldset>
            </form> 
            <p id="suche_ergebnis">
                
            </p>
        </div>
        
    </body>
</html>
