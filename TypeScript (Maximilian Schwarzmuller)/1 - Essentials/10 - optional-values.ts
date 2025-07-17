function generateError(errorMsg?:string) {
    throw new Error(errorMsg);
}
generateError();

// ----------------------------------------

type AuthUser = {
    username: string,
    password: string,
    role?: 'admin' | 'guest'
}

let authUser: AuthUser = {
    username: 'Andre',
    password: '1234'
}

// ----------------------------------------

let input = '';
const didProvideInput = input ?? false;
