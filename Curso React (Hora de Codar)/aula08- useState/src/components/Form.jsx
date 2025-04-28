import { useState } from 'react';
import styles from './Form.module.css';

function Form() {
    let [user, setUser] = useState();
    let [password, setPassword] = useState();

    function enviarForm(e){
        e.preventDefault();
        console.log(`${user}: ${password}`);
    }

    return (
        <>
        <form className={styles.form}>
            <h1>Sign-in</h1>
            <div className={styles.field}>
                <label htmlFor="name">Usuário:</label>
                <input type="text" name="name" id="name" onChange={(e) => {setUser(e.target.value);}} />
            </div>
            <div className={styles.field}>
                <label htmlFor="name">Senha:</label>
                <input type="password" name="password" id="password" onChange={(e) => {setPassword(e.target.value);}} autoComplete='false'/>
            </div>
            <button type="submit" onClick={enviarForm}>Enviar</button>
        </form>
        </>
    )
}

export default Form;
