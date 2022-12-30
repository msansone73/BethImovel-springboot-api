package br.com.msansone.bethimovel.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Landlord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
    private Manager manager;

    @NotBlank
    private String name;

    @NotBlank
    private String fone;

    private String foneSecond;

    @NotBlank
    @Email
    private String email;

    @Email
    private String emailSecond;

    @Column( length = 512)
    private String observation;



}
