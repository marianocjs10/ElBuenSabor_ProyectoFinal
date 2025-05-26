package org.example.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;
import org.example.enumerables.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
//@ToString
@SuperBuilder
public class Promocion extends Base<Promocion, Long> {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    @Builder.Default
    private Set<Imagen>imagenes = new HashSet<>();
    /*
    Se creó una entidad DetallePromocion y se cambio el tipo de relación con articulo.
                    Promocion 1--->N DetallePromocion 1--->1 Articulo
    */
    @Builder.Default
    private Set<DetallePromocion>detallePromociones = new HashSet<>();

    public void addImagen(Imagen imagen){
        this.imagenes.add(imagen);
    }
    public void removeImagen(Imagen imagen){
        if(this.imagenes.contains(imagen)){
            this.imagenes.remove(imagen);
        }
    }

    public void addDetallePromocion(DetallePromocion detallePromocion){
        this.detallePromociones.add(detallePromocion);
    }
    public void removeaArticulo(Articulo articulo){
        if(this.detallePromociones.contains(articulo)){
            this.detallePromociones.remove(articulo);
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "   denominacion=" + denominacion + "\n" +
                "   fechaDesde=" + fechaDesde +"\n" +
                "   fechaHasta=" + fechaHasta +"\n" +
                "   horaDesde=" + horaDesde +"\n" +
                "   horaHasta=" + horaHasta +"\n" +
                "   descripcionDescuento=" + descripcionDescuento + "\n" +
                "   precioPromocional=" + precioPromocional +"\n" +
                "   tipoPromocion=" + tipoPromocion +"\n" +
                "   imagenes=" + imagenes +"\n" +
                "   detallePromociones=" + detallePromociones +"\n" +
                "   }";
    }
}
