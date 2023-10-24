package com.JAVADEVELOPER.example.api.Modes.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddDTO {
    String name;
    String surname;
    String email;
    String password;
}