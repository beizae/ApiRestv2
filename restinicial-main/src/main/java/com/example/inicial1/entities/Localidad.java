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

public class Localidad extends Base {

    private String denominacion;



}
