export {};

interface Authenticatable{
    email: string,
    password: string,

    login(): boolean;
    logout(): string;
}

interface AuthenticatableAdmin extends Authenticatable{
    role: 'owner' | 'admin';
}

let user: Authenticatable = {
    email: 'andre@gmail.com',
    password: '12345',

    login(){
        return true;
    },
    logout(){
        return `User logouted`;
    }
}

class User implements Authenticatable{
    constructor(public email: string, public password: string){};

    login(){
        return true;
    }

    logout(){
        return `User logouted`;
    }
}

let user2 = new User('andre@gmail.com', '12345');