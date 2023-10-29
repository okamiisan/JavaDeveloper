package com.JAVADEVELOPER.example.api.Controllers;

import com.JAVADEVELOPER.example.api.Modes.Dtos.SignupRequestDTO;
import com.JAVADEVELOPER.example.api.Security.AuthCredentials;
import com.JAVADEVELOPER.example.api.Security.TokenUtils;
import com.JAVADEVELOPER.example.api.Security.UserDetailServiceImpl;
import com.JAVADEVELOPER.example.api.Security.UserDetailsImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserDetailServiceImpl userDetailService;
    private final AuthenticationManager authenticationManager;


    public AuthController(UserDetailServiceImpl userDetailService, AuthenticationManager authenticationManager) {
        this.userDetailService = userDetailService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignupRequestDTO signUpRequest) {
        if(userDetailService.registerUser(signUpRequest) != null) {
            return ResponseEntity.ok("Usuario registrado con éxito");
        } else {
            return ResponseEntity.badRequest().body("Error al registrar el usuario");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody AuthCredentials loginRequest) {


        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getPassword()
                )
        );

        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        String jwt = TokenUtils.createToken(userDetails.getName(), userDetails.getUsername());


        return ResponseEntity.ok("Bearer " + jwt);
    }
}
