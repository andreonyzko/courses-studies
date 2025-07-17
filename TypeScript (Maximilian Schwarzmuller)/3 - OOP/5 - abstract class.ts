export {};

abstract class UIElement{
    constructor(public identifier: string){}

    abstract clone(targetLocation: string): void;
}

class modal extends UIElement{
    constructor(public identifier: string, public position: 'left' | 'right'){
        super(identifier);
    }

    clone(targetLocation: string){
        // Logic...
    }
}