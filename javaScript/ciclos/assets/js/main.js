/* ciclos : permiten hacer tareas que son repetitivas*/

//for
//for ...in
//.forEach


//imprimir la frase "Hola mundo" 10 veces
// dentro del for (inicializa la variable; condicion; el modificador si suma o resta) son iteraciones solo que la variable no se puede utilizar despues del ciclo
/* for(let i=0; i<10; i++){
    console.log("Hola Mundo",i); //codigo
    //debugger; 
} */

//iteración = una vuelta a cada ciclo

//ciclo while siempre se ejecuta cuando la condicion es verdadera

/* let control = 1;// es igual a i en ciclo for

while (control <= 5) { //condicion que se va a modificar

    console.log("Hola desde un ciclo while", control);   

    control++; //modificador de la variable control
}

console.log(control); */

/* ciclo do...while se ejecuta por lo menos una vez aunque la condicion sea falsa */

let i = 6;

do {
    console.log("Hola desde un do...while", i);
    i++;
} while (i<=5);

//escribe un ciclo anidado que imprima el siguiente patrón.

// ciclo anidado es que se puede meter un ciclo dentro de otro ciclo.


