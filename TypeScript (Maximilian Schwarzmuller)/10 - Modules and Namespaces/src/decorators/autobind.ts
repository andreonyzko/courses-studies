export function autobind(_: any, _2: string, descriptor: PropertyDescriptor): PropertyDescriptor {
    const method = descriptor.value;
    return {
        get(){
            return method.bind(this);
        }
    }
}
