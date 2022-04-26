/* Funciones, nos permite reutilizar codigo */

function saludar (nombre = "pancho", apellido = ""){ //se puede sobreescribir el nombre de la funcion al llamarla
    // template strings || Plantilla literales
    /* console.log(`Hola mi nombre es: ${nombre}`); 
    //string normal
    console.log("hola mi nombre es:", nombre, apellido);
   // console.log(`Hola mi nombre es: ${nombre?"Juan":"desconocido"}`); */
   return`Mi nombre es ${nombre} ${apellido}`;
};

saludar ("Romeo", "Santos"); //invocacion o llamada de la funcion.

let funcionSaludar = saludar('Felipe','Maqueda');
console.log(funcionSaludar);

console.log(saludar("Ricardo", "Salinas"));

console.log(funcionSaludar.toLowerCase());



/* document.write('<h1>Este es un h1</h1>');
console.log('<h1>Este es un h1</h1>');
console.log(`<h1>Este es un h1</h1>`); */

/* Funcion declarada */

function suma(a,b){
    return a + b;
}

console.log(suma(10,20));

/* hoisting puedes mandar a llamar a la funcion en cualqioer parte del documento */

/* funciones expresadas | función expresion */

const resta = function (a,b) {
    return a - b;
}

console.log(resta(40,10));

/* setTimeout(()=>{

}, 3000);  es un callback*/ 

//funcion flecha es porque se ponen los signos de igual y mayor que se puede borrar { y la palabra return y no se puede llamar antes de declarar la funcion}

const multiplicacion = (a , b) =>  a * b;

console.log(multiplicacion(40,5));

