type GetElementType<T> = T extends any[] ? T[number] : T;
type Example1 = GetElementType<string []>;
type Example2 = GetElementType<number>;