package com.platzi.market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private String id;

    private String nombre;

    private String apellidos;

    private Long celular;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    /**
     * Metodo encargado de retornar el valor del atributo id
     *
     * @return El id asociado a la clase
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo encargado de modificar el valor del atributo id
     *
     * @param id El nuevo id a modificar.
     */
    public void setId(String id) {
        this.id = id;
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
     * Metodo encargado de retornar el valor del atributo apellidos
     *
     * @return El apellidos asociado a la clase
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Metodo encargado de modificar el valor del atributo apellidos
     *
     * @param apellidos El nuevo apellidos a modificar.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo encargado de retornar el valor del atributo celular
     *
     * @return El celular asociado a la clase
     */
    public Long getCelular() {
        return celular;
    }

    /**
     * Metodo encargado de modificar el valor del atributo celular
     *
     * @param celular El nuevo celular a modificar.
     */
    public void setCelular(Long celular) {
        this.celular = celular;
    }

    /**
     * Metodo encargado de retornar el valor del atributo direccion
     *
     * @return El direccion asociado a la clase
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo encargado de modificar el valor del atributo direccion
     *
     * @param direccion El nuevo direccion a modificar.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo encargado de retornar el valor del atributo correoElectronico
     *
     * @return El correoElectronico asociado a la clase
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Metodo encargado de modificar el valor del atributo correoElectronico
     *
     * @param correoElectronico El nuevo correoElectronico a modificar.
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}