type AppUser = {
    name: string,
    age: number,
    permissions : {
        id: number,
        title: string,
        description: string
    }[]
}

type Perms = AppUser['permissions'];
type Perm = Perms[number];

type Names = string[];
type Name = Names[number];