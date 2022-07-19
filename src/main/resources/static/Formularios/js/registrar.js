async function registrarUsuraio() {
    
    let datos = {};

    datos.id = document.getElementById('txtId').value;

    datos.tipo_id = document.getElementById('txtTipoId').value;

    datos.nombre_completo = document.getElementById('txtNombre').value;
    
    datos.email = document.getElementById('txtEmail').value;

    datos.genero = document.getElementById('txtGenero').value;

    datos.fecha_nacimiento = document.getElementById('txtFecha').value;

    datos.contrasena = document.getElementById('txtContrasena').value;

    
    if(datos.contrasena == document.getElementById('txtRContrasena').value){
        console.log(datos);
        const request = await fetch('http://localhost:8080/usuarios/registrar', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
        });
        window.location.replace('http://localhost:8080/Formularios/IniciarSesion.html');
    } else {
        alert('Las contraseñas no coinciden, por favor retifique');
    }


}