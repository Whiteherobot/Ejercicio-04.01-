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
    private  List<Cliente> clienteList;
    
    public ClienteServicio()
    {
        clienteList = new ArrayList<>();
    }

    @Override
    public Cliente crear(Cliente cliente) {
        if (exist(cliente.getCodigo(), cliente.getNombre()) == false)
        { 
        this.clienteList.add(cliente);
        return cliente;
    }
    else
    {
        throw new RuntimeException("Ya existe un Usuario con este código.");
    }
    }
    @Override
    public Cliente eliminar(int codigoCliente) {
        if (exist(codigoCliente) == true)
        {
        Cliente cliente = this.buscarPorCodigo(codigoCliente);
        var posicion= this.buscarPorCodigo(codigoCliente);
        this.listar().remove(posicion);
        return cliente;
         }
        else
        {
            throw new RuntimeException("No se ha encontrado un Usuario con ese código");
        }


    }

    @Override
    public Cliente modificar(int codigoCliente, Cliente clienteNuevo) {
         if (exist(codigoCliente) == true)
        {
       var posicion = this.buscarposicion(this.buscarPorCodigo(codigoCliente));
       this.listar().get(posicion).setCodigo(clienteNuevo.getCodigo());
       this.listar().get(posicion).setApellido(clienteNuevo.getApellido());
       this.listar().get(posicion).setNombre(clienteNuevo.getNombre());
       
       return clienteNuevo;
        }
        else
        {
            throw new RuntimeException("No se ha encontrado un Cliente con ese código");
        }
    
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
     public boolean exist(int codigo, String nombre)
    {
        boolean result = false;
        for (Cliente c : clienteList)
        {
            if (c.getCodigo() == codigo)
            {
                result = true;
                break; 
            }
            else if (c.getNombre().equals(nombre))
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
        for (Cliente c : clienteList)
        {
            if (c.getCodigo() == codigo)
            {
                result = true;
                break; 
            }            
        }
        return result;
    }



   
}
