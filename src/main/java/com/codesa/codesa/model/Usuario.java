package com.codesa.codesa.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "T_USUARIO")

public class Usuario {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Id
    @Column
    private int USUARIO_ID;
    
    @Column
    private int USUARIO_ROL;
    
    @Column
    private String USUARIO_NOMBRE;
    
    @Column
    private String USUARIO_ACTIVO;

}
