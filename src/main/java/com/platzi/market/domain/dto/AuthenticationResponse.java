package com.platzi.market.domain.dto;

public class AuthenticationResponse {

    private String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    /**
     * Metodo encargado de retornar el valor del atributo jwt
     *
     * @return El jwt asociado a la clase
     */
    public String getJwt() {
        return jwt;
    }

    /**
     * Metodo encargado de modificar el valor del atributo jwt
     *
     * @param jwt El nuevo jwt a modificar.
     */
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
