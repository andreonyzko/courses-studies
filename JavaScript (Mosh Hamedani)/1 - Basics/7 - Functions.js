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

function report(person){
    console.log(person.firstName + " " + person.lastName + ": " + media(person.grades));
};

function media(grades){
    return (grades[0]+grades[1]+grades[2])/3
}

report(students[0]);
report(students[1]);