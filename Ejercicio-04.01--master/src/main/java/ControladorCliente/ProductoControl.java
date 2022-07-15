/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorCliente;

import java.util.List;
import modeloCliente.Producto;
import servicioCliente.ProductoServicio;

/**
 *
 * @author mlata
 */
public class ProductoControl {
    private static ProductoServicio facturaServicio = new ProductoServicio();
    
    public Producto crear(String [] args){
        var producto= new Producto(Integer.valueOf(args[0]),args[1],args[2]);
        this.facturaServicio.crear(producto);
        return producto;
    }
    public Producto buscarFactura(String arg){
        return this.facturaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    public Producto eliminar (String arg){
        return this.facturaServicio.eliminar(Integer.valueOf(arg));
    }
    
    public List<Producto> listar(){
        return this.facturaServicio.listar();
    }
        public Producto modificar(String[] args) {
        Producto facturaNuevo = new Producto(Integer.valueOf(args[0]),args[1],args[2]);
        this.facturaServicio.modificar(Integer.valueOf(args[0]), facturaNuevo);
        return facturaNuevo;
    }
}
