import { Link } from 'react-router-dom'
import { MdHome, MdCalendarMonth, MdShoppingCart } from 'react-icons/md'

import styles from './Navbar.module.css'

function Navbar() {
    return (
        <>
            <ul>
                <li>
                    <Link to="/">
                        <MdHome />
                        <span>Home</span>
                    </Link>
                </li>
                <li>
                    <Link to="/agenda">
                        <MdCalendarMonth/>
                        <span>Agenda</span>
                    </Link>
                </li>
                <li>
                    <Link to="/vendas">
                        <MdShoppingCart/>
                        <span>Vendas</span>
                    </Link>
                </li>
            </ul>
        </>
    )
}

export default Navbar;