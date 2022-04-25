/* Algunas cosas que se pueden hacer con DOM */
console.log(window.document);
console.log(document);
console.log(document.head); //regresa el head del documento
console.log(document.body); //regresa el body
console.log(document.documentElement); //regresa todo el html
console.log(document.doctype);
console.log(document.charset);
console.log(document.links);
console.log(document.images);
console.log(document.styleSheets); //regresa los css
console.log(document.scripts); //regresa las etiquetas scrips

setTimeout(()=> {
    console.log(document.getSelection().toString());
}, 3000);

document.write("Hola mundo desde document write"); //funciona de una manera similar a un la consola. pero lo inserta en el documento hasta el final
document.write("<h2>Hola mundo desde document write</h2>");