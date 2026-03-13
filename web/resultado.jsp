<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmación de Registro</title>
        <style>
            body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }
            .container { border: 2px solid red; display: inline-block; padding: 20px; border-radius: 15px; }
            h1 { color: red; }
            .león { font-weight: bold; color: #b30000; }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>¡Registro Exitoso!</h1>
            <p>Se ha registrado el equipo: <span class="león">${equipoRegistrado}</span></p>
            <p>En la categoría: <b>${categoriaSeleccionada}</b></p>
            <hr>
            <p><i>"La fuerza del león está en su equipo"</i></p>
            <br>
            <a href="index.html">Registrar otro equipo</a>
        </div>
    </body>
</html>