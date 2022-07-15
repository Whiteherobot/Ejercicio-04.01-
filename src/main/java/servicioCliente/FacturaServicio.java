/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicioCliente;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modeloCliente.Factura;

/**
 *
 * @author mlata
 */
public class FacturaServicio implements IFacturaServicio{
    
    private static List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
    if (exist(factura.getCodigo(), factura.getNombre()) == false)
      {
        this.facturaList.add(factura);
        return factura;
         } else
    {
        throw new RuntimeException("Ya existe una Factura con este código.");
    }
    }

    @Override
    public Factura modificar(int codigoFactura, Factura facturaNuevo) {
         if (exist(codigoFactura) == true)
        {
        var posicion = this.buscarposicion(this.buscarPorCodigo(codigoFactura));
        this.listar().get(posicion).setCodigo(facturaNuevo.getCodigo());
        this.listar().get(posicion).setNombre(facturaNuevo.getNombre());
        this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
        return facturaNuevo;
          }
        else
        {
            throw new RuntimeException("No se ha encontrado una Factura con ese código");
        }

    }

    @Override
    public Factura eliminar(int codigoFactura) {
        if (exist(codigoFactura) == true)
        {
        Factura factura = this.buscarPorCodigo(codigoFactura);
        var posicion=this.buscarPorCodigo(codigoFactura);
        this.listar().remove(posicion);
        return factura;
     }
        else
        {
            throw new RuntimeException("No se ha encontrado una Factura con ese código");
        }
        }

    @Override
    public Factura buscarPorCodigo(int codigoFactura) {
        Factura factura=null;
        for(var f:this.facturaList){
            if(codigoFactura==f.getCodigo()){
                factura=f;
                break;
            }
        }
        return factura;
    }

    @Override
    public int buscarposicion(Factura factura) {
    int posicion=-1;
        for(var f:this.facturaList){
            posicion++;
            if(f.getCodigo()==factura.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }
    public boolean exist(int codigo, String nombre)
    {
        boolean result = false;
        for (Factura f : facturaList)
        {
            if (f.getCodigo() == codigo)
            {
                result = true;
                break; 
            }
            else if (f.getNombre().equals(nombre))
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
        for (Factura f : facturaList)
        {
            if (f.getCodigo() == codigo)
            {
                result = true;
                break; 
            }            
        }
        return result;
    }


    @Override
    public List<Factura> recuperarDeArchivo(String rutaArchivo) throws IOException {
        var facturaList = new ArrayList<Factura>();
        DataInputStream entrada=null;
        try{
            entrada = new DataInputStream(new FileInputStream(rutaArchivo));
            while(true){
                var codigo=entrada.readInt();
                var nombre=entrada.readUTF();
                var numero=entrada.readInt();
                var factura=new Factura(codigo,nombre,numero);
                facturaList.add(factura);
            }
        }catch(IOException e){
            entrada.close();
        }
        return facturaList;
    }

    @Override
    public boolean almacenarEnArchivo(Factura factura, String rutaArchivo) throws IOException {
        var retorno = false;
        DataOutputStream salida=null;
        try{
            salida = new DataOutputStream( new FileOutputStream(rutaArchivo, true) );
            salida.writeInt(factura.getCodigo());
            salida.writeUTF(factura.getDireccion());
            salida.writeUTF(factura.getNombre());
            salida.close();
            retorno=true;
        }catch(IOException e)
        {
            salida.close();
        }
        return retorno;
  
    }
    
}

