import styles from './Pessoa.module.css';
import PropTypes from 'prop-types';

function Pessoa({ nome, idade, profissao, foto = 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/340px-Default_pfp.svg.png' }) {

    function detalhes() {
        console.log(`Nome: ${nome}\nIdade: ${idade}\nProfissão: ${profissao}`);
    }

    return (
        <div className={styles.Pessoa}>
            <img src={foto} />
            <h2>{nome}</h2>
            <div className={styles.PessoaDetails}>
                <p>Idade: {idade}</p>
                <p>Profissão: {profissao}</p>
            </div>
            <button type="button" onClick={detalhes}>Ver mais</button>
        </div>
    )
}

Pessoa.propTypes = {
    nome: PropTypes.string.isRequired,
    idade: PropTypes.number.isRequires,
    profissao: PropTypes.string.isRequired,
    foto: PropTypes.string
}

export default Pessoa;
