package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;

    private Integer cantidad;

    private Double total;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    /**
     * Metodo encargado de retornar el valor del atributo id
     *
     * @return El id asociado a la clase
     */
    public ComprasProductoPK getId() {
        return id;
    }

    /**
     * Metodo encargado de modificar el valor del atributo id
     *
     * @param id El nuevo id a modificar.
     */
    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    /**
     * Metodo encargado de retornar el valor del atributo cantidad
     *
     * @return El cantidad asociado a la clase
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Metodo encargado de modificar el valor del atributo cantidad
     *
     * @param cantidad El nuevo cantidad a modificar.
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo encargado de retornar el valor del atributo total
     *
     * @return El total asociado a la clase
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Metodo encargado de modificar el valor del atributo total
     *
     * @param total El nuevo total a modificar.
     */
    public void setTotal(Double total) {
        this.total = total;
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
}
