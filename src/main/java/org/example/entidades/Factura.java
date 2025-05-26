package org.example.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;
import org.example.enumerables.FormaPago;

import java.time.LocalDate;

@SuperBuilder
@Getter
@Setter
@ToString
public class Factura extends Base {
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private Double totalVenta;
}
