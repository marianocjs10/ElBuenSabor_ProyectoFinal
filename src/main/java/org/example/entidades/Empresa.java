package org.example.entidades;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.Base;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@ToString
@SuperBuilder
public class Empresa extends Base<Empresa, Long> {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    public void removeSucursal(Sucursal sucursal){
        if(this.sucursales.contains(sucursal)){
            this.sucursales.remove(sucursal);
        }
    }

    @Override
    public String toString() {
        return "Empresa: {\n" +
                "   nombre=" + nombre + "\n" +
                "   razonSocial=" + razonSocial + "\n" +
                "   cuil=" + cuil +"\n" +
                "   sucursales=" + sucursales +"\n" +
                "} ";
    }
}
