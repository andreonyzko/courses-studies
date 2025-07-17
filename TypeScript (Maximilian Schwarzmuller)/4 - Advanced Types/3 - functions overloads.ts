function getLength(val: string): string;
function getLength(val: any[]): number;
function getLength(val: string | any[]) {
    if(typeof val === 'string'){
        return `${val.split(' ').length} words`;
    }

    return val.length;
}

const wordsAmount = getLength("Hello world!");
wordsAmount.length;
const itemsAmount = getLength(['A', 'B', 'C']);