/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function listeUpdate() {

    $.getJSON("http://localhost:8084/AutoServiceIHKGfI/rest/autoService/liste",
            function (data) {

                console.log(data);

                $.each(data, function (index, value) {

                   var back = "<tr id=\"row\">\n\
                                <td align=\"center\">" + value.auto_id + "</td>\n\
                                <td align=\"center\">" + value.fahrgestellnummer + "</td>\n\
                                <td align=\"center\">" + value.kennzeichen + "</td>\n\
                                <td align=\"center\">" + value.halter + "</td>\n\
                                <td align=\"center\">" + value.hersteller + "</td>\n\
                                <td align=\"center\">" + value.modell + "</td>\n\
                                <td align=\"center\">" + value.farbe + "</td>\n\
                                <td align=\"center\">" + value.ps + "</td>\n\
                            </tr>";

                    $(back).appendTo("#table");
                });
            });
}
;



function suchen() {

    var kennzeichen = $("#suche_kennzeichen");
    var halter = $("#suche_halter");
    var url = "http://localhost:8084/AutoServiceIHKGfI/rest/autoService/auto/" + kennzeichen.val();

    $.getJSON(url, function (data) {
        var html = "<table id=\"suche_auto\">";
        $.each(data, function (key, value) {
            html += "<tr><td class=\"suche_inhalt\">" + key + "</td><td class=\"suche_inhalt\">" + value + "</td>";
        });
        html += "</table>";
        $("#suche_ergebnis").html(html);
    });

};




function anzeigenauto() {

    var kennzeichen = $("#fahrgestellnummer");
    var halter = $("#suche_halter");
    var url = "http://localhost:8084/AutoServiceIHKGfI/rest/autoService/auto/" + kennzeichen.val();

    $.getJSON(url, function (data) {
        var html = "<table id=\"suche_auto\">";
        $.each(data, function (key, value) {
            html += "<tr><td class=\"suche_inhalt\">" + key + "</td><td class=\"suche_inhalt\">" + value + "</td>";
        });
        html += "</table>";
        $("#auto_ergebnis").html(html);
    });

}
;



function erstellen() {

    var fahrgestellnummer = $("#fahrgestellnummer").val();
    var kennzeichen = $("#kennzeichen").val();
    var halter = $("#halter").val();
    var hersteller = $("#hersteller").val();
    var model = $("#modell").val();
    var farbe = $("#farbe").val();
    var ps = $("#ps").val();

    $.ajax({
        url: "http://localhost:8084/AutoServiceIHKGfI/rest/autoService/anlegen/" + fahrgestellnummer + "/" + kennzeichen + "/" + halter + "/" + hersteller + "/" + model + "/" + farbe + "/" + ps,
        success: function (data) {
            anzeigenauto();
            alert(data);
        }
    });


}
;



function autoInListeEintragen() {
    var kennzeichen = $("#fahrgestellnummer").val();

    var url = "http://localhost:8084/AutoServiceIHKGfI/rest/autoService/auto/" + kennzeichen;

    $.getJSON(url, function (data) {
        console.log(data);
        $.each(data, function (key, value) {
            switch (key) {
                case "auto_id":
                    $("#id").val(value);
                    break;
                case "fahrgestellnummer":
                    $("#fahrgestellnummer").val(value);
                    break;
                 case "kennzeichen":
                    $("#kennzeichen").val(value);
                    break;    
                case "halter":
                    $("#halter").val(value);
                    break;
                case "hersteller":
                    $("#hersteller").val(value);
                    break;

                case "modell":
                    $("#modell").val(value);
                    break;

                case "farbe":
                    $("#farbe").val(value);
                    break;

                case "ps":
                    $("#ps").val(value);
                    break;

                default:

                    break;
            }
        });


    });
};


function remove(){
    
}