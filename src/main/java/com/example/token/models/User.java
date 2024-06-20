package com.example.token.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class User extends BaseModel {
    private String name;
    private String email;
    private String hashedPassword;

    @ManyToMany
    private List<Roles> rolesList;
    private Boolean isVerified;
}
