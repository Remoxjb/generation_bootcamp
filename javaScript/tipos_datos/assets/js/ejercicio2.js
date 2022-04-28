const Jonathan = {
    nombreCompleto: {
        nombre: "Yair",
        apellido: "Uriostegui"
    },
    edad: 23,
    pasatiempos: ["nadar","dibujar","anime"]
}

const victor = {
    nombreCompleto: {
      nombre: "Víctor Manuel",
      apellido: "Soto Alexander",
    },
    edad: 26,
    pasatiempos: ["anime", "leer", "tomar"],
  }

  const Juan = {
    nombreCompleto: {
    nombre: "Juan",
    apellido: "Vazquez"
    },
    edad: 30,
    pasatiempos: ["coches", "animales","música"],
}

    const Mitzi = {
    nombreCompleto: {
        nombre: "Mitzi",
        apellido: "Hernandez"
    },
    edad: 23,
    pasatiempos: ["jugar", "dibujar", "ver series"],
}

    const Katia = {
    nombreCompleto: {
      nombre: "Katia",
      apellido: "Alvarez",
    },
    edad: 28,
    pasatiempos: ["Cine", "Musica", "Baile"],
  }

  const Abi = {
    nombreCompleto:{
        nombre: "Abigail",
        apellido: "Moreno"
    }, 
    edad:23, 
    pasatiempos: ["bailar", "plantas", "fotografía"], 
}

const Pedro = {
    nombreCompleto: {
        nombre: "Antonio",
        apellido: "Castañón"
    },
    edad: 18,
    pasatiempos: ["jugar","salir","series"],
}

const Adolfo = {
    /* atributos o datos como info */
    nombreCompleto:{
        nombre: "Adolfo",
        apellido:"Gutierrez"
    },

     edad: 28,
     pasatiempos: ["ajedrez", "box", "leer"],
}

const Lizbeth = {
    nombreCompleto: {
        nombre: "Liz",
        apellido: "Rubio"
    },
    edad: 23,
    pasatiempos: ["comer","hacer ejercicio","ver pelis"]
}

const miriam ={
    /* atributos o propiedades: datos*/
    nombreCompleto:{ 
    nombre: "aketzali",
    apellido: "gonzalez" 
},
    edad: 23,
    pasatiempos:["pintar","leer","escribir"]
}

const Sesai = {
    nombreCompleto :{
        nombre: "Sesai",
        apellido: "Cazares",
        },
        edad: 25,
        pasatiempos: ["fotografia","caminar","dibujar"],
    }

    const Ricardo = {
        nombreCompleto: {nombre:"Ricardo", apellido:"Ortega"},
        edad:27,
        pasatiempos: ['familia', 'musica','desarrollo'], 
    
    }
    
const cohorte12 = [miriam,Lizbeth,Ricardo,Juan,Jonathan,Abi,victor,Katia,Pedro,Sesai,Mitzi]

for( let i=0; i<cohorte12.length; i++){
    if (cohorte12[i].pasatiempos.includes('coches')){
        console.log(cohorte12[i].nombreCompleto.nombre);
    }
}

/* ESto es solo para buscar una sola propiedad de nombre completo y solo pedi el nombre tiene todos los atributos 

const cohorte12 = [miriam,Lizbeth,Ricardo,Juan,Jonathan,Abi,victor,Katia,Pedro,Sesai,Mitzi]

for( let i=0; i<cohorte12.length; i++){
    if (cohorte12[i].nombreCompleto){
        console.log(cohorte12[i].nombreCompleto.nombre);
    }
} */

  /*COn esto se busca el nombre de las personas de un pasatiempos que tiene que ver con pintar dentro de un arreglo
  
  const cohorte12 = [miriam,Lizbeth,Ricardo,Juan,Jonathan,Abi,victor,Katia,Pedro,Sesai,Mitzi]

for( let i=0; i<cohorte12.length; i++){
    if (cohorte12[i].pasatiempos.includes('pintar')){
        console.log(cohorte12[i].nombreCompleto.nombre);
    }
} */




