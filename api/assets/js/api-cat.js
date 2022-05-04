
const url = "https://api.thecatapi.com/v1/images/search"

const imagen = document.getElementById("imagenGatito")
console.log(url);
console.log(imagen);


const $btn = document.getElementById("boton")
$btn.addEventListener("click", (e)=>{

    fetch(url).then(respuesta => respuesta.json()).then(datos => {
        console.log(datos[0].url);
        imagen.src = datos[0].url
        
    })
})

