import { Button } from "./Button"

export const Form = () => {
    function handleClick() {
        const response = document.createElement('p');
        response.textContent = 'Clicked';
        document.querySelector('#root').appendChild(response);
    }

    return (
        <>
            <Button handleClick={handleClick}/>
        </>
    )
}
