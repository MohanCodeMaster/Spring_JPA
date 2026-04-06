package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String course;

    // getters & setters
}