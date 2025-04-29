import styles from './general.module.css';
import { useState } from 'react';

function LoginForm() {
    let emails = [
        "teste@teste.com",
        "andre@gmail.com"
    ]

    let [email, setEmail] = useState();

    function enviarFormulario(e) {
        e.preventDefault();
    }

    return (
        <>
            <form action="" className={styles.container}>
                <h1>Sign-in</h1>
                <div className={styles.field}>
                    <label htmlFor="email">E-mail:</label>
                    <input type="email" name="email" id="email" onChange={(e) => setEmail(e.target.value)} />
                    {/* {userEmail && (
                        <>
                        <label htmlFor="password">Senha: </label>
                        <input type="password" name="password" id="password" />
                        </>
                    )} */}

                    {email && (
                        emails.indexOf(email) > -1 ?
                            (
                                <>
                                <label htmlFor="password">Senha: </label>
                                <input type="password" name="password" id="password" />
                                </>
                            )
                            :
                            (<small>E-mail não cadastrado</small>)
                    )
                    }
                </div>
                <button type="submit" onClick={enviarFormulario}>Prosseguir</button>
            </form>
        </>
    )
}

export default LoginForm;