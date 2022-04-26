const regresa = (palabra = "") => { //se puede asignar un valor a los parametros de la funcion y no genere un error
    if (palabra.length <=1) console.warn('No ingreso texto')

    if(typeof(palabra) !=='string') return console.error("El valor ingresado no es una palabra")

    let arreglo = palabra.split(""); //  el metodo split convierte la palabra en un arreglo
    let reverso = arreglo.reverse(); // es para invertir el arreglo
    let unir = reverso.join(""); // es para unir los elemento de los arreglos en un solo string
    return console.log(unir);

}

regresa ("Hola Mundo")