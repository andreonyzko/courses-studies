function Lista({ list , index }) {
    return (
        <>
        <ul>
            <h1>Lista {index}</h1>
            {
                list.length > 0 ? (
                    list.map(
                        (item, index) => (
                            <li key={index}>{item.tarefa}: {item.estado}</li>
                        )
                    )
                )
                : (
                    <p>Não há item na lista!</p>
                )
            }
        </ul>
        </>
    )
}

export default Lista;