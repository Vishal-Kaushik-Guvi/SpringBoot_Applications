package com.Guvi.SpringBootPractiseEmployee.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_name") // Changed to match the column name in the database
    private String role;

    public Role(String role) {
        this.role = role;
    }

    // Default constructor and getters/setters as needed
}


