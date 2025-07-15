const numbers = [-1, 4, -8, 1, 6, -3, 9];
const positives = numbers.filter(value => value >= 0);

const items = positives.map(value => `<li>${value}</li>`)
const html = 
`<ul>
${items.join('\n')}
</ul>`

const objs = positives.map(number => ({ id: number }) );

console.log(html);
console.log(objs);