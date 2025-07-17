class User<T> {
    constructor(public id: T){};
}

interface AuthUser<T>{
    email: T;
}