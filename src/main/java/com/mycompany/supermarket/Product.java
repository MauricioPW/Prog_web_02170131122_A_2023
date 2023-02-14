package com.mycompany.supermarket;

import java.util.ArrayList;

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
    
    public static Product existeProducto(String descripcion,ArrayList<Product> productos){
        for (Product pr: productos){
            if(pr.getDescripcionProduct().equals(descripcion)){
                return pr;
            }
        }
        return null;
    }
   
    public static boolean rangoCantidad(Product productoVender,int cantidadVender){
      return cantidadVender>0 && cantidadVender<=productoVender.getCantidadProduct();
    }
    
    public static void actualizarCantidadProducto(ArrayList<Product> productos, int cantidadVender,String descripcionVender){
        for(int i=0; i<productos.size();i++){
            if(productos.get(i).getDescripcionProduct().equals(descripcionVender)){
             productos.get(i).setCantidadProduct(productos.get(i).getCantidadProduct()-cantidadVender);
             break;
            }
        }
    }
   
}
