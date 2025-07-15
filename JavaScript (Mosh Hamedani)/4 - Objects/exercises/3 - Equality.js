function createAddress(street, city, zipCode) {
    return {
        street,
        city,
        zipCode
    }
}

function Address(street, city, zipCode){
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
}

function areEqual(address1, address2) {
    for(let key in address1){
        if(address1[key] !== address2[key]) return `The addresses are not equals!`;
    }
    return `The addresses are equals!`;
}

let address1 = createAddress('Time Square', 'NY', 123456);
let address2 = new Address('Disney', 'Orlando', 987654);
let address3 = new Address('Time Square', 'NY', 123456);

console.log(areEqual(address1, address2));
console.log(areEqual(address1, address3));