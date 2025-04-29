import styles from './Pessoa.module.css';
import PropTypes from 'prop-types';
import Button from './Button';

function editarPerfil(){
  console.log('Editando perfil...');
}

function excluirConta(){
  console.log('Conta excluída!');
}

function Pessoa({nome, idade, profissao, foto = 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/340px-Default_pfp.svg.png'}){
    return(
            <div className={styles.Pessoa}>
                <img src={foto}/>
                <h2>{nome}</h2>
                <p>Idade: {idade}</p>
                <p>Profissão: {profissao}</p>
                <div className={styles.buttonContainer}>
                    <Button text="Editar" evento={editarPerfil}></Button>
                    <Button text="Excluir" evento={excluirConta}></Button>
                </div>
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
