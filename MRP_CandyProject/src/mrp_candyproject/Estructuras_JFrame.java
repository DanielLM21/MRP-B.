/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrp_candyproject;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Estructuras_JFrame extends javax.swing.JFrame {

    DefaultTableModel TablaEstructura;
    JTableHeader EncabezadoEstructura;
    int NumeroColumna;
    int NumeroFila;
    Object VariableIntPrueba;
    
    
    public Estructuras_JFrame() {
        initComponents();
        TablaEstructura = (DefaultTableModel) Table_Estructuras.getModel();
        EncabezadoEstructura = Table_Estructuras.getTableHeader(); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel_Estructuras = new javax.swing.JPanel();
        ScrollPane_Estructuras = new javax.swing.JScrollPane();
        Table_Estructuras = new javax.swing.JTable();
        Button_NuevoNivel = new javax.swing.JButton();
        Button_NuevaParte = new javax.swing.JButton();
        TextField_Pruebas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel_Estructuras.setBorder(javax.swing.BorderFactory.createTitledBorder("Estructura"));

        Table_Estructuras = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        Table_Estructuras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nivel", "Parte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Estructuras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table_Estructuras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Table_Estructuras.getTableHeader().setResizingAllowed(false);
        Table_Estructuras.getTableHeader().setReorderingAllowed(false);
        ScrollPane_Estructuras.setViewportView(Table_Estructuras);
        if (Table_Estructuras.getColumnModel().getColumnCount() > 0) {
            Table_Estructuras.getColumnModel().getColumn(0).setResizable(false);
            Table_Estructuras.getColumnModel().getColumn(0).setPreferredWidth(40);
            Table_Estructuras.getColumnModel().getColumn(1).setResizable(false);
            Table_Estructuras.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        Button_NuevoNivel.setText("Nuevo nivel");
        Button_NuevoNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NuevoNivelActionPerformed(evt);
            }
        });

        Button_NuevaParte.setText("Nueva parte");
        Button_NuevaParte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_NuevaParteActionPerformed(evt);
            }
        });

        TextField_Pruebas.setText("TextField de pruebas.");

        javax.swing.GroupLayout MainPanel_EstructurasLayout = new javax.swing.GroupLayout(MainPanel_Estructuras);
        MainPanel_Estructuras.setLayout(MainPanel_EstructurasLayout);
        MainPanel_EstructurasLayout.setHorizontalGroup(
            MainPanel_EstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel_EstructurasLayout.createSequentialGroup()
                .addGroup(MainPanel_EstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane_Estructuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_NuevaParte)
                    .addComponent(Button_NuevoNivel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel_EstructurasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextField_Pruebas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanel_EstructurasLayout.setVerticalGroup(
            MainPanel_EstructurasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel_EstructurasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_NuevoNivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_NuevaParte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(TextField_Pruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane_Estructuras, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel_Estructuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel_Estructuras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_NuevoNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NuevoNivelActionPerformed
        TablaEstructura.addRow(new Object[]{});
    }//GEN-LAST:event_Button_NuevoNivelActionPerformed

    private void Button_NuevaParteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_NuevaParteActionPerformed
        ArrayList<String> ListaDescendencias = new ArrayList<String>();
        ListaDescendencias.add("Parte A");
        ListaDescendencias.add("Parte B");
        ListaDescendencias.add("Parte C");

        //Abrir el jDialog donde se indicaran los datos de la parte. 
        NuevaParte nuevaParte = new NuevaParte(this,true);
        nuevaParte.recibirDescendencias(ListaDescendencias);
        nuevaParte.setVisible(true);
             
        TablaEstructura.addColumn("");
        NumeroColumna = Table_Estructuras.getColumnCount();
        TextField_Pruebas.setText(nuevaParte.enviarDatos().toString());
    }//GEN-LAST:event_Button_NuevaParteActionPerformed

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
            java.util.logging.Logger.getLogger(Estructuras_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estructuras_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estructuras_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estructuras_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estructuras_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_NuevaParte;
    private javax.swing.JButton Button_NuevoNivel;
    private javax.swing.JPanel MainPanel_Estructuras;
    private javax.swing.JScrollPane ScrollPane_Estructuras;
    private javax.swing.JTable Table_Estructuras;
    private javax.swing.JTextField TextField_Pruebas;
    // End of variables declaration//GEN-END:variables
}
