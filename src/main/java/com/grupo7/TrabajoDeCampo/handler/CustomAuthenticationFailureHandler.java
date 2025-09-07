package com.grupo7.TrabajoDeCampo.handler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.support.SessionFlashMapManager;

import java.io.IOException;

@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        FlashMapManager flashMapManager = new SessionFlashMapManager();
        FlashMap flashMap = new FlashMap();

        if (exception instanceof DisabledException) {
            String email = request.getParameter("email");
            flashMap.put("unverified", true);
            flashMap.put("email", email);
            flashMapManager.saveOutputFlashMap(flashMap, request, response);
            response.sendRedirect(request.getContextPath() + "/auth/verify");
        } else {
            flashMap.put("loginError", "Correo o contraseña incorrectos.");
            flashMapManager.saveOutputFlashMap(flashMap, request, response);
            response.sendRedirect(request.getContextPath() + "/auth/");
        }
    }
}