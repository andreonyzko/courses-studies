function checkSpeed(speed){
    let points = 0;

    points += Math.floor((speed - 70) / 5);

    if(points == 0) return 'Ok';
    if(points >= 12) return 'Lincese suspended';

    return 'Points: ' + points;
}

console.log(checkSpeed(130));