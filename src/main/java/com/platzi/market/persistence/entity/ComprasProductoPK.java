package com.platzi.market.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    /**
     * Metodo encargado de retornar el valor del atributo idCompra
     *
     * @return El idCompra asociado a la clase
     */
    public Integer getIdCompra() {
        return idCompra;
    }

    /**
     * Metodo encargado de modificar el valor del atributo idCompra
     *
     * @param idCompra El nuevo idCompra a modificar.
     */
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * Metodo encargado de retornar el valor del atributo idProducto
     *
     * @return El idProducto asociado a la clase
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * Metodo encargado de modificar el valor del atributo idProducto
     *
     * @param idProducto El nuevo idProducto a modificar.
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
