package org.example.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;
import org.example.enumerables.EstadoPedido;
import org.example.enumerables.FormaPago;
import org.example.enumerables.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@ToString
@SuperBuilder
public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private static Double total = 0.0;
    private Double totalCosto;
    private EstadoPedido estadoPedido;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    @Builder.Default
    private Set<DetallePedido> detallesPedido=new HashSet<>();

    public void addDetallePedido(DetallePedido detallePedido){
        this.detallesPedido.add(detallePedido);
        if (this.detallesPedido.contains(detallePedido)) {
            this.total = this.total + detallePedido.getSubTotal();
        }
        getFactura().setTotalVenta(this.total);
    }
    public void removeDetallePedido(DetallePedido detallePedido){
        if(this.detallesPedido.contains(detallePedido)) {
            this.detallesPedido.remove(detallePedido);
            this.total = this.total - detallePedido.getSubTotal();
        }
        getFactura().setTotalVenta(this.total);
    }

    @Override
    public String toString() {
        return "{\n" +
                "    horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ",   total=" + total +
                ",   totalCosto=" + totalCosto +
                ",   estado=" + estadoPedido +
                ",   tipoEnvio=" + tipoEnvio +
                ",   formaPago=" + formaPago +
                ",   fechaPedido=" + fechaPedido +"\n" +
                "    domicilio=" + domicilio +"\n" +
                "    sucursal=" + sucursal.getNombre() +"\n" +
                "    factura=" + factura +"\n" +
                "    detallesPedido=" + detallesPedido +
                "}\n";
    }
}
