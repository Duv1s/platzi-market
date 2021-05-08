package com.platzi.market.domain;

public class Category {

    private int categoryId;

    private String category;

    private boolean active;

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
     * Metodo encargado de retornar el valor del atributo category
     *
     * @return El category asociado a la clase
     */
    public String getCategory() {
        return category;
    }

    /**
     * Metodo encargado de modificar el valor del atributo category
     *
     * @param category El nuevo category a modificar.
     */
    public void setCategory(String category) {
        this.category = category;
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
