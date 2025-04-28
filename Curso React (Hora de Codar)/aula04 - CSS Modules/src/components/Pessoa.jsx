import styles from './Pessoa.module.css';

function Pessoa({nome, idade, profissao, foto}){
    return(
        <div className={styles.Pessoa}>
            <img src={foto}/>
            <h2>{nome}</h2>
            <p>Idade: {idade}</p>
            <p>Profissão: {profissao}</p>
        </div>
    )
}

export default Pessoa;