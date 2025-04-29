import {BrowserRouter as Router, Routes, Route, Link, BrowserRouter} from 'react-router-dom'

import Header from './components/Header/Header'
import Navbar from './components/Navbar/Navbar'
import Footer from './components/Footer/Footer'

import Dashboard from './pages/Dashboard'
import Agenda from './pages/Agenda'
import Vendas from './pages/Vendas'
import './App.css';

function App() {
  return (
    <BrowserRouter>
      <Header></Header>
      <div id="nav-main-container">
        <Navbar></Navbar>
        <div className='App'>
          <main>
            <Routes>
              <Route path='/' element={<Dashboard></Dashboard>}></Route>
              <Route path='/agenda' element={<Agenda></Agenda>}></Route>
              <Route path='/vendas' element={<Vendas></Vendas>}></Route>
            </Routes>
          </main>
        </div>
      </div>
      <Footer></Footer>
    </BrowserRouter>
  );
}

export default App;
