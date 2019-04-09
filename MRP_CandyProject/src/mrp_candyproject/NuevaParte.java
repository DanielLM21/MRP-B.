
package mrp_candyproject;

import java.util.ArrayList;
import java.util.List;

public class NuevaParte extends javax.swing.JDialog {
    private ArrayList<String> Parte; 
        
    public NuevaParte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_NuevaParte = new javax.swing.JPanel();
        Label_Nombre = new javax.swing.JLabel();
        TextField_Nombre = new javax.swing.JTextField();
        Label_Desciende = new javax.swing.JLabel();
        ComboBox_Desciende = new javax.swing.JComboBox<>();
        Label_Cantidad = new javax.swing.JLabel();
        TextField_Cantidad = new javax.swing.JTextField();
        Label_Nivel = new javax.swing.JLabel();
        TextField_Nivel = new javax.swing.JTextField();
        Button_Aceptar = new javax.swing.JButton();
        Button_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel_NuevaParte.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva parte"));

        Label_Nombre.setText("Nombre:");

        Label_Desciende.setText("Desciende de:");

        ComboBox_Desciende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Label_Cantidad.setText("Cantidad:");

        Label_Nivel.setText("Nivel:");

        TextField_Nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_NuevaParteLayout = new javax.swing.GroupLayout(Panel_NuevaParte);
        Panel_NuevaParte.setLayout(Panel_NuevaParteLayout);
        Panel_NuevaParteLayout.setHorizontalGroup(
            Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NuevaParteLayout.createSequentialGroup()
                .addGroup(Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NuevaParteLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_Nombre)
                            .addComponent(Label_Nivel)))
                    .addGroup(Panel_NuevaParteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_Desciende)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NuevaParteLayout.createSequentialGroup()
                        .addComponent(TextField_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label_Cantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox_Desciende, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_NuevaParteLayout.setVerticalGroup(
            Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NuevaParteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Nombre)
                    .addComponent(TextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Cantidad)
                    .addComponent(TextField_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Nivel)
                    .addComponent(TextField_Nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_NuevaParteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_Desciende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Desciende))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        Button_Aceptar.setText("Aceptar");
        Button_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AceptarActionPerformed(evt);
            }
        });

        Button_Cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_NuevaParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Cancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_NuevaParte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Aceptar)
                    .addComponent(Button_Cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AceptarActionPerformed
        //Creacion del arreglo que almacenara los atributos de la "Parte".
        Parte = new ArrayList<>();
        
        //Capturar datos en variables.
        Parte.add(TextField_Nombre.getText());
        Parte.add(TextField_Nivel.getText());
        Parte.add(ComboBox_Desciende.getItemAt(ComboBox_Desciende.getSelectedIndex()));
        Parte.add(TextField_Cantidad.getText());
        
        dispose();
    }//GEN-LAST:event_Button_AceptarActionPerformed

    private void TextField_NivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NivelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevaParte dialog = new NuevaParte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void recibirDescendencias(ArrayList<String> DescendenciasRecibidas) {
        ComboBox_Desciende.removeAllItems();
        for (int i = 0; i < DescendenciasRecibidas.size(); i++) {
            ComboBox_Desciende.addItem(DescendenciasRecibidas.get(i));
        }
    }
    
    public ArrayList<String> enviarDatos (){
        return Parte;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Aceptar;
    private javax.swing.JButton Button_Cancelar;
    private javax.swing.JComboBox<String> ComboBox_Desciende;
    private javax.swing.JLabel Label_Cantidad;
    private javax.swing.JLabel Label_Desciende;
    private javax.swing.JLabel Label_Nivel;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JPanel Panel_NuevaParte;
    private javax.swing.JTextField TextField_Cantidad;
    private javax.swing.JTextField TextField_Nivel;
    private javax.swing.JTextField TextField_Nombre;
    // End of variables declaration//GEN-END:variables
}
