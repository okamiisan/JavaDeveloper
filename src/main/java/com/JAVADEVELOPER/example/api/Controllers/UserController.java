package com.JAVADEVELOPER.example.api.Controllers;

import com.JAVADEVELOPER.example.api.Modes.Domain.UserAddDTO;
import com.JAVADEVELOPER.example.api.Modes.Domain.UserReadDTO;
import org.springframework.http.ResponseEntity;
import com.JAVADEVELOPER.example.api.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserReadDTO>>findAllUsers(){
        return ResponseEntity.ok(userService.findAll());

    }

    @PostMapping
    public ResponseEntity<UserReadDTO> add(@RequestBody UserAddDTO userAddDTO){
        return ResponseEntity.ok(userService.add(userAddDTO));

    }

}
