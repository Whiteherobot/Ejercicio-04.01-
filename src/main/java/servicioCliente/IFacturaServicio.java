/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicioCliente;

import java.util.List;
import modeloCliente.Factura;

/**
 *
 * @author mlata
 */
public interface IFacturaServicio {
    public Factura crear( Factura factura);
    public List<Factura> listar();
    public Factura eliminar(int codigoFactura);
    public Factura modificar(int codigoFactura, Factura facturaNueva);
    public int buscarposicion(Factura factura);
    public Factura buscarPorCodigo(int codigoFactura);
    
}
