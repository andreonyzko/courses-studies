function createAddress(street, city, zipCode) {
    return {
        street,
        city,
        zipCode,
        show(){ console.log(`${street}, ${city} - ${zipCode}`); }
    }
}

function Address(street, city, zipCode){
    this.street = street;
    this.city = city;
    this.zipCode = zipCode;
    this.show = function(){ console.log(`${this.street}, ${this.city} - ${this.zipCode}`); }
}

let address1 = createAddress('Time Square', 'NY', 123456);
let address2 = new Address('Disney', 'Orlando', 987654);

address1.show();
address2.show();