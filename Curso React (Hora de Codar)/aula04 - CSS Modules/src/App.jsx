import './App.css';
import Pessoa from './components/Pessoa';

function App() {
  const foto = 'https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Default_pfp.svg/340px-Default_pfp.svg.png'
  return (
    <div className="App">
      <Pessoa nome='André' idade='20' profissao='Dev Junior' foto={foto}></Pessoa>
    </div>
  );
}

export default App;
