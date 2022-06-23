package mavenproject2;

import vistaCliente.VistaCliente;
import vistaCliente.VistaFactura;
import vistaCliente.VistaProducto;

public class Mavenproject2 {


    public static void main(String[] args) {
        
        var v1 = new VistaCliente();
        v1.setVisible(true);
        var v2 = new VistaProducto();
        v2.setVisible(true);
        var v3 = new VistaFactura();
        v3.setVisible(true);

    }
}

