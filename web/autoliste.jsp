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
        function listeUpdate(){
            
            
            $.getJSON("http://localhost:8084/AutoServiceIHKGfI/rest/autoService/liste",
                            function(data){ 
                                
                                        var zurueck;

                                        $.each(data, function(index, value){

                                            back= "<tr id=\"row\">\n\
                                                    <td align=\"center\">"+value.fahrgestellnummer+"</td>\n\
                                                    <td align=\"center\">"+value.hersteller+"</td>\n\
                                                    <td align=\"center\">"+value.modell+"</td>\n\
                                                    <td align=\"center\">"+value.farbe+"</td>\n\
                                                    <td align=\"center\">"+value.ps+"</td>\n\
                                                    <td align=\"center\">"+value.halter+"</td>\n\
                                                 </tr>";
                                            
                                            $("#tablehead").after(back);
                                        });            
            }); 
        };
       
        </script>
    </head>
    <body>
        <%@include file="WEB-INF/header.jsp" %>

        <%@include file="WEB-INF/nav.jsp" %>

        <div class="inhalt">

            <h1> Bereich: Autoliste anzeigen</h1>

            <table id="table">
                <tr id="tablehead">
                    <th class="th">Fahrgestellnummer</th>
                    <th class="th">Hersteller</th>
                    <th class="th">Modelname</th>
                    <th class="th">Farbe</th>
                    <th class="th">PS</th>
                    <th class="th">Halter</th>
                </tr>
                
            </table>



        </div>

    </body>
</html>
