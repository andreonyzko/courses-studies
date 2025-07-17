let aboutme: string | null | undefined;
aboutme = `My name is ..., I'm .. years old`
aboutme = undefined;
aboutme = null; 

// ---------------------------------------

function process(value: unknown) {
    if(
        typeof value === 'object' &&
        value != null && 
        'log' in value && 
        typeof value.log === 'function'
    ){
        value.log();
    }
}