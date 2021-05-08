package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    @SequenceGenerator(allocationSize = 1, name = "COMPRAS_ID_GENERATOR", sequenceName = "SEC_COMPRAS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMPRAS_ID_GENERATOR")
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name = "medio_pago")
    private String medioPago;

    private String comentario;

    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "compra", cascade = {CascadeType.ALL})
    private List<ComprasProducto> productos;

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
     * Metodo encargado de retornar el valor del atributo idCliente
     *
     * @return El idCliente asociado a la clase
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Metodo encargado de modificar el valor del atributo idCliente
     *
     * @param idCliente El nuevo idCliente a modificar.
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Metodo encargado de retornar el valor del atributo fecha
     *
     * @return El fecha asociado a la clase
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Metodo encargado de modificar el valor del atributo fecha
     *
     * @param fecha El nuevo fecha a modificar.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Metodo encargado de retornar el valor del atributo medioPago
     *
     * @return El medioPago asociado a la clase
     */
    public String getMedioPago() {
        return medioPago;
    }

    /**
     * Metodo encargado de modificar el valor del atributo medioPago
     *
     * @param medioPago El nuevo medioPago a modificar.
     */
    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    /**
     * Metodo encargado de retornar el valor del atributo comentario
     *
     * @return El comentario asociado a la clase
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Metodo encargado de modificar el valor del atributo comentario
     *
     * @param comentario El nuevo comentario a modificar.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Metodo encargado de retornar el valor del atributo estado
     *
     * @return El estado asociado a la clase
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo encargado de modificar el valor del atributo estado
     *
     * @param estado El nuevo estado a modificar.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo encargado de retornar el valor del atributo cliente
     *
     * @return El cliente asociado a la clase
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Metodo encargado de modificar el valor del atributo cliente
     *
     * @param cliente El nuevo cliente a modificar.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Metodo encargado de retornar el valor del atributo productos
     *
     * @return El productos asociado a la clase
     */
    public List<ComprasProducto> getProductos() {
        return productos;
    }

    /**
     * Metodo encargado de modificar el valor del atributo productos
     *
     * @param productos El nuevo productos a modificar.
     */
    public void setProductos(List<ComprasProducto> productos) {
        this.productos = productos;
    }
}
