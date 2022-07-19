const getInitialData = "http://localhost:8080/api/disponibles/listar";
const saveSession = "http://localhost:8080//api/citas/guardar";
dataHeader = `<tr>
<th>Clase</th>
<th>Profesor</th>
<th>Fecha inicio</th>
<th>Fecha fin</th>
<th>Cupo</th>
<th>Acciones</th>
</tr>`;

const getData = async () => {
  let response = [];
  let tableText = dataHeader;
  let table = document.querySelector("#customers");
  let request = await fetch(getInitialData);
  response = await request.json();
  console.log(response);
  response.forEach((data) => {
    tableText += generateRow(data);
  });
  table.innerHTML = tableText;
};

const saveData = async (data) => {
    let request = await fetch(getInitialData);
    let response = await request.text();
    if(response === 'OK'){
        document.getElementById(`#row${data.id}`).style.backgroundColor = '#66B933';
    }
}

const generateRow = (data) => {
  return `<tr>
        <td>${data.nombre}</td>
        <td>Alberto Gonzales</td>
        <td>${data.fecha_inicio}</td>
        <td>${data.fecha_fin}</td>
        <td>${data.cupo}</td>
        <td> <a id="row${data.id}"  class="btn" href="#" onclick="saveData(data)">Inscribirme</a><br></td>
    </tr>`;
};
console.log('hola');
getData();
