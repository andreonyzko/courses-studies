let students = [
    {
        firstName: "Andre",
        lastName: "Onyszko",
        grades: [10, 9.5, 8.75],
        approved: true,
    },
    {
        firstName: "Kaua",
        lastName: "Silva",
        grades: [10, 9.5, 8],
        approved: true,
    }
]

for(let studentIndex in students){
    console.log("------- STUDENT #" + studentIndex + " -------")
    let student = students[studentIndex];
    for(let key in student) console.log(key + ": " + student[key]);
}