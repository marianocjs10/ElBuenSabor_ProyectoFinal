package org.example.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;
@Getter
@Setter
@ToString
@SuperBuilder
public class Domicilio extends Base {
    private String calle;
    private Integer numero;
    private Integer cp;
    private Localidad localidad;
}
