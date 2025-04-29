import styles from './general.module.css';
import Lista from './List';

function component() {
    let lista = [
        {tarefa: "HTML", estado:"Done"},
        {tarefa: "CSS", estado:"Done"},
        {tarefa: "JS", estado:"Done"},
        {tarefa: "React", estado:"Doing"},
        {tarefa: "Spring Boot", estado:"To do"}
    ]

    return (
        <>
            <div className={styles.container}>
                <Lista list={lista} index={1}></Lista>
            </div>
            <div className={styles.container}>
                <Lista list={[]} index={2}></Lista>
            </div>
        </>
    )
}

export default component;