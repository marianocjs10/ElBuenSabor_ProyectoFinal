package org.example.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@SuperBuilder
@Setter
@Getter
//@ToString(callSuper = true)
public class ArticuloManufacturado extends Articulo{
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle>detalles = new HashSet<>();

    public void addDetalle(ArticuloManufacturadoDetalle detalle){
        this.detalles.add(detalle);
    }
    public void removeDetalle(ArticuloManufacturadoDetalle detalle){
        if(this.detalles.contains(detalle)){
            this.detalles.remove(detalle);
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "   descripcion=" + descripcion +"\n" +
                "   tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +"\n" +
                "   preparacion=" + preparacion + "\n" +
                "   detalles=" + detalles +"\n" +
                "   }";
    }
}

