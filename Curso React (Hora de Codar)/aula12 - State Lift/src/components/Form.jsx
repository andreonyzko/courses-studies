import styles from './general.module.css'

function Form({setNome, setIdade, setJob}){
    return(
        <>
        <div className={styles.container}>
            <form action="">
                <div className={styles.field}>
                    <label htmlFor="name">Nome</label>
                    <input type="text" name="name" id="name" onChange = {(e) => setNome(e.target.value)}/>
                </div>
                <div className={styles.field}>
                    <label htmlFor="age">Idade</label>
                    <input type="number" name="age" id="age" onChange = {(e) => setIdade(e.target.value)}/>
                </div>
                <div className={styles.field}>
                    <label htmlFor="job">Profissão</label>
                    <input type="text" name="job" id="job" onChange = {(e) => setJob(e.target.value)}/>
                </div>
            </form>
        </div>
        </>
    )
}

export default Form;