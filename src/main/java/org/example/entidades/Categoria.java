package org.example.entidades;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.example.Base;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
//@ToString
@SuperBuilder
public class Categoria extends Base {
    private String denominacion;
    @ToString.Exclude
    private Categoria categoriasPadre;
    @Builder.Default
    private Set<Categoria> subCategorias = new HashSet<>();
    @Builder.Default
    private Set<Articulo> articulos = new HashSet<>();

    public void addSubCategoria(Categoria categoria){
        this.subCategorias.add(categoria);
        categoria.setCategoriasPadre(this);
    }

    public void removeSubCategoria(Categoria categoria){
        this.subCategorias.remove(categoria);
        categoria.setCategoriasPadre(null);
    }

    public void addArticulo(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void removeArticulo(Articulo articulo){
        if(this.articulos.contains(articulo)) {
            this.articulos.remove(articulo);
        }
    }

    @Override
    public String toString() {
        return "{\n" +
                "   denominacion='" + denominacion +"\n" +
                "   subCategorias=" + subCategorias +"\n" +
              //"   articulos=" + articulos +"\n" +
                "   }";
    }
}
