import './LogIn.css'
import {useState, useEffect} from 'react'


export default function LogIn({ setEstaLogueado }) {
    
  //Estado para guardar los datos del usuario
    const [usuario, setUsuario] = useState({
        email: "",
        password: ""
    });

    //const [error, setError] = useState(false);
  
  //Manejo de cambios en los inputs
    const handleChange = (e) => {
        setUsuario({...usuario, [e.target.name]: e.target.value});
    }; 
    
  //Manejo del envio de datos
    const enviarDatos = async (evento) => {
        evento.preventDefault();
        // console.log("Email: " + usuario.email);
        // console.log("Contraseña: " + usuario.password);
        console.log("Datos enviados:", {
                  email: usuario.email.trim(),
                  password: usuario.password.trim()
              });

        try {
          const res = await fetch('http://localhost:8081/auth/login', {
              method: 'POST',
              headers: {
                  'Content-Type': 'application/json'
              },
              body: JSON.stringify({
                  email: usuario.email.trim(),
                  password: usuario.password.trim()
              })
          });

          if (!res.ok) {
              // try to read error body, fallback to status text
              const errText = await res.text();
              console.error('Login failed:', errText || res.statusText);
              return;
          }

          const data = await res.json();
          console.log("Login OK:", data);
          // handle successful login (save token, redirect, set state...)
        } catch (err) {
          console.error('Network or parsing error:', err);
        }
        // setEstaLogueado([usuario.email, usuario.password]);
    }; 


  return (
    <div className = 'form' id='loginContainer'>

        <h1 className='txt'> Iniciar Sesión </h1>

        <form action="loginForm" method="post" onSubmit={enviarDatos} className='formularioLogin'>

            <label form='email' className='formLabel'>
              <span>Email: </span>
              <input type='email' name='email' id='email' placeholder='example@mail.com' value={usuario.email} onChange={handleChange} required></input>
            </label>

            <label form='password' className='formLabel'> 
              <span>Contraseña:</span>
              <input type='password' name='password' id='password' placeholder='Contraseña' value={usuario.password} onChange={handleChange} required/> 
            </label>
            <div className='boton'>
              <button type="submit" className='botonIniciarSesion'>Iniciar Sesion</button>
            </div>
        </form>
    </div>
  )
}
