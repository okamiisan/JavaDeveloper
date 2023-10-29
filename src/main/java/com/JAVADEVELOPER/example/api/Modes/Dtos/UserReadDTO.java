package com.JAVADEVELOPER.example.api.Modes.Dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserReadDTO {
    Integer id;
    String name;
    String surname;
    String email;
}
