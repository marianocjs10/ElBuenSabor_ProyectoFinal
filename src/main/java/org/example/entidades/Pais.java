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
public class Pais extends Base {
    private String nombre;
}
