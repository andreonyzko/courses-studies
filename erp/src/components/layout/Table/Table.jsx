import styles from './Table.module.css'

function Table( {heads, rows} ) {
    return (
        <div className={styles.table_container}>
            <table>
                <thead>
                    <tr>
                        {heads.map((head, head_key) => (
                            <th key={head_key}>{head}</th>
                        ))}
                    </tr>
                </thead>
                <tbody>
                    {rows.map((row, row_key) => (
                        <tr key={row_key}>
                            {row.map((date, date_key) => (
                                <td key={date_key}>{date}</td>
                            ))}
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    )
}

export default Table;