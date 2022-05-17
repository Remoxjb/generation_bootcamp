const palindrome = (string) => {
    if(typeof string === 'undefined') return ;
    return string
            .split('')
            .reverse()
            .join('');
}


const average = array => { //[1]
    if (typeof array === 'undefined') return;

    let sum = 0;
    array.forEach(num => { sum += num });
    return sum / array.length;
}


//exportar
module.exports ={
    palindrome, //:palindrome,
    average //: average
}
