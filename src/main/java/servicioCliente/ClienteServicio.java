/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Cliente;

/**
 *
 * @author mlata
 */
public class ClienteServicio implements IClienteServicio {
    private final List<Cliente> clienteList = new ArrayList<>();

    @Override
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public Cliente eliminar(int codigoCliente) {
        Cliente cliente = this.buscarPorCodigo(codigoCliente);
        var posicion= this.buscarPorCodigo(codigoCliente);
        this.listar().remove(posicion);
        return cliente;

    }

    @Override
    public Cliente modificar(int codigoCliente, Cliente clienteNuevo) {
       var posicion = this.buscarposicion(this.buscarPorCodigo(codigoCliente));
       this.listar().get(posicion).setCodigo(clienteNuevo.getCodigo());
       this.listar().get(posicion).setApellido(clienteNuevo.getApellido());
       this.listar().get(posicion).setNombre(clienteNuevo.getNombre());
       
       return clienteNuevo;
    
    }

    @Override
    public int buscarposicion(Cliente cliente) {
      int posicion=-1;
        for(var c:this.clienteList){
            posicion++;
            if(c.getCodigo()==cliente.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public Cliente buscarPorCodigo (int codigoCliente) {
        Cliente cliente = null;
        for(var c:this.clienteList){
            if(codigoCliente==c.getCodigo()){
                cliente = c;
                break;
            }
        }
        return cliente;
    }
    
    @Override
    public List<Cliente> listar() {
        return this.clienteList;
    }
    



   
}
