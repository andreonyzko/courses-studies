import './App.css';
import Pessoa from './components/Pessoa';


function App() {
  const foto = 'https://avatars.cloudflare.steamstatic.com/9de9077a45dc8c9e987e3de12dce0b816a71079e_full.jpg'
  return (
    <div className="App">
      <Pessoa nome='André' idade={20} profissao='Dev Junior' foto={foto}></Pessoa>
      <Pessoa nome='Kadu' idade={20} profissao='Barista'></Pessoa>
    </div>
  );
}

export default App;
