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
    <div id='loginContainer'>

        <h1> Iniciar Sesión </h1>

        <form action="loginForm" method="post" onSubmit={enviarDatos}>

            <label form='email'>Email:</label>
            <input type='email' name='email' id='email' value={email} onChange={e => setEmail(e.target.value)} required></input>

            <br />

            <label form='password'>Contraseña: </label>
            <input type="password" name="password" id="password" value={password} onChange={e => setPassword(e.target.value)} required/> 

            <br />

            <button type="submit" className='botonIniciarSesion'>Iniciar Sesion</button>

        </form>
    </div>
  )
}
