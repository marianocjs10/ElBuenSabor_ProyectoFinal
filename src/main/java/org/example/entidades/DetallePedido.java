package org.example.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

@Setter
@Getter
//@ToString
@SuperBuilder
public class DetallePedido extends Base<DetallePedido, Long> {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articuloPedido;

    public void calcularSubTotal(){
        this.subTotal = articuloPedido.getPrecioVenta() * this.cantidad;
    }

    @Override
    public String toString() {
        return "{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulosPedido=" + articuloPedido.getDenominacion() +
                "}";
    }
}
