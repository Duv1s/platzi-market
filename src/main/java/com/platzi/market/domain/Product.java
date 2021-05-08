package com.platzi.market.domain;

public class Product {
    private int productId;

    private String name;

    private int categoryId;

    private double price;

    private int stock;

    private boolean active;

    private Category category;

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
     * Metodo encargado de retornar el valor del atributo name
     *
     * @return El name asociado a la clase
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo encargado de modificar el valor del atributo name
     *
     * @param name El nuevo name a modificar.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo encargado de retornar el valor del atributo categoryId
     *
     * @return El categoryId asociado a la clase
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Metodo encargado de modificar el valor del atributo categoryId
     *
     * @param categoryId El nuevo categoryId a modificar.
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Metodo encargado de retornar el valor del atributo price
     *
     * @return El price asociado a la clase
     */
    public double getPrice() {
        return price;
    }

    /**
     * Metodo encargado de modificar el valor del atributo price
     *
     * @param price El nuevo price a modificar.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Metodo encargado de retornar el valor del atributo stock
     *
     * @return El stock asociado a la clase
     */
    public int getStock() {
        return stock;
    }

    /**
     * Metodo encargado de modificar el valor del atributo stock
     *
     * @param stock El nuevo stock a modificar.
     */
    public void setStock(int stock) {
        this.stock = stock;
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

    /**
     * Metodo encargado de retornar el valor del atributo category
     *
     * @return El category asociado a la clase
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Metodo encargado de modificar el valor del atributo category
     *
     * @param category El nuevo category a modificar.
     */
    public void setCategory(Category category) {
        this.category = category;
    }
}
