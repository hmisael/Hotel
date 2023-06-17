<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi segunda aplicación JSP</title>
    </head>
    <body>
        <h1>Datos</h1>
        <form action="SvAltaEmpleado" method="POST">
            <p>Dni: <input type="text" name="dni"> </p>
            <p>Nombre: <input type="text" name="nombre"> </p>
            <p>Apellido: <input type="text" name="apellido"> </p>
            <p>Fecha Nacimiento: <input type="text" name="fecha_nac"> </p>
            <p>Dirección: <input type="text" name="direccion"> </p>
            <p>Cargo: <input type="text" name="cargo"> </p>
            <p>Usuario: <input type="text" name="usuario"> </p>
            <p>Contraseña: <input type="text" name="contra"> </p>
            
            <br>
            <input type="submit" value="Enviar">

        </form>
    </body>
</html>