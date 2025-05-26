package org.example.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

@Getter
@Setter
@SuperBuilder
@ToString
public class Imagen extends Base{
    private String denominacion;
}
