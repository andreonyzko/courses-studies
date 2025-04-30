import { Link } from 'react-router-dom'
import styles from './Navbar.module.css'
import Container from './Container'
import Logo from '../../img/costs_logo.png'

function Navbar() {
    return (
        <>
            <nav className={styles.navbar}>
                <Container>
                    <Link to="/"><img src={Logo} /></Link>
                    <ul>
                        <li>
                            <Link to="/">Home</Link>
                        </li>
                        <li>
                            <Link to="/projects">Projetos</Link>
                        </li>
                        <li>
                            <Link to="/company">Empresa</Link>
                        </li>
                        <li>
                            <Link to="/contact">Contato</Link>
                        </li>
                    </ul>
                </Container>
            </nav>
        </>
    )
}

export default Navbar;