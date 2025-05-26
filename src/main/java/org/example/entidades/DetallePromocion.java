package org.example.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

@SuperBuilder
@Setter
@Getter
//@ToString
public class DetallePromocion extends Base {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    @Override
    public String toString() {
        return "{\n" +
                "   cantidad=" + cantidad +"\n" +
                "   subTotal=" + subTotal +"\n" +
                "   articulo=" + articulo +"\n" +
                "   }";
    }
}
