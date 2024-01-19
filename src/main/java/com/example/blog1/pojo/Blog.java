package com.example.blog1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private int bId;
    private int uId;
    private String title;
    private String content;
    private String date;
}
