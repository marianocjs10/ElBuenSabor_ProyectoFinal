package org.example.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

@Getter
@Setter
//@ToString
@SuperBuilder
public class ArticuloManufacturadoDetalle extends Base<ArticuloManufacturadoDetalle, Long> {
    private Integer cantidad;
    private ArticuloInsumo articuloInsumo;

    @Override
    public String toString() {
        return "{\n" +
                "   cantidad=" + cantidad +"\n" +
                "   articuloInsumo=" + articuloInsumo +"\n" +
                "   }";
    }
}
