package com.mycompany.udesmarket.Models;
/**
 *
 * @author Mauricio.portilla
 */
public class Product {
   private String descripcionProduct;
   private double precioProduct;
   private int cantidadProduct;
   private boolean existeProduct;
   
    public Product(){
    }
    
    public Product(String descripcionProduct, double precioProduct, int cantidadProduct) {
        this.descripcionProduct = descripcionProduct;
        this.precioProduct = precioProduct;
        this.cantidadProduct = cantidadProduct;
        this.existeProduct = true;
    }

    public String getDescripcionProduct() {
        return descripcionProduct;
    }

    public void setDescripcionProduct(String descripcionProduct) {
        this.descripcionProduct = descripcionProduct;
    }

    public double getPrecioProduct() {
        return precioProduct;
    }

    public void setPrecioProduct(double precioProduct) {
        this.precioProduct = precioProduct;
    }

    public int getCantidadProduct() {
        return cantidadProduct;
    }

    public void setCantidadProduct(int cantidadProduct) {
        this.cantidadProduct = cantidadProduct;
    }

    public boolean isExisteProduct() {
        return existeProduct;
    }

    public void setExisteProduct(boolean existeProduct) {
        this.existeProduct = existeProduct;
    }
    
    
   
}
