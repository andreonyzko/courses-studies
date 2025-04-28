import styles from './Pessoa.module.css';

function Pessoa({nome, idade, profissao, foto}){
    return(
        <>
            <div className={styles.Pessoa}>
                <img src={foto}/>
                <h2>{nome}</h2>
                <p>Idade: {idade}</p>
                <p>Profissão: {profissao}</p>
            </div>
            <ul className={styles.Tech}>
                <li><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/1200px-HTML5_logo_and_wordmark.svg.png"/></li>
                <li><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/CSS3_logo_and_wordmark.svg/1452px-CSS3_logo_and_wordmark.svg.png"/></li>
                <li><img src="https://static.vecteezy.com/system/resources/previews/027/127/463/non_2x/javascript-logo-javascript-icon-transparent-free-png.png"/></li>
                <li><img src="https://static-00.iconduck.com/assets.00/react-icon-512x512-u6e60ayf.png"/></li>
            </ul>
        </>
    )
}

export default Pessoa;