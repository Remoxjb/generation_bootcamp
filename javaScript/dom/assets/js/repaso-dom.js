

const $padre = document.querySelector('.padre');
/* 
getElementById es mas rapido para selccionar
#llama un id
. llama una clase
*/

//crear un elemento nuevo

//la forma mas correcta
const $parr = document.createElement('p');

$parr.textContent = "Lorem ipsum";
$parr.textContent += "Lorem ipsum";
$parr.textContent += "Lorem ipsum";

//para agregar el elemento al elemento padre

$padre.appendChild($parr);



//Agregar elementos con innerHTML

const $cuadro = document.querySelector('.cuadro');
$cuadro.innerHTML = ''; // se inicializa para evitar errores dentro del codigo.

$cuadro.innerHTML = 
                `<a href="#">Este es un enlace</a>
                <ol>
                <li>Elemento 1 </li>
                <li>Elemento 2 </li>
                <li>Elemento 3 </li>
                </ol>
                `;

const estaciones = ["Primavera", "Verano", "Otoño", "Invierno"];

const $lista = document.createElement('ul');

estaciones.forEach( estacion =>{
    const $li = document.createElement('li');
    $li.textContent = estacion;
    $lista.appendChild($li);
});

document.body.appendChild($lista)

$cuadro.appendChild($lista)
//documert.body.appendChild($lista)




//////////////////////////////

const continentes = ["Africa", "America", "Asia", "Europa", "Oceania"];

const $ol = document.createElement('ol');
$cuadro.appendChild($ol);

continentes.forEach(continente =>{
    $ol.innerHTML += `<li>${continente}</li>`
});

