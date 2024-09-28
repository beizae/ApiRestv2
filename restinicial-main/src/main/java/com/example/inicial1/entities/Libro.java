package com.example.inicial1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

//jpa
@Entity
//Lombok
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
// envers auditoria
@Audited

public class Libro extends Base {

    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    private String autor;


    @ManyToMany(cascade = CascadeType.REFRESH)
    private Set<Autor> autores;

}
