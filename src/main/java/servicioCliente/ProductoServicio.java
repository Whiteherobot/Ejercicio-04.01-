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
        this.productoList.add(producto);
        return producto;
    }

    @Override
    public List<Producto> listar() {
        return this.productoList;
    }

    @Override
    public Producto eliminar(int codigoProducto) {
        Producto producto= this.buscarPorCodigo(codigoProducto);
        var posicion =this.buscarposicion(producto);
        this.listar().remove(posicion);
        return producto;
    }

    @Override
    public Producto modificar(int codigoProducto, Producto productoNueva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
