package com.example.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Basic
    @Column(name = "username", length = 50)
    private String username;

}
