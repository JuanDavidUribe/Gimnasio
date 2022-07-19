const getInitialData = "http://localhost:8080/api/citas/listar";
dataHeader = `<tr>
<th>Clase</th>
<th>Profesor</th>
<th>Fecha inicio</th>
<th>Fecha fin</th>
</tr>`;

const getData = async () => {
  let response = [];
  let tableText = dataHeader;
  let table = document.querySelector("#customers");
  let request = await fetch(getInitialData);
  response = await request.json();
  response.forEach((data) => {
    tableText += generateRow(data);
  });
  table.innerHTML = tableText;
};


const generateRow = (data) => {
  return `<tr>
        <td>${data.nombre}</td>
        <td>Alberto Gonzales</td>
        <td>${data.fecha_inicio}</td>
        <td>${data.fecha_fin}</td>
    </tr>`;
};
getData();
