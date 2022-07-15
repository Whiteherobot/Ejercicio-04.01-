/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaCliente;
import ControladorCliente.ClienteControl;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author mlata
 */
public class VistaCliente extends javax.swing.JInternalFrame  {
    DefaultTableModel modelo;
    ClienteControl clienteControl;
    private TableModel modeloTabla;
    /**
     * Creates new form NewJFrame
     */
    public VistaCliente() {
        initComponents();
        clienteControl  = new ClienteControl();
        txtFecha.setText(fechaActual());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfila = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcolumna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnuevodato1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tabla1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        csi = new javax.swing.JTextField();
        cst = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        txtfila.setColumns(5);
        txtfila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfilaActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese el código del cliente:");

        txtcolumna.setColumns(5);
        txtcolumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcolumnaActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el nombre:");

        txtnuevodato1.setColumns(20);
        txtnuevodato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevodato1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Ingrese el nombre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingrese el código del cliente:");

        jLabel3.setText("Ingrese el apellido:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Apellido"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla1.setViewportView(tabla);

        cno.setColumns(20);
        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha del pedido: ");

        txtFecha.setColumns(20);
        txtFecha.setText("DD/MM/YYYY");
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar Todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese el nombre:");

        csi.setColumns(5);
        csi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csiActionPerformed(evt);
            }
        });

        cst.setColumns(20);
        cst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cstActionPerformed(evt);
            }
        });

        jButton5.setText("Listar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabla1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cst, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(csi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5)
                                            .addComponent(jButton1))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton3)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(csi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("DD/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
    private void txtnuevodato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevodato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnuevodato1ActionPerformed

    private void txtfilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfilaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try{ 
        String []info=new String[3];
        info[0]=this.csi.getText();
        info[1]=this.cno.getText();
        info[2]=this.cst.getText().toString();            
          clienteControl.crear(info);
          JOptionPane.showMessageDialog(null, "Se han ingresado los datos correctamente.");
      
    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "no se permiten letras en el codigo ","Error al guardar el cliente ",JOptionPane.ERROR_MESSAGE);
    }catch (RuntimeException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
        if(JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este equipo?") == 0)
        {
            clienteControl.eliminar(csi.getText());
            JOptionPane.showMessageDialog(this, "Eliminado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
            actualizarTabla();
        }
           }
       catch (RuntimeException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{ 
       String[] args = new String[3];
       args[0]=csi.getText();
       args[1]=cno.getText();
       args[2]=cst.getText();
       clienteControl.modificar(args);
        JOptionPane.showMessageDialog(null, "Modificacion exitosa!!!");
       }
                 catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "no se permiten letras en el codigo ","Error al guardar el cliente ",JOptionPane.ERROR_MESSAGE);
                 }
      catch (RuntimeException e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
       actualizarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcolumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcolumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcolumnaActionPerformed

    private void csiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_csiActionPerformed

    private void cstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cstActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    this.actualizarTabla();
    }//GEN-LAST:event_jButton5ActionPerformed
    private void actualizarTabla(){
        var datos = new Object[this.clienteControl.listar().size()][3];
        var encabezado = new String[] {"Codigo", "Nombre", "Apellido"};
        try{
        for(int i = 0; i<this.clienteControl.listar().size();i++)
        for(var cliente:this.clienteControl.listar()){
            datos[i][0]=this.clienteControl.listar().get(i).getCodigo();
            datos[i][1]=this.clienteControl.listar().get(i).getNombre();
            datos[i][2]=this.clienteControl.listar().get(i).getApellido();
        }
        this.modeloTabla = new DefaultTableModel(datos,encabezado);
        this.tabla.setModel(modeloTabla);
       // JOptionPane.showMessageDialog(null, "Se listo Correctamente.");
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(this, "Se necesitan datos");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCliente().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cno;
    private javax.swing.JTextField csi;
    private javax.swing.JTextField cst;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tabla1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtcolumna;
    private javax.swing.JTextField txtfila;
    private javax.swing.JTextField txtnuevodato1;
    // End of variables declaration//GEN-END:variables
}