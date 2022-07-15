/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Producto;

/**
 *
 * @author mlata
 */
public class ProductoServicio implements IProductoServicio{
    
    private static List<Producto> productoList = new ArrayList<>();

    @Override
    public Producto crear(Producto producto) {
      if (exist(producto.getCodigo(), producto.getNombre()) == false)
      {
          this.productoList.add(producto);
        return producto;
    } else
    {
        throw new RuntimeException("Ya existe un Producto con este código.");
    }
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
    }

    @Override
    public Producto eliminar(int codigoProducto) {
        if (exist(codigoProducto) == true)
        {
        Producto producto= this.buscarPorCodigo(codigoProducto);
        var posicion =this.buscarposicion(producto);
        this.listar().remove(posicion);
        return producto;
    }
        else
        {
            throw new RuntimeException("No se ha encontrado un Producto con ese código");
        }
    }
    @Override
    public Producto modificar(int codigoProducto, Producto productoNueva) {
          if (exist(codigoProducto) == true)
        {
       var posicion = this.buscarposicion(this.buscarPorCodigo(codigoProducto));
       this.listar().get(posicion).setCodigo(productoNueva.getCodigo());
       this.listar().get(posicion).setNombre(productoNueva.getNombre());
       this.listar().get(posicion).setDireccion(productoNueva.getDireccion());
       
       return productoNueva;
        }
        else
        {
            throw new RuntimeException("No se ha encontrado un Producto con ese código");
        }
}

    @Override
    public int buscarposicion(Producto producto) {
        int posicion=-1;
        for(var p:this.productoList){
            posicion++;
            if(p.getCodigo()==producto.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public Producto buscarPorCodigo(int codigoProducto) {
     Producto producto = null;
        for(var c:this.productoList){
            if(codigoProducto==c.getCodigo()){
                producto = c;
                break;
            }
        }
        return producto;
    }
      public boolean exist(int codigo, String nombre)
    {
        boolean result = false;
        for (Producto p : productoList)
        {
            if (p.getCodigo() == codigo)
            {
                result = true;
                break; 
            }
            else if (p.getNombre().equals(nombre))
            {
                result  = true;
                break;
            }
        }
        return result;
    }
      public boolean exist(int codigo)
    {
        boolean result = false;
        for (Producto p : productoList)
        {
            if (p.getCodigo() == codigo)
            {
                result = true;
                break; 
            }            
        }
        return result;
    }

}
