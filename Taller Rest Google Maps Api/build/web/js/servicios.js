/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function guardar(){
    var nombre = $('#nombre').val();
    var apellido = $('#apellido').val();
    var edad = $('#edad').val();
    
    $.ajax({
        type: 'POST',
        url: "./webresources/servicios",
        data: JSON.stringify({"nombres":nombre, "apellidos":apellido, "edad":edad}),
        success: function(data){alert(data.observaciones);},
        contentType: 'application/json',
        dataType: 'json'
    });
}

function cargar(){
    $.ajax({ 
        type: "GET",
        dataType: "json",
        url: "./webresources/servicios",
        success: function(data){        
            alert(data);
        }
    });
}


