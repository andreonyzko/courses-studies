// Validators
interface Validatable{
    value: string,
    required?: boolean,
    minLength?: number,
    maxLength?: number,
    min?: number,
    max?: number
}

export function validate(obj: Validatable) {
    if(obj.required && !obj.value) return false;
    if(obj.minLength && obj.value.length < obj.minLength) return false;
    if(obj.maxLength && obj.value.length > obj.maxLength) return false;
    if(obj.min && +obj.value < obj.min) return false;
    if(obj.max && +obj.value > obj.max) return false;
    return true;
}