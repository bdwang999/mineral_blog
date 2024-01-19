package com.example.blog1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Likes {
    private int lId;
    private int bId;
    private int uId;
}
