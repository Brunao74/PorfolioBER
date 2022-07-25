package com.porfolioBER.BER.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Size(min = 1, max = 60)
    private Long Id;
    
    @NotNull
    @Size(min = 1, max = 60, message = "error")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 60, message = "error")
    private String apellido;
    
    @Size(min = 1, max = 60)
    private String img;

}