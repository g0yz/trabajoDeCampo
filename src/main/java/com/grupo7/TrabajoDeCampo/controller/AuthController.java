package com.grupo7.TrabajoDeCampo.controller;

import com.grupo7.TrabajoDeCampo.DTO.UserRegisterRequest;
import com.grupo7.TrabajoDeCampo.DTO.UserLoginRequest;
import com.grupo7.TrabajoDeCampo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.grupo7.TrabajoDeCampo.repository.UserRepository;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Map;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000") // permite frontend React
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    // Registro de usuario
    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody UserRegisterRequest request) {  //uso de UserLoginRequest
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(Map.of("error", "El correo ya está registrado."));
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword())); // encripta la contraseña

        userRepository.save(user);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("message", "Usuario registrado con éxito", "email", user.getEmail()));
    }

     // Login de usuario con AuthenticationManager
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserLoginRequest request) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
            );

            UserDetails userDetails = (UserDetails) authentication.getPrincipal();

            return ResponseEntity.ok(Map.of(
                    "message", "Login exitoso",
                    "email", userDetails.getUsername()
            ));

        } catch (BadCredentialsException e) {
            return ResponseEntity
                    .status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("error", "Usuario o contraseña incorrectos"));
        }
    }


}
