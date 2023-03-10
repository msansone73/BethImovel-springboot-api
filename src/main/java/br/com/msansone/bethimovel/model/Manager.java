package br.com.msansone.bethimovel.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank

    @NotBlank
    private String password;
    @NotBlank
    private String fone;
    private String foneSecond;
    @NotBlank
    @Email
    private String email;
    @Email
    private String emailSecond;
    @Column(length = 512)
    private String observation;
}
