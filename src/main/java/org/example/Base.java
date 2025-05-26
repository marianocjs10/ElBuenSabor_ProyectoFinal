package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Getter
@Setter
@SuperBuilder
public abstract class Base <T, K extends Serializable> {
    private Long id;
    private Boolean estado;
}
