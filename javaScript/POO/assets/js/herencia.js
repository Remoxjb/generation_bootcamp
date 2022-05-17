
//herencia

class Pokemon {
    //atributos no son necesarios agregarlos al inicio en JavaScript y en Java son necesarios
    #nombre = "";
    #edad = 0;
    #evolucion;
    

    constructor (nombre,edad,evolucion,){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
    }

    get nombre(){
        return this.#nombre
    }

    atacar(){
        return console.log(`${this.#nombre}, esta atacando`);
    }

    evolucionar(){
        let mensaje= '';
        
        
        if(this.#evolucion === ''){
            mensaje = 'No puedo evolucionar'
            console.log(mensaje);    
        }else{
            
            mensaje = `${this.#nombre} Ha evolucionado ${this.#evolucion}`
            this.#nombre = this.#evolucion;
            console.log(mensaje);
        }

    }
}


//const charmander = new Pokemon ('Charmander', 2, 'charmeleon', 'Fuego');
//const bulbasour = new Pokemon('Bulbasaur', 1, 'Ivysaur', 'Planta');


/* console.log(charmander);
console.log(bulbasour);

charmander.atacar();
bulbasour.atacar();

charmander.evolucionar();
bulbasour.evolucionar();

console.log(charmander);
console.log(bulbasour);
 */

//herencia
//clase hijo

class TipoFuego extends Pokemon{
    //atributos
    #tipo = '';
    constructor(nombre,edad,evolucion,tipo){
        super(nombre,edad,evolucion); //es para llamar a la clase padre
        this.#tipo = 'Fuego';

    }
    atacar(){
        return console.log(`${this.nombre}, esta lanzando un ataque de tipo ${this.#tipo}`);
    }
    
}

const charmander = new TipoFuego ('Charmander',1,'Charmeleon');

console.log(charmander);

charmander.atacar();
charmander.evolucionar();