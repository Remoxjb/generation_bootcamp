/* Crea un archivo ejercicios.js        


1- Programa una función que valide si una palabra o frase dada, es un palíndromo (que se lee igual en un sentido que en otro), pe. mifuncion("Salas") devolverá true.

2- Programa una función que repita un texto X veces, pe. miFuncion('Hola Mundo', 3) devolverá Hola Mundo Hola Mundo Hola Mundo.

3- Programa una función que te devuelva el texto recortado según el número de caracteres indicados, pe. miFuncion("Hola Mundo", 4) devolverá "Hola".

4- Programa una función que calcule el factorial de un número (El factorial de un entero positivo n, se define como el producto de todos los números enteros positivos desde 1 hasta n), pe. miFuncion(5) devolverá 120.
 */

let palindromo = "salas"

function voltearPalabra (a = ""){
    if (a.length <=1) console.warn('No ingreso texto')

    if(typeof(a) !=='string') return console.error("El valor ingresado no es una palabra")
    
    let palabraVolteada = a.split('').reverse('').join('');
    
    
    if (a === palabraVolteada){
        console.log(`Si es un palindromo ${a}`);
    }
    else{
        console.log("No es un palindromo");
    }
}

voltearPalabra ("salas");

/* ejercicio 2 */

function miFuncion (palabra, veces){
    for (let i = 0; i < veces; i++)

    console.log(palabra);
}

miFuncion ("Hola Mundo",3)

/* ejercicio 3 */
function recorte(cadena, veces){
    let cortada = cadena.substring(0,veces);
    console.log(cortada);
}

recorte("Hola Mundo",6);

/* ejercicio 4 */
function fact (num) {    
    if (typeof(num) !== "number" ) return console.error("El dato ingresado no es un número")
	let factorial = 1; 
	for (i=1; i<=num; i++) {
		factorial = factorial * i; 
	}
	return console.log(factorial) ;
}

fact(4);
