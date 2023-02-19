package com.mycompany.udesmarket.Models;

import java.util.ArrayList;
/**
 *
 * @author Mauricio.Portilla
 */
public class Inventario {
    public static ArrayList<Product> productos=new ArrayList<>();
    
     public static boolean existeProducto(String descripcion,ArrayList<Product> productosAdd){
       if(productosAdd!=null){
        for (Product pr: productos){
            if(pr.getDescripcionProduct().equals(descripcion)){
                return true;
            }
        }
       }
        return false;
    }
     
     public static Product existeProductoVender(String descripcion,ArrayList<Product> productosSell){
       if(productosSell!=null){
         for (Product pr: productos){
            if(pr.getDescripcionProduct().equals(descripcion)){
                return pr;
            }
        }
       }
        return null;
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
