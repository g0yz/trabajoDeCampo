import logo from './assets/logo.svg';

import LogIn from './components/LogIn/LogIn';
import Home from './components/Home/Home';
import {useState} from 'react';

import './App.css';

function App() {

  const [estaLogueado, setEstaLogueado] = useState([]);



  return (
    <div className="App">
      <header className="App-header">
        {
          !estaLogueado.length > 0 
            ?  <LogIn setEstaLogueado={setEstaLogueado}  />  
            : <Home />
        }
        
       
        

      </header>
    </div>
  );
}

export default App;
