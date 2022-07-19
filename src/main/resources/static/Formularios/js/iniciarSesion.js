async function iniciarSesion() {
    
    let datos = {};
    
    datos.email = document.getElementById('txtEmail').value;

    datos.contrasena = document.getElementById('txtContrasena').value;

    console.log(datos);
    const request = await fetch('http://localhost:8080/auth/iniciarSesion', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });

    const respuesta = await request.text();
    
    if (respuesta != 'fail'){
        localStorage.token= respuesta;
        localStorage.email = datos.email;
        console.log('ok');
        window.location.replace('http://localhost:8080/Formularios/index.html');
    }
    else {
        alert('Error al iniciar sesion, verifique los credenciales');
    }

}