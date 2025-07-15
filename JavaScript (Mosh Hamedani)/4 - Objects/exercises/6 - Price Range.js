let priceRanges = [
    {label: '$', min: 0, max: 10},
    {label: '$$', min: 11, max: 20},
    {label: '$$$', min: 21, max: 50}
]

let restaurants = [
    {name: 'A', price: 5},
    {name: 'B', price: 15},
    {name: 'C', price: 35}
]

for(let restaurant of restaurants){
    if(restaurant.price > priceRanges[0].min && restaurant.price < priceRanges[0].max){
        console.log(restaurant)
    }
}