package com.example.blog1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
}
