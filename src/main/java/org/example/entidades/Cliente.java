package org.example.entidades;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
//@ToString
@SuperBuilder
public class Cliente extends Base<Cliente, Long>{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    private ImagenCliente imagenCliente;
    @Builder.Default
    private Set<Domicilio> domicilios=new HashSet<>();
    @Builder.Default
    private Set<Pedido>pedidos=new HashSet<>();

    public void addDomicilio(Domicilio domicilio){
        this.domicilios.add(domicilio);
    }
    public void removeDomicilio(Domicilio domicilio){
        if(this.domicilios.contains(domicilio)){
            this.domicilios.remove(domicilio);
        }
    }
    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    public void removePedido(Pedido pedido){
        if(this.pedidos.contains(pedido)){
            this.pedidos.remove(pedido);
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +"\n" +
                ", usuario=" + usuario +
                ", imagenCliente=" + imagenCliente +"\n" +
                ", domicilios=" + domicilios +"\n" +
                ", pedidos=" + pedidos +
                "} ";
    }
}
