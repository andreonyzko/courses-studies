import { useState } from 'react';
import './App.css';
import Component from './components/component'
import Form from './components/Form'

function App() {

  const [nome, setNome] = useState();
  const [idade, setIdade] = useState();
  const [job, setJob] = useState();

  return (
    <div className="App">
      <Component nome={nome} idade={idade} profissao= {job}/>
      <Form setNome={setNome} setIdade= {setIdade} setJob={setJob}/>
    </div>
  );
}

export default App;
