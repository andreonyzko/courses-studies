type MathOperations = {
    add: (a:number, b:number) => number
    sub: (a:number, b:number) => number
}

let mathOperations : MathOperations = {
    add(a, b) {
        return a+b
    },

    sub(a, b) {
        return a-b;
    },
}

type MathResults<T> = {
    readonly [K in keyof T]?: number;
}

let mathResults: MathResults<MathOperations> = {
    add: mathOperations.add(1,2)
}
