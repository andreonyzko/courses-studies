import './App.css';
import Form from './components/Form';


function App() {
  const foto = 'https://avatars.cloudflare.steamstatic.com/9de9077a45dc8c9e987e3de12dce0b816a71079e_full.jpg'
  return (
    <div className="App">
      <Form field="Nome"></Form>
    </div>
  );
}

export default App;
