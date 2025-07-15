const movies = [
    {title: 'a', year: 2018, rating: 4.5},
    {title: 'b', year: 2018, rating: 4.7},
    {title: 'c', year: 2018, rating: 3},
    {title: 'd', year: 2017, rating: 4.5}
]

const output = movies.filter(movie => movie.year === 2018 && movie.rating > 4)
.sort((current, next) => current.rating - next.rating).reverse().map(m => m.title);

console.log(output);