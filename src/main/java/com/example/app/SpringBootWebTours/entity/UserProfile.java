package com.example.app.SpringBootWebTours.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {
    private String username;
    private String fullName;
    private String email;
    private String nickname;
}