const nombre = "Juan";
const nombre2 = new String("No");

const persona = new Object(); //objeto mas general de declararlo ya no se usa mucho
persona.nombre = "Juan"
persona.apellido = "Badillo"
persona.edad = "30"

console.log(persona);

const nuevaPersona = {
    nombreCompleto: {
    nombre: "Juan",
    apellido: "Vazquez"
    },
    edad: 30,
    pasatiempos: ["coches", "animales","música"],
    tieneTrabajo: true,
    saludar: function(){
        console.log("Hola");
    },
    sumar: function(n1,n2){
        console.log(`El resultado de la suma es ${n1 + n2}`);
    }
}

"Hola".length /* atributo o propiedad */
"Hola".toLocaleLowerCase() /* metodo */

console.log(nuevaPersona.edad);
console.log(nuevaPersona.nombreCompleto);
console.log(nuevaPersona.pasatiempos[0]);

nuevaPersona.saludar()
nuevaPersona.sumar(5,30)

/* Para cambiar valor */
nuevaPersona.edad = 31

console.log(nuevaPersona);

/* Agregar atributo */
nuevaPersona.colorFavorito = "Azul"
console.log(nuevaPersona);

console.log( nuevaPersona.hasOwnProperty("edad"));
console.log(Object.keys(nuevaPersona));
console.log(Object.values(nuevaPersona));



