//Puede modificar cualquier elemento dentro del un HTML  es decir cualquier parte del documento y los toma como nodo
// la variables siempre se encuentran al principio del documento


const $titulo = document.querySelector('h1')
const $parr = document.querySelector('p');
const $card = document.querySelector('.card');

//muestra el nombre del nodo nodeName
console.log($parr.nodeName);
console.log($titulo.nodeName);

//textContent se puede modificar cualquier elemento que contenga texto
console.log($parr.textContent);
$parr.textContent += "Hola Mundo!"; //sobrescribe el texto dentro del HTML ya que estas asignando un nuevo texto al parrafo.
//si pones un += agrega el texto al final de lo que se encontraba antes de declararla.

$titulo.textContent = 'Modificando elementos con JavaScript';

//innerText - de preferencia no usarla

//innerHTML

console.log($parr.innerHTML); //devuelve el contenido de un HTML es mas utilizado

//$parr.innerHTML = '<a href="#">Este es un enlace</a>'; //permite agregar un elemento como etiquetas
//remplaza lo que hay adentro del elemento seleccionado


//outerHTML
$parr.outerHTML = '<a href="#">Este es un enlace</a>'; 
//reemplaza todo, incluido el elemento que se selecciona


// para crear elementos o nodos dentro de HTML
//document hace referencia a todo el HTML

function crearElemento(){ //la funcion no es necesaria
    const img = document.createElement('img');
    img.src = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYF7oqKEXJtqxPVgVkJ5GBsk1HQQJaozIID3jBEqDETw&s"
    //appendChild anexar un elemento como hijo
    $card.appendChild(img); //esto es lo que agrega el elemento dentro del documento
}

crearElemento();







