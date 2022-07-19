const getInitialData = 'http://localhost:8080/api/disponibles/listar';
const saveSession = 'http://localhost:8080//api/citas/guardar';

let dataTest = [
    {
        id: 0,
        id_profesor: '',
        nombre : '',
        fecha_inicio: new Date(),
        fecha_fin: new Date(),
        cupo: 0
    },
    {
        id: 0,
        id_profesor: '',
        nombre : '',
        fecha_inicio: new Date(),
        fecha_fin: new Date(),
        cupo: 0
    },
    {
        id: 0,
        id_profesor: '',
        nombre : '',
        fecha_inicio: new Date(),
        fecha_fin: new Date(),
        cupo: 0
    }
]


const getData = async () =>{
    let request = await fetch(getInitialData);
    let response = await request.json();
}