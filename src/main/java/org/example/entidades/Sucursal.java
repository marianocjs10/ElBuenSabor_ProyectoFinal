package org.example.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@ToString
@SuperBuilder
public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    @Builder.Default
    private Set<Categoria>categorias = new HashSet<>();
    @Builder.Default
    private Set<Promocion>promociones = new HashSet<>();

    public void addPromocion(Promocion promocion){
        this.promociones.add(promocion);
    }

    public void removePromocion(Promocion promocion){
        if(this.promociones.contains(promocion)){
            this.promociones.remove(promocion);
        }
    }

    public void addCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }

    public void removeCategoria(Categoria categoria){
        if(this.categorias.contains(categoria)){
            this.categorias.remove(categoria);
        }
    }

    @Override
    public String toString() {
        return "\n  Sucursal{\n" +
                "   nombre=" + nombre + "\n" +
                "   horarioApertura=" + horarioApertura +"\n" +
                "   horarioCierre=" + horarioCierre +"\n" +
                "   domicilio=" + domicilio +"\n" +
                "   categorias=" + categorias +"\n" +
                "   promociones=" + promociones +"\n" +
                "   }\n ";
    }
}
