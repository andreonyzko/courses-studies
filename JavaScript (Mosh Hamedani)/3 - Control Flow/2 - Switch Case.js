let role = 'admin';
let message = 'You\'re logged in as '

switch(role){
    case 'normal':
        message += 'user';
        break;

    case 'mod':
        message += 'moderator';
        break;
    
    case 'admin':
        message += 'administrator';
        break;

    default:
        message += 'unknown';
        break;
}

console.log(message);