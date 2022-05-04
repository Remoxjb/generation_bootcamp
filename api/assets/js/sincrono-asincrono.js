/* let tiempo = 5000
let datos 


setTimeout(()=>{
    let datos = "Juan"
    console.log(datos);
},tiempo);

console.log(datos);

console.log("Hola"); */

const datos = [
    {
        nombre: "Juan",
        edad: 30,
    }, 
    {
        nombre: "Eduardo",
        edad: 33,
    },
    {
        nombre: "Daniel",
        edad: 25,
    },
]

function obtenerDatos(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve (datos)
        },3000)    
    
    })
}

console.log(obtenerDatos());
// then= cuando se resuelva
obtenerDatos().then((datos)=>{
    console.log(datos);
})
//funcion asincrona
async function obtenerDatosAsync (){
    const datosObtenidos = await obtenerDatos()
    //esperate hasta         hasta que los datos lleguen los guarda en la const
    console.log(datosObtenidos);
}

obtenerDatosAsync();




