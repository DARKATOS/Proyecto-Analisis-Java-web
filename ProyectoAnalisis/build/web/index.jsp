<%-- 
    Document   : index
    Created on : 9/10/2016, 10:12:55 PM
    Author     : Jorge Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>EditArea Test</title>
        <script language="javascript" type="text/javascript" src="js/jquery.min.js"></script>
        <script type="text/javascript" src="js/js1.js"></script>
        <script language="javascript" type="text/javascript" src="edit_area/edit_area_loader.js"></script>
        <script language="javascript" type="text/javascript">
            editAreaLoader.init({
                id: "textarea_1"		// textarea id
                , syntax: "java"			// syntax to be uses for highgliting
                , start_highlight: true		// to display with highlight mode on start-up
            });
            $("#line_number").attr('onclick', "breakpoint()");
        </script>


        <link rel="stylesheet" type="text/css" href="css/estilo.css" >
    </head>
    <body>

        <input  id="archivo "type="file" onchange='processFiles(this.files)' >
        <div id="cssmenu" >
            <ul id="tabla">
                <li class="noactivo active">
                    <a id="1" class="proyectos" href="#" >1</a>
                </li>

            </ul>

        </div>
        <div id="container">
            <textarea id="textarea_1" onclick="activar()" class="textarea" name="content" cols="80" rows="1"></textarea>
        </div>

        <button id="enviar">Enviar</button>
        <button id="breakpoint">breakpoint</button>
       
        <button id="mover">Mover Archivos</button>
        <button id="run">run</button>
    </body>
</html>