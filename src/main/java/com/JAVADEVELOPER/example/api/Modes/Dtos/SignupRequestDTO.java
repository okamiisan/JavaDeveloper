package com.JAVADEVELOPER.example.api.Modes.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignupRequestDTO {
    private String name;
    private String surname;
    private String email;
    private String password;
}