/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import estructural.Pelicula;
import estructural.Sala;
import estructural.Teatro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Paleox
 */
public class InterfazCrearFuncion extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCrearFuncion
     */
    
    private Teatro teatro;
    
    public InterfazCrearFuncion(Teatro teatro) {
        this.teatro = teatro;
        initComponents();
        popularSalas();
        popularPeliculas();
        txtCodigoFuncion.setText("" + teatro.getCodigoFuncion());
    }
    
    public void popularSalas(){
        ArrayList<Sala> salas = teatro.getSalas();
        
        for(Sala sala: salas){
            cbSalas.addItem(sala.getCodigo());
        }
    }
    
    public void popularPeliculas(){
        ArrayList<Pelicula> peliculas = teatro.getPeliculas();
        
        for(Pelicula pelicula: peliculas){
            cbPeliculas.addItem(pelicula.getCodigo());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbSalas = new javax.swing.JComboBox();
        cbPeliculas = new javax.swing.JComboBox();
        btnCrearFuncion = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        lblTituloPelicula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoFuncion = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Función");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Fecha y Hora:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sala:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Película:");

        cbSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalasActionPerformed(evt);
            }
        });

        cbPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPeliculasActionPerformed(evt);
            }
        });

        btnCrearFuncion.setText("Crear");
        btnCrearFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFuncionActionPerformed(evt);
            }
        });

        txtFecha.setToolTipText("yyyy/MM/dd HH:mm");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Código Función:");

        txtCodigoFuncion.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearFuncion)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(cbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigoFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCrearFuncion)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPeliculasActionPerformed
        // TODO add your handling code here:
        int codPelicula = Integer.parseInt(cbPeliculas.getSelectedItem().toString());
        Pelicula pelicula = teatro.getPelicula(codPelicula);
        lblTituloPelicula.setText(pelicula.getTitulo());
    }//GEN-LAST:event_cbPeliculasActionPerformed

    private void btnCrearFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFuncionActionPerformed
        // TODO add your handling code here:
        if (txtFecha.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese la fecha de la función", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            String fecha = txtFecha.getText();
            DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm");
            Date fechaConversion = null;
            try {
                fechaConversion = df.parse(fecha);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            Sala sala = teatro.getSala( Integer.parseInt(cbSalas.getSelectedItem().toString()) );
            Pelicula pelicula = teatro.getPelicula( Integer.parseInt(cbPeliculas.getSelectedItem().toString()) );
            teatro.crearFuncion(fechaConversion, sala, pelicula);
            JOptionPane.showMessageDialog(rootPane, "Función creada con exito", "Confirmación", WIDTH);
            txtFecha.setText("");
            txtCodigoFuncion.setText("" + teatro.getCodigoFuncion());
        }
    }//GEN-LAST:event_btnCrearFuncionActionPerformed

    private void cbSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSalasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFuncion;
    private javax.swing.JComboBox cbPeliculas;
    private javax.swing.JComboBox cbSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTituloPelicula;
    private javax.swing.JTextField txtCodigoFuncion;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
