function showProperties(obj){
    for(let prop in obj)
        if(typeof obj[prop] === 'string')
            console.log(prop, obj[prop]);
}

let obj = {
    firstName: 'Andre',
    lastName: 'Onyszko',
    age: 20
}

showProperties(obj);