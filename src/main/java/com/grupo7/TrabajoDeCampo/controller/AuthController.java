package com.grupo7.TrabajoDeCampo.controller;
import com.grupo7.TrabajoDeCampo.DTO.UserRegisterRequest;
import com.grupo7.TrabajoDeCampo.DTO.UserLoginRequest;
import com.grupo7.TrabajoDeCampo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.grupo7.TrabajoDeCampo.repository.UserRepository;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Registro de usuario
    @PostMapping("/register")
    public String register(@RequestBody UserRegisterRequest request) {  //uso de UserLoginRequest
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return "El correo ya está registrado.";
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword())); // encripta la contraseña

        userRepository.save(user);

        return "Usuario registrado con éxito: " + user.getEmail();
    }

    // Login de usuario
    @PostMapping("/login")
    public String login(@RequestBody UserLoginRequest request) {  //Uso de UserLoginRequest
        Optional<User> userOpt = userRepository.findByEmail(request.getEmail());

        if (userOpt.isEmpty()) {
            return "Usuario no encontrado.";
        }

        User user = userOpt.get();

        if (passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return "Login exitoso: " + user.getEmail();
        } else {
            return "Contraseña incorrecta.";
        }
    }


}
