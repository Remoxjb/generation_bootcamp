const idInfo = window.location.href.split("=").pop()
console.log(idInfo);

const imagenPortada = document.getElementById('imagenPortada')

const informacionAnime = document.getElementById('informacionAnime')

const urlID = `https://api.jikan.moe/v4/anime/${idInfo}`

fetch(urlID).then(resp => resp.json()).then(datos =>{
   // console.log(datos.data);

    const datosNecesarios = {
        id: datos.data.mal_id,
        imagen: datos.data.images.jpg.large_image_url,
        sinopsis: datos.data.synopsis,
        nombre: datos.data.title
    }
    
    const templateimg = `<img src="${datosNecesarios.imagen}" alt"" class="img-fluid">`

    imagenPortada.innerHTML = templateimg

    //insertar informacion
    const templateinfo = `<h1>${datosNecesarios.nombre}</h1>
    <p>${datosNecesarios.sinopsis}</p></div>
    <div class="favorito">
      <button id="agregarFavoritos" type="button" class="btn btn-dark">Agregar a favorito</button>
    </div>`

    informacionAnime.innerHTML = templateinfo

    //console.log(datosNecesarios);
    const agregarFavoritos = document.getElementById("agregarFavoritos")

    agregarFavoritos.addEventListener("click", () =>{
        //console.log("agregado");
        const datos = {
            id: datosNecesarios.id, 
            nombre: datosNecesarios.nombre,
            imagen: datosNecesarios.imagen,
        }
        if(localStorage.getItem("favoritos")){
            const favoritos = JSON.parse (localStorage.getItem("favoritos"));  
            
            favoritos.push(datos)
            
            localStorage.setItem("favoritos",JSON.stringify(favoritos))
        }
        else{
            console.log("no tienes favoritos");
            const favoritos = []
            favoritos.push(datos)

            localStorage.setItem("favoritos",JSON.stringify(favoritos))
        }

        //guardar un arreglo
        //JSON.parse (localStorage.getItem("favoritos")); 

        //crea un arreglo
       //localStorage.setItem("favoritos",JSON.stringify(datos))

        

    })
})




//https://github.com/Jonathan-YV/jikan-api para ver como termino la pagina
