package com.platzi.market.domain;

public class PurchaseItem {
    private int productId;
    private int quantity;
    private double total;
    private boolean active;

    /**
     * Metodo encargado de retornar el valor del atributo productId
     *
     * @return El productId asociado a la clase
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Metodo encargado de modificar el valor del atributo productId
     *
     * @param productId El nuevo productId a modificar.
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Metodo encargado de retornar el valor del atributo quantity
     *
     * @return El quantity asociado a la clase
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Metodo encargado de modificar el valor del atributo quantity
     *
     * @param quantity El nuevo quantity a modificar.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Metodo encargado de retornar el valor del atributo total
     *
     * @return El total asociado a la clase
     */
    public double getTotal() {
        return total;
    }

    /**
     * Metodo encargado de modificar el valor del atributo total
     *
     * @param total El nuevo total a modificar.
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Metodo encargado de retornar el valor del atributo active
     *
     * @return El active asociado a la clase
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Metodo encargado de modificar el valor del atributo active
     *
     * @param active El nuevo active a modificar.
     */
    public void setActive(boolean active) {
        this.active = active;
    }
}
