package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "CATEGORIAS_ID_GENERATOR", sequenceName = "SEC_CATEGORIAS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORIAS_ID_GENERATOR")
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    /**
     * Metodo encargado de retornar el valor del atributo idCategoria
     *
     * @return El idCategoria asociado a la clase
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * Metodo encargado de modificar el valor del atributo idCategoria
     *
     * @param idCategoria El nuevo idCategoria a modificar.
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * Metodo encargado de retornar el valor del atributo descripcion
     *
     * @return El descripcion asociado a la clase
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo encargado de modificar el valor del atributo descripcion
     *
     * @param descripcion El nuevo descripcion a modificar.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo encargado de retornar el valor del atributo estado
     *
     * @return El estado asociado a la clase
     */
    public Boolean getEstado() {
        return estado;
    }

    /**
     * Metodo encargado de modificar el valor del atributo estado
     *
     * @param estado El nuevo estado a modificar.
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    /**
     * Metodo encargado de retornar el valor del atributo productos
     *
     * @return El productos asociado a la clase
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Metodo encargado de modificar el valor del atributo productos
     *
     * @param productos El nuevo productos a modificar.
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}