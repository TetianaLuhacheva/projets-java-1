package com.projets_profesionels.v01.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {                      // <- O.o - lié à AuthController.java
    private String email;
    private String username;
    private String password;
} 
