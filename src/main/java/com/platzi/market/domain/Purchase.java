package com.platzi.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private int purchaseId;

    private String clientId;

    private LocalDateTime date;

    private String paymentMethod;

    private String comment;

    private String state;

    private List<PurchaseItem> item;

    /**
     * Metodo encargado de retornar el valor del atributo purchaseId
     *
     * @return El purchaseId asociado a la clase
     */
    public int getPurchaseId() {
        return purchaseId;
    }

    /**
     * Metodo encargado de modificar el valor del atributo purchaseId
     *
     * @param purchaseId El nuevo purchaseId a modificar.
     */
    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     * Metodo encargado de retornar el valor del atributo clientId
     *
     * @return El clientId asociado a la clase
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Metodo encargado de modificar el valor del atributo clientId
     *
     * @param clientId El nuevo clientId a modificar.
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Metodo encargado de retornar el valor del atributo date
     *
     * @return El date asociado a la clase
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Metodo encargado de modificar el valor del atributo date
     *
     * @param date El nuevo date a modificar.
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * Metodo encargado de retornar el valor del atributo paymentMethod
     *
     * @return El paymentMethod asociado a la clase
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Metodo encargado de modificar el valor del atributo paymentMethod
     *
     * @param paymentMethod El nuevo paymentMethod a modificar.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Metodo encargado de retornar el valor del atributo comment
     *
     * @return El comment asociado a la clase
     */
    public String getComment() {
        return comment;
    }

    /**
     * Metodo encargado de modificar el valor del atributo comment
     *
     * @param comment El nuevo comment a modificar.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Metodo encargado de retornar el valor del atributo state
     *
     * @return El state asociado a la clase
     */
    public String getState() {
        return state;
    }

    /**
     * Metodo encargado de modificar el valor del atributo state
     *
     * @param state El nuevo state a modificar.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Metodo encargado de retornar el valor del atributo item
     *
     * @return El item asociado a la clase
     */
    public List<PurchaseItem> getItem() {
        return item;
    }

    /**
     * Metodo encargado de modificar el valor del atributo item
     *
     * @param item El nuevo item a modificar.
     */
    public void setItem(List<PurchaseItem> item) {
        this.item = item;
    }
}
