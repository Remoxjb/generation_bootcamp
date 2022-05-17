//intanciacion es proceso de clonar una clase y como resultado da un objeto
//el objeto tiene atributos datos y metodos son las acciones que puedes realizar al objeto
//class y la primer letra es en mayuscula es para crear el objeto y solo van con llave
//no se usan las palabras reservadas const o let

//encapsulamiento
class Persona{
    //atributos no es necesario que se realice dentro de javaScript y otros lenguajes si le asignas un # se puede hacer privado
    #id =0;
    static #contador = 0; //no se necesita crear un objeto para que exista ya que ese existe en la clase es como global
    #nombre = ""; //variable privada
    #edad = 0;
    #correo = "";

    //funcion constructora asigna los valores que van a tener nuestro objeto y deben de tener this para asignar el valor
    
    constructor(nombre, edad, correo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#correo = correo;
        this.#id = ++Persona.#contador;
        

    }

    //setters & getters
    //set & get
    //fijar & obtener son metodos
    //se usan y se llaman como si fueran atributos
    // get getNombre 0 getnombre
    get getNombre (){
        return this.#nombre;
    }

    set setNombre(nombre){
        this.#nombre = nombre
    }

    get getEdad (){
        return this.#edad;
    }

    set setEdad(nombre){
        this.#edad = nombre
    }

    get getCorreo (){
        return this.#correo;
    }

    set setCorreo(nombre){
        this.#correo = nombre
    }

    //metodos funciones declaradas

    CambiarNombre(nombre){
        this.#nombre = nombre
    }

    #saludar (){
        let mensaje = `Hola mi nombre es: ${this.#nombre}`
        return mensaje;
    }

    mostrarSaludo(){
        return this.#saludar();
    }

    static mostarContador(){
        return Persona.#contador;
    }

}


//al hacer esto se crea un objeto o una instancia dentro de la clase Persona
const persona1 = new Persona('Pedro',30,'pedro@gmail.com');
const persona2 = new Persona('Gabriel', 25, 'gabriel@gmail.com');
const persona3 = new Persona('Martin', 40, 'martin@gmail.com')
persona1.SetNombre = 'Jose'

//persona1.CambiarNombre('Antonio') 


console.log(persona1);
console.log(persona2);
console.log(persona3);

console.log(persona1.mostrarSaludo()); //cada objeto va a tener los mismos atributos y sus valores
console.log(persona2.mostrarSaludo());

/* console.log(Persona.contador); // para mandar a llamar el contador se necesita moner la clase */

console.log(Persona.mostarContador()); //consola debe mostrar el numero 3
