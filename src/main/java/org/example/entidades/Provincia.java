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
public class Provincia extends Base<Provincia, Long> {
    private String nombre;
    private Pais pais;
}
