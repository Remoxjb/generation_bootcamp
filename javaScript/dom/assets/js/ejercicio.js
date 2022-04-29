
const $card = document.querySelector('.card');
const $form = document.querySelector('form');

$form.addEventListener('submit', (e) => { //es el evento que se ocaciona al hacer click en el submit
    e.preventDefault();

    const datos = Object.fromEntries ( //es el tratamiento a los datos recabados dentro del formulario y hace que podamos hacer uso de ellos
        new FormData(e.target)
    )
    
    crearElemento(datos.url, datos.texto); //llamar a la funcion con los datos recabados del formulario y ejecutarla
    $form.reset(); // borrar el contenido dentro del formulario
});



function crearElemento(url, texto){ 
    const img = document.createElement('img'); //va a crear un elemento tipo img
    const txt = document.createElement('figcaption'); // va a crear un subtitulo o leyenda asociado del elemento padre, es decir la imagen 
    img.src = url; //va a poner la url que se obtiene dentro del formulario en el input url y va a crear la imagen dentro del documento que es el div con la clase .card
    img.alt = texto; // va a poner la leyenda de texto que se obtine dentro del formulario en el input texto y lo pondra debajo de la imagen

    txt.textContent = texto; // es el texto que se va a colocar dentro del documento debajo de la imagen
    
    $card.appendChild(img); // es lo que hace que se agrege la imagen dentro del div
    $card.appendChild(txt); // es lo que hace que se agregue el texto debajo de la imagen
}


