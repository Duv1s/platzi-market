package com.platzi.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "PRODUCTOS_ID_GENERATOR", sequenceName = "SEC_PRODUCTOS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTOS_ID_GENERATOR")
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

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

    /**
     * Metodo encargado de retornar el valor del atributo nombre
     *
     * @return El nombre asociado a la clase
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo encargado de modificar el valor del atributo nombre
     *
     * @param nombre El nuevo nombre a modificar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
     * Metodo encargado de retornar el valor del atributo codigoBarras
     *
     * @return El codigoBarras asociado a la clase
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Metodo encargado de modificar el valor del atributo codigoBarras
     *
     * @param codigoBarras El nuevo codigoBarras a modificar.
     */
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    /**
     * Metodo encargado de retornar el valor del atributo precioVenta
     *
     * @return El precioVenta asociado a la clase
     */
    public Double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Metodo encargado de modificar el valor del atributo precioVenta
     *
     * @param precioVenta El nuevo precioVenta a modificar.
     */
    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Metodo encargado de retornar el valor del atributo cantidadStock
     *
     * @return El cantidadStock asociado a la clase
     */
    public Integer getCantidadStock() {
        return cantidadStock;
    }

    /**
     * Metodo encargado de modificar el valor del atributo cantidadStock
     *
     * @param cantidadStock El nuevo cantidadStock a modificar.
     */
    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
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
     * Metodo encargado de retornar el valor del atributo categoria
     *
     * @return El categoria asociado a la clase
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Metodo encargado de modificar el valor del atributo categoria
     *
     * @param categoria El nuevo categoria a modificar.
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
