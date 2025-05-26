package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Getter
@Setter
@SuperBuilder
public abstract class Base {
    private Long id;
    @Builder.Default
    private Boolean estado = false;
}
