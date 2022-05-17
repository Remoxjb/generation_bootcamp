//importar
const { palindrome} = require('../para_probar');

//primer test unitario
test('palindrome de generation',() =>{
    const resultado = palindrome ('generation');

    //comparar
    expect(resultado).toBe('noitareneg')
});

test('palindrome de usando un string vacio',() =>{
    const resultado = palindrome ('');

    //comparar
    expect(resultado).toBe('')
});

test('palindrome de usando undefined',() =>{
    const resultado = palindrome ();

    //comparar
    expect(resultado).toBe()
});
