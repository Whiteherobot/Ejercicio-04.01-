/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorCliente;

import java.util.List;
import modeloCliente.Cliente;
import modeloCliente.Factura;
import servicioCliente.ClienteServicio;
import servicioCliente.FacturaServicio;

/**
 *
 * @author mlata
 */
public class FacturaControl {
    
    private static FacturaServicio facturaServicio = new FacturaServicio();
    private static ClienteControl clienteControl =  new ClienteControl();
    private static ProductoControl productoControl =  new ProductoControl();
    public Factura crear(String [] args){
       
        Factura factura = new Factura(Integer.valueOf(args[0]),args[1],args[2],clienteControl.listar().get(Integer.valueOf(args[3])),productoControl.listar().get(Integer.valueOf(args[3])));
        this.facturaServicio.crear(factura);
        
        
        return factura;
    }
    public Factura buscarFactura(String arg){
        return this.facturaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    public Factura eliminar (String arg){
        return this.facturaServicio.eliminar(Integer.valueOf(arg));
    }
    public List<Factura> listar(){
        return this.facturaServicio.listar();
    }
    public List<Cliente>Listar(){
        return this.clienteControl.listar();
    }

    public Factura modificar(String[] args) {
        Factura facturaNuevo = new Factura(Integer.valueOf(args[0]),args[1],args[2]);
        this.facturaServicio.modificar(Integer.valueOf(args[0]), facturaNuevo);
        return facturaNuevo;
    }

}