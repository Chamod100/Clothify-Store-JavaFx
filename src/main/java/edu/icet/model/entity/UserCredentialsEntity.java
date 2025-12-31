package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class  UserCredentialsEntity {
    @Id
    private String id;
    private String employeeID;
    private String email;
    private String password;
    private String role;
    private LocalDateTime createdAt;
}
