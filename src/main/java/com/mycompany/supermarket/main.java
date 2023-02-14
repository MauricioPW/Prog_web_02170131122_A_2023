package com.mycompany.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList <Product> productos =new ArrayList();
        
        System.out.println("*********UDESMARKET*********");
        Scanner sc=new Scanner(System.in);
        int opc=0;
        do {            
            System.out.println("Ingrese una oprcion: \n 1. Agregar \n 2. Vender \n 3. Salir");
             opc=sc.nextInt();
             
             switch (opc){
                 case 1:
                     System.out.println("Ingrese el nombre del producto");
                     String descripcionProdcuto=sc.next();
                     System.out.println("Ingrese el precio del producto");
                     int precioProdcuto=sc.nextInt();
                     System.out.println("Ingrese la cantidad del producto");
                     int cantidadProdcuto=sc.nextInt();
                     productos.add(new Product(descripcionProdcuto,precioProdcuto,cantidadProdcuto));
                     System.out.println("Producto agregado exitosamente");
                     break;
                 case 2:
                     System.out.println("ingrese el nombre del producto a vender");
                     String descripcionVender= sc.next();
                     Product aux=Product.existeProducto(descripcionVender, productos);
                     if(aux!=null){
                         System.out.println("el producto se encuetra disponible para la venta");
                         System.out.println("ingrese cantidad a vender");
                         int cantidadVender=sc.nextInt();
                         if(Product.rangoCantidad(aux, cantidadVender)){
                             System.out.println("producto vendido exitosamente");
                             System.out.println("cantidad a pagar por el producto: "+ aux.getDescripcionProduct()+":" + aux.getPrecioProduct()*cantidadVender);
                             Product.actualizarCantidadProducto(productos, cantidadVender, descripcionVender);
                         }else{
                             System.out.println("la cantidad solicitada no se encuentra disponible");
                         }
                     }else{
                         System.out.println("el producto no se encuentra disponible para su venta");
                     }
                     break;
                 default:
                     break;
             }
        } while (opc!=3 && opc<=3);
    }
}
