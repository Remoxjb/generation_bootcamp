/* manejador de eventos global */
addEventListener('load', function(){
    this.alert('Se ha termiando de cargar la página')
});


function saludar (){
    alert('Hola');
}

/* Manejador de eventos semanticos solamente pueden manejar un evento a la vez*/
const $botonSemantico = document.getElementById('evento-semantico')

$botonSemantico.onclick = saludar; //no se escribe los parentesis yaque javascript manda a llamar la 

$botonSemantico.onclick = function (evento){
   // alert('Hola desde un manejador semántico');
   console.log(evento.target);
}


/* manejador de eventos multiple */
const $botonMultiple = document.getElementById ('evento-multiple');

$botonMultiple.addEventListener('click', saludarMultiple)

$botonMultiple.addEventListener('click', function (e){
    console.log(e.target);
});

function saludarMultiple (){
    alert("Hola desde manejador multiple")
}

