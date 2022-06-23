/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;

import java.util.List;
import modeloCliente.Producto;

/**
 *
 * @author mlata
 */
public interface IProductoServicio {
    public Producto crear(Producto producto);
    public List<Producto> listar();
    public Producto eliminar(int codigoProducto);
    public Producto modificar(int codigoProducto, Producto productoNueva);
    public int buscarposicion(Producto producto);
    public Producto buscarPorCodigo(int codigoProducto); 
    
}
