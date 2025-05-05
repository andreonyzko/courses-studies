import {BrowserRouter as Router} from 'react-router-dom'
import './App.css';

import Header from './components/layout/Header/Header'
import Navbar from './components/layout/Navbar/Navbar'
import Main from './components/layout/Main/Main'
import Footer from './components/layout/Footer/Footer'
import { useState } from 'react';

function App() {

  const [unnav, setUnnav] = useState(false);

  return (
    <Router>
      <Header unnav={unnav} setUnnav={setUnnav} />

      <div className='nav-main-container'>
        <Navbar unnav={unnav}/>
        <div className="main-container">
          <Main />
        </div>
      </div>

      <Footer />
    </Router>
  );
}

export default App;
