import styles from './general.module.css';

function component({nome= '', idade, profissao='', foto= 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/340px-Default_pfp.svg.png'}) {
    return (
        <>
            <div className={styles.container}>
                <img src={foto} />
                <div>
                    {nome.length > 0 ? (<h1>{nome}</h1>) : (<h1>Usuário</h1>)}
                    {idade ? (<p>Idade: {idade}</p>) : (<p>Insira sua idade</p>)}
                    {profissao.length > 0 ? (<p>Profissão: {profissao}</p>) : (<p>Informe sua profissão</p>)}
                </div>
            </div>
        </>
    )
}

export default component;