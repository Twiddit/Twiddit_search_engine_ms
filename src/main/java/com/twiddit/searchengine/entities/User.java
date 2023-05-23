package com.twiddit.searchengine.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@JsonIgnoreProperties
public class User {

    @Id
    private String id;

    private String email;

    private String birthday;

    private String phone;

    private String profile_photo;

    private String description;

    private String username;
}
