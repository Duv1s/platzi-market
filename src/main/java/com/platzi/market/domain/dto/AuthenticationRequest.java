package com.platzi.market.domain.dto;

public class AuthenticationRequest {

    private String username;

    private String password;

    /**
     * Metodo encargado de retornar el valor del atributo username
     *
     * @return El username asociado a la clase
     */
    public String getUsername() {
        return username;
    }

    /**
     * Metodo encargado de modificar el valor del atributo username
     *
     * @param username El nuevo username a modificar.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Metodo encargado de retornar el valor del atributo password
     *
     * @return El password asociado a la clase
     */
    public String getPassword() {
        return password;
    }

    /**
     * Metodo encargado de modificar el valor del atributo password
     *
     * @param password El nuevo password a modificar.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
