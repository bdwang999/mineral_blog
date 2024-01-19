package com.example.blog1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Collect {
    private int cId;
    private int uId;
    private int bId;
    private String collectName;
}
