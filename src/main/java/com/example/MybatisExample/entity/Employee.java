package com.example.MybatisExample.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private int ID;
    private String FIRST_NAME;
    private String LAST_NAME;


}
