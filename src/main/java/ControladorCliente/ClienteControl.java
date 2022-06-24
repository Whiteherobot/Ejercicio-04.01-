/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorCliente;

import java.util.List;
import modeloCliente.Cliente;
import servicioCliente.ClienteServicio;

/**
 *
 * @author mlata
 */

public class ClienteControl {
    private final ClienteServicio clienteServicio = new ClienteServicio();
    public Cliente crear(String [] args){
        var cliente= new Cliente(Integer.valueOf(args[0]),args[1],args[2]);
        this.clienteServicio.crear(cliente);
        return cliente;
    }
    public Cliente buscarFactura(String arg){
        return this.clienteServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    public Cliente eliminar (String arg){
        return this.clienteServicio.eliminar(Integer.valueOf(arg));
    }
    
    public List<Cliente> listar(){
        return this.clienteServicio.listar();
    }
    public Cliente modificar(String[] args) {
        Cliente clienteNuevo = new Cliente(Integer.valueOf(args[0]),args[1],args[2]);
        this.clienteServicio.modificar(Integer.valueOf(args[0]), clienteNuevo);
        return clienteNuevo;
    }
}
