


function $escucharTeclado (){
    prompt("Escribe tu nombre")
}

const $teclado = document.getElementById('teclado')
$teclado.addEventListener('click', $escucharTeclado);

$teclado.addEventListener('keydown',function(){
    console.log($teclado);
})