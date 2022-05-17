
const {average} = require ('../para_probar'); //por que recibes un objeto va entre corchetes

describe('average', ()=>{

    /* test('ingresar un solo valor', ()=>{
        const resultado = average([1]);

        expect(resultado).toBe(1)
    }) */
    test('ingresar un solo valor', ()=>{
        expect(average([1])).toBe(1)
    })
    test('usando múltiples valores', ()=>{
        expect(average([1,2,3,4,5,6])).toBe(3.5)
    })
    test('ingresando un undefined', () =>{ //debes modificar el archivo js para que no genere error o se rompa
        expect(average()).toBeUndefined()
    })
    //crear un test para probar un valor undefined
    //expect(average().toBe()

})
