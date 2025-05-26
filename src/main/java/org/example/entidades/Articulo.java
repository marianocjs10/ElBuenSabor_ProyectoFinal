package org.example.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@SuperBuilder
public abstract class Articulo extends Base {
    protected String denominacion;
    private Double precioVenta;
    private UnidadMedida unidadMedida;
    @Builder.Default
    private Set<Imagen>imagenes = new HashSet<>();

    public void addImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
    public void removeImagen(Imagen imagen){
        if(this.imagenes.contains(imagen)){
            this.imagenes.remove(imagen);
        }
    }
}
