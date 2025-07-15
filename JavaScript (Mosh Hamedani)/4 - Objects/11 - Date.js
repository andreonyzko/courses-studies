const now = new Date();
const date1 = new Date('July 15 2025 10:00');
const date2 = new Date(2024, 6, 15, 10);

let year = now.getFullYear();
now.setFullYear(year+1);

console.log(now.toDateString());
console.log(date1.toTimeString());
console.log(date2.toISOString());