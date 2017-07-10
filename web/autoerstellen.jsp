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
           
           function suchen(){
            
            var kennzeichen = $("#fahrgestellnummer").val();
            var halter = $("#halter");
            var url ="http://localhost:8084/AutoServiceIHKGfI/rest/autoService/auto/"+kennzeichen;
            console.log(url);
            $.getJSON(url,function(data){ 
                var html="<table id=\"suche_auto\">";
                $.each(data,function(key,value){
                    html+="<tr><td class=\"suche_inhalt\">"+key+"</td><td class=\"suche_inhalt\">"+value+"</td>"
                });
                html+="</table>";
                console.log(html);
                $("#auto_ergebnis").html(html);
            });            
           
        };
       
       function erstellen(){
            
            
            var fahrgestellnummer= $("#fahrgestellnummer").val();
            var kennzeichen = $("#kennzeichen").val();
            var halter = $("#halter").val();    
            var hersteller = $("#hersteller").val();
            var model = $("#model").val();
            var farbe = $("#farbe").val(); 
            var ps = $("#ps").val(); 
            
            console.log(fahrgestellnummer);
            console.log(kennzeichen);
            console.log(halter);
            console.log(hersteller);
            console.log(model);
            console.log(farbe);
            console.log(ps);
                    
            
            $.ajax({
                url:"http://localhost:8084/AutoServiceIHKGfI/rest/autoService/anlegen/"+fahrgestellnummer+"/"+kennzeichen+"/"+halter+"/"+hersteller+"/"+model+"/"+farbe+"/"+ps,
                success: function (data) {
                        console.log(data);
                        
                        suchen();
                        
                        alert(data);
                    }
            });
                 
           
        };
        </script>
    </head>
    <body>
       <%@include file="WEB-INF/header.jsp" %>
        
        <%@include file="WEB-INF/nav.jsp" %>
        
        
        
        <div class="inhalt">
            <h1> Bereich: Auto erstellen</h1>
            <form id="ertellen" action="" method="" >
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
                    
                    <input type="button" value="Anlegen" onclick="erstellen()">
                </fieldset>
            </form> 
            <p id="auto_ergebnis">
                
            </p>
        </div>
    </body>
</html>
