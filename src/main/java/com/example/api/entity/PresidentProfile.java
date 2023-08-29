package com.example.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "President")
public class PresidentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long presidentID;
    private String name;
    private int mobileNumber;
    private String email;
    private String password;
    private String gender;
    @Column(name = "president_image_name")
    private String image_name;
}
