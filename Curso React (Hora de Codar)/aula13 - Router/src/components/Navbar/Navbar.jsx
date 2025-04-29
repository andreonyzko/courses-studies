import { Link } from 'react-router-dom'
import styles from './Navbar.module.css'

function Navbar() {
    return (
        <>
            <ul>
                <li>
                    <Link to="/">
                        <span>Home</span>
                    </Link>
                </li>
                <li>
                    <Link to="/agenda">
                        <span>Agenda</span>
                    </Link>
                </li>
                <li>
                    <Link to="/vendas">
                        <span>Vendas</span>
                    </Link>
                </li>
            </ul>
        </>
    )
}

export default Navbar;