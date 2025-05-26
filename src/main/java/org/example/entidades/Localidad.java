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
public class Localidad extends Base<Localidad, Long> {
    private String nombre;
    private Provincia provincia;
}
