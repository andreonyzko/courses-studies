import './App.css';

function App() {
  let name = 'André'

  function sum(a=10, b=2){
    return a+b
  };

  const imagemUrl = 'https://placehold.co/150'

  return (
    <div className="App">
      <h1>Bem-vindo, {name}</h1>
      <p>{sum(30,40)}</p>
      <img src={imagemUrl} alt="" />
    </div>
  );
}

export default App;
