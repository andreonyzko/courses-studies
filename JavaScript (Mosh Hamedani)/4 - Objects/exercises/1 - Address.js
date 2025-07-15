const address = {
    street: 'Time Square',
    city : 'New York',
    zipCode: 123456
}

showAddress(address);

function showAddress(address) {
    console.log(`${address.street}, ${address.city} - ${address.zipCode}`);
}