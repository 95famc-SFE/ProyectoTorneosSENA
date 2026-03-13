<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Exitoso - Independiente Santa Fe</title>
        <style>
            /* Fondo ligeramente gris para que la tarjeta blanca resalte */
            body { 
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; 
                text-align: center; 
                padding: 50px; 
                background-color: #f8f8f8; 
            }
            
            /* Tarjeta con borde rojo grueso arriba, como la camiseta */
            .card { 
                background-color: white;
                border: 1px solid #ddd; 
                border-top: 8px solid #e53935; 
                padding: 30px; 
                display: inline-block; 
                border-radius: 10px; 
                box-shadow: 0 4px 15px rgba(0,0,0,0.1); 
                max-width: 450px;
            }
            
            /* Rojo principal para el título */
            h1 { 
                color: #e53935; 
                margin-bottom: 5px;
            }
            
            /* Estilo para los datos registrados */
            p { color: #333; font-size: 1.1em; }
            
            /* Resaltado de etiquetas en rojo */
            strong { color: #b71c1c; }
            
            hr { border: 0; border-top: 1px solid #eee; margin: 20px 0; }

            /* Botón Rojo Santa Fe con efecto al pasar el mouse */
            .btn { 
                display: inline-block; 
                margin-top: 20px; 
                padding: 12px 25px; 
                background-color: #e53935; 
                color: white; 
                text-decoration: none; 
                border-radius: 5px; 
                font-weight: bold; 
                text-transform: uppercase;
                transition: background-color 0.3s, transform 0.2s; 
            }
            
            .btn:hover { 
                background-color: #b71c1c; 
                transform: scale(1.05);
            }
        </style>
    </head>
    <body>
        <div class="card">
            <h1>¡Registro Exitoso!</h1>
            <p>El equipo ya hace parte del sistema oficial.</p>
            <hr>
            <p><strong>Nombre del Equipo:</strong> ${equipoRegistrado}</p>
            <p><strong>Categoría:</strong> ${categoriaSeleccionada}</p>
            <p><strong>Capitán:</strong> ${capitanEquipo}</p>
            <hr>
            <a href="index.html" class="btn">Registrar Nuevo Equipo</a>
        </div>
    </body>
</html>