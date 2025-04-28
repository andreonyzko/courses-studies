import './App.css';
import Pessoa from './components/Pessoa';

function App() {
  const name = 'Kaii'
  return (
    <div className="App">
      <Pessoa nome='André' idade='20' profissao='Dev Junior' foto='https://png.pngitem.com/pimgs/s/130-1300400_user-hd-png-download.png'></Pessoa>
    </div>
  );
}

export default App;
