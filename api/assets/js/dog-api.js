const url = "https://dog.ceo/api/breeds/image/random"
const imagen = document.getElementById('imagenPerrito')
const imagen2 = document.getElementById('imagenPerrito2')

fetch(url).then(respuesta => respuesta.json()).then(datos =>{
    console.log(datos);
    imagen.src = datos.message
}) //se puede hacer una peticion y regresa como resultado una promesa


async function obtenerPerrito (){
    const infoPerritos = await fetch(url)
    const perrito = await infoPerritos.json()
    console.log(perrito);
    imagen2.src = perrito.message;
}
//se tiene que mandar a llamar a la funcion