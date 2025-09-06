import './LogIn.css'
import {useState} from 'react'


export default function LogIn({ setEstaLogueado }) {


    const [email, setEmail] = useState(""); 
    const [password, setPassword] = useState("");
    //const [error, setError] = useState(false);

    const enviarDatos = (evento) => {
        evento.preventDefault();
        console.log("Email: " + email);
        console.log("Contraseña: " + password);

        setEstaLogueado([email, password]);

    }


  return (
    <div className = 'form' id='loginContainer'>

        <h1> Iniciar Sesión </h1>

        <form action="loginForm" method="post" onSubmit={enviarDatos} className='formularioLogin'>

            <label form='email'>
              <span>Email: </span><br />
              <input type='email' name='email' id='email' value={email} onChange={e => setEmail(e.target.value)} required></input>
            </label>

            <label form='password'> 
              <span>Contraseña:</span>
              <input type="password" name="password" id="password" value={password} onChange={e => setPassword(e.target.value)} required/> 
            </label>
            <div className='boton'>
              <button type="submit" className='botonIniciarSesion'>Iniciar Sesion</button>
            </div>
        </form>
    </div>
  )
}
