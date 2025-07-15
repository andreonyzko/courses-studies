function calcGrades(grades){
    let average = 0;
    for(let grade of grades){
        average += grade;
    }

    average /= grades.length;
    console.log(average)

    if(average < 6) console.log('F');
    else if(average >= 6 && average < 7) console.log('D');
    else if(average >= 7 && average < 8) console.log('C');
    else if(average >= 8 && average < 9) console.log('B');
    else console.log('A');
}

let grades = [10, 9, 9.5, 9]

calcGrades(grades);