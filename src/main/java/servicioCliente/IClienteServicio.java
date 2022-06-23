/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;

import java.util.List;
import modeloCliente.Cliente;

/**
 *
 * @author mlata
 */
public interface IClienteServicio {
  public Cliente crear( Cliente cliente);
  public List<Cliente> listar();
  public Cliente eliminar(int codigoCliente);
  public Cliente modificar(int codigoCliente, Cliente clienteNuevo);
  public int buscarposicion(Cliente cliente);
  public Cliente buscarPorCodigo(int codigoCliente); 
    
}
