package com.example.spring_project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return name;
    }
}
