package com.mycompany.udesmarket.Models;

import java.util.ArrayList;
/**
 *
 * @author Mauricio.Portilla
 */
public class Venta {
    private int idVenta;
    private String descripcionProductoVender;
    private int cantidadProductoVender;
    private double totalVenta;
    public static ArrayList<Venta> ventas=new ArrayList<>();
    
    public Venta(){
    }

    public Venta(int idVenta, String descripcionProductoVender, int cantidadProductoVender, double totalVenta) {
        this.idVenta = idVenta;
        this.descripcionProductoVender = descripcionProductoVender;
        this.cantidadProductoVender = cantidadProductoVender;
        this.totalVenta = totalVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getDescripcionProductoVender() {
        return descripcionProductoVender;
    }

    public void setDescripcionProductoVender(String descripcionProductoVender) {
        this.descripcionProductoVender = descripcionProductoVender;
    }

    public int getCantidadProductoVender() {
        return cantidadProductoVender;
    }

    public void setCantidadProductoVender(int cantidadProductoVender) {
        this.cantidadProductoVender = cantidadProductoVender;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    
    public static boolean rangoCantidad(Product productoVender,int cantidadVender){
      return cantidadVender>0 && cantidadVender<=productoVender.getCantidadProduct();
    }
}
