/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import estructural.Funcion;
import estructural.MyJPanel;
import estructural.Reserva;
import estructural.Sala;
import estructural.Silla;
import estructural.Tarjeta;
import estructural.Teatro;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Beltran
 */
public class InterfazRegistrarVenta extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistrarVenta
     */
    
    private Teatro teatro;
    
    public InterfazRegistrarVenta(Teatro teatro) {
        this.teatro = teatro;
        initComponents();
        popularFunciones();
        iniciarVentana();
    }
    
    public void iniciarVentana(){
        txtCodigoVenta.setText("" + teatro.getCodigoReserva());
        
        if(teatro.getTarjetas().isEmpty()){
            ckReserva.setEnabled(false);
        }
        inicializarBoxes();
    
    }
    
    public void popularFunciones(){
        cbFunciones.removeAllItems();
        ArrayList<Funcion> funciones = teatro.getFunciones();

        for(Funcion funcion: funciones){
            cbFunciones.addItem(funcion.getCodigo());
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
        txtCodigoVenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbFunciones = new javax.swing.JComboBox();
        txtFuncion = new javax.swing.JTextField();
        ckReserva = new javax.swing.JCheckBox();
        cbTarjetas = new javax.swing.JComboBox();
        cbReservas = new javax.swing.JComboBox();
        jpContenedor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ckTarjetas = new javax.swing.JCheckBox();
        txtSaldo = new javax.swing.JTextField();
        cbSaldos = new javax.swing.JComboBox();
        txtValor = new javax.swing.JTextField();
        btnRegistrarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Venta");
        setResizable(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código Venta:");

        txtCodigoVenta.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Función:");

        cbFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionesActionPerformed(evt);
            }
        });

        txtFuncion.setEditable(false);

        ckReserva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckReserva.setText("Reserva:");
        ckReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckReservaActionPerformed(evt);
            }
        });

        cbTarjetas.setEnabled(false);
        cbTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTarjetasActionPerformed(evt);
            }
        });

        cbReservas.setEnabled(false);

        jpContenedor.setBackground(new java.awt.Color(255, 255, 255));
        jpContenedor.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jpContenedorComponentAdded(evt);
            }
        });

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Valor:");

        ckTarjetas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckTarjetas.setText("Tarjeta:");
        ckTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckTarjetasActionPerformed(evt);
            }
        });

        txtSaldo.setEditable(false);

        cbSaldos.setEnabled(false);
        cbSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaldosActionPerformed(evt);
            }
        });

        txtValor.setEditable(false);

        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckReserva)
                                    .addComponent(ckTarjetas))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrarVenta)))
                        .addGap(0, 104, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckReserva)
                    .addComponent(cbTarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckTarjetas)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionesActionPerformed
        // TODO add your handling code here:
        //ckReserva.setSelected(false);
        inicializarBoxes();
        Funcion funcion = teatro.getFuncion(
            Integer.parseInt(
                    cbFunciones.getSelectedItem().toString()
            ));
        txtFuncion.setText(funcion.getPelicula().getTitulo() +
                " - " + funcion.getFecha());        
        dibujarSillas(funcion, null);
        recalculaTotal();
    }//GEN-LAST:event_cbFuncionesActionPerformed

    private void ckReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckReservaActionPerformed
        // TODO add your handling code here:
        if(!ckReserva.isSelected()){
            inicializarBoxes();
            dibujarSillas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())), null);
        }else{
            if(teatro.getTarjetas().isEmpty()){
                JOptionPane.showMessageDialog(this, "Deben existir tarjetas registradas para activar esta opcion"
                        , "No existen tarjetas registradas", JOptionPane.ERROR_MESSAGE);
                ckReserva.setSelected(false);
                return;
            }

            if(teatro.getReservasActivas().isEmpty()){
                JOptionPane.showMessageDialog(this, "Deben existir Reservas registradas para activar esta opcion"
                        , "No existen Reservas registradas", JOptionPane.ERROR_MESSAGE);
                ckReserva.setSelected(false);
                recalculaTotal();
                return;
            }
            
            if(teatro.getReservasFuncion(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString()))).isEmpty()){
                JOptionPane.showMessageDialog(this, "No existen reservas para esta funcion"
                        , "No se encuentran reservas.", JOptionPane.ERROR_MESSAGE);
                ckReserva.setSelected(false);
                return;
            }
            //solo tarjetas que tengan reservas para la funcion
            popularTarjetas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())));
            cbTarjetas.setEnabled(true);

            cbReservas.setEnabled(true);

            popularReservas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())));

            dibujarSillas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())), 
                    teatro.getTarjeta(cbTarjetas.getSelectedItem().toString()));
        }
        recalculaTotal();
    }//GEN-LAST:event_ckReservaActionPerformed

    private void ckTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckTarjetasActionPerformed
        // TODO add your handling code here:
        if(!ckTarjetas.isSelected()){
            cbSaldos.removeAllItems();
            cbSaldos.setEnabled(false);
            txtSaldo.setText("");
        }else{
            if(teatro.getTarjetas().isEmpty()){
                JOptionPane.showMessageDialog(this, "Deben existir tarjetas registradas para activas esta opcion.", 
                        "No hay tarjetas Registradas", JOptionPane.ERROR_MESSAGE);
                ckTarjetas.setSelected(false);
            }else{
                cbSaldos.setEnabled(true);
                popularTarjetasSaldos();
                if(cbSaldos.getComponentCount() != 0){
                    txtSaldo.setText("" + teatro.getTarjeta(cbSaldos.getSelectedItem().toString()).getSaldo());
                }else{
                    cbSaldos.setEnabled(false);
                    ckTarjetas.setSelected(false);
                    JOptionPane.showMessageDialog(this, "No hay tarjetas con saldo registradas en el sistema", 
                            "No hay tarjetas con saldo", JOptionPane.ERROR_MESSAGE);
                }                
            }        
        }
        recalculaTotal();
    }//GEN-LAST:event_ckTarjetasActionPerformed

    private void jpContenedorComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jpContenedorComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jpContenedorComponentAdded

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void cbTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTarjetasActionPerformed
        // TODO add your handling code here:
        if(ckReserva.isSelected()){
            popularReservas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())));
            dibujarSillas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())),
                teatro.getTarjeta(cbTarjetas.getSelectedItem().toString()));
        }
    }//GEN-LAST:event_cbTarjetasActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        // TODO add your handling code here:
        double total = calculaTotal();
        int tipo = 1;
        Tarjeta tarjeta = null;
        
        if(ckTarjetas.isSelected()){
            //double saldoTarjeta = Double.parseDouble(txtSaldo.getText());
            tarjeta = teatro.getTarjeta(cbSaldos.getSelectedItem().toString());
            double saldoTarjeta = tarjeta.getSaldo();
            
            if(saldoTarjeta < Double.parseDouble(txtValor.getText())){
                JOptionPane.showMessageDialog(this, "Saldo de la tarjeta seleccionada no cubre el costo total", "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE);
                return;
            }
           //teatro.getTarjeta(cbSaldos.getSelectedItem().toString()).actualizarSaldo(total);
            tipo = 2;
        }
        
        //
        ArrayList<MyJPanel> jps = new ArrayList<>();
        
        for(Component component: jpContenedor.getComponents()){
            if(component.getBackground() == Color.yellow
                    || component.getBackground() == Color.green){
                MyJPanel jp =(MyJPanel)component;
                jps.add(jp);
            }
        }
        
        ArrayList<Silla> sillas = new ArrayList<>();
        
        if(!jps.isEmpty()){
            for(MyJPanel jp : jps){
                if(ckReserva.isSelected()){
                    if(jp.getBackground() == Color.green){
                        if(!teatro.getReserva(Integer.parseInt(cbReservas.getSelectedItem().toString())).getSillas().contains(jp.getSilla())){
                            teatro.getReserva(Integer.parseInt(cbReservas.getSelectedItem().toString())).getSillas().add(jp.getSilla());
                        }
                    }
                }else{
                    sillas.add(jp.getSilla());
                }
            }
            
            if(ckReserva.isSelected()){                
                teatro.registrarVenta(teatro.getReserva(Integer.parseInt(cbReservas.getSelectedItem().toString())),
                            tarjeta, tipo);
            }else{
                teatro.crearReserva(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())), null, sillas);               
                teatro.registrarVenta(teatro.getReserva(teatro.getReservas().size()), tarjeta, tipo);
                    //teatro.getReserva(teatro.getReservas().size()).setEstado(2);
            }
            JOptionPane.showMessageDialog(this, "Venta registrada exitosamente", "Venta Registrada", JOptionPane.INFORMATION_MESSAGE);
            dibujarSillas(teatro.getFuncion(Integer.parseInt(cbFunciones.getSelectedItem().toString())), null);
            iniciarVentana();
            recalculaTotal();
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar sillas para efectuar una venta", "No sillas seleccionadas", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void cbSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaldosActionPerformed
        // TODO add your handling code here:
        if(cbSaldos.getComponentCount() != 0 && ckTarjetas.isSelected()){
            txtSaldo.setText("" + teatro.getTarjeta(cbSaldos.getSelectedItem().toString()).getSaldo());
        }
    }//GEN-LAST:event_cbSaldosActionPerformed

    public void popularTarjetasSaldos(){
        cbSaldos.removeAllItems();
        for(Tarjeta tarjeta : teatro.getTarjetas()){
            if(tarjeta.getSaldo() > 0 ){
                if(tarjeta.getTipo() == 3){
                    cbSaldos.addItem(tarjeta.getDocumento());
                }                
            }
        }    
    }
    
    public void inicializarBoxes(){
        cbReservas.setEnabled(false);
        ckReserva.setSelected(false);
        cbReservas.removeAllItems();
        cbTarjetas.removeAllItems();
        cbTarjetas.setEnabled(false);
        ckTarjetas.setSelected(false);
        cbSaldos.setEnabled(false);
        cbSaldos.removeAllItems();
        txtSaldo.setText("");
    }
    
    public void popularReservas(Funcion funcion){
        cbReservas.removeAllItems();
        ArrayList<Reserva> reservas = teatro.getReservas();
        
        for(Reserva reserva : reservas){
            if(reserva.getEstado() == 1 && reserva.getTarjeta().equals(
                    teatro.getTarjeta(cbTarjetas.getSelectedItem().toString())
                    
            ) ){
                cbReservas.addItem(reserva.getCodigo());
            }
        }
    }
    
    public void popularTarjetas(Funcion funcion){
        ArrayList<Tarjeta> tarjetas = teatro.getTarjetas();
        ArrayList<Reserva> reservas = teatro.getReservas();
        ArrayList documentos = new ArrayList();

        for(Tarjeta tarjeta : tarjetas){
            for(Reserva reserva : reservas){
                if(reserva.getTarjeta() != null){
                    if(reserva.getTarjeta().equals(tarjeta)
                        && reserva.getFuncion().equals(funcion)
                        && reserva.getEstado() == 1
                            && !documentos.contains(tarjeta.getDocumento())){
                        cbTarjetas.addItem(tarjeta.getDocumento());
                        documentos.add(tarjeta.getDocumento());
                    }
                }
            }
        }
    }
    
    public void dibujarSillas(Funcion funcion, Tarjeta tarjeta){
//        System.out.println(funcion.getCodigo());
//        if(tarjeta != null){
//            System.out.println(tarjeta.getDocumento());
//        }
        
        Sala sala = funcion.getSala();
        
        jpContenedor.removeAll();
        jpContenedor.repaint();
        jpContenedor.setBackground(Color.white);
        int ancho = jpContenedor.getWidth();
        int alto = jpContenedor.getHeight();
        
        int anchoSilla = ancho / sala.getColumnas();
        int altoSilla = alto / sala.getFilas();
        
        int x, y;
        x = 0;
        y = 0;
        
        for(int i = 1; i <= sala.getColumnas(); i++){
            for(int j = 1; j <= sala.getFilas(); j++){
                MyJPanel jp = new MyJPanel();
                jp.setSize(anchoSilla, altoSilla);
                jp.setLocation(x, y);
                jp.setBorder(BorderFactory.createLineBorder(Color.black));
                jp.setSilla(sala.getSilla(i,j));
                
                switch(jp.getSilla().getTipo()){
                    case 1:
                        jp.setBackground(Color.gray);
                        break;
                    case 2:
                        jp.setBackground(Color.blue);
                        break;
                }
                
                Reserva reserva = teatro.getReserva(funcion,i,j);
                if(reserva != null){
                    switch(reserva.getEstado()){
                        case 1:
                            
                            if(tarjeta == null || !(reserva.getTarjeta().getDocumento()
                                        .equals(tarjeta.getDocumento()))){
                                jp.setBackground(Color.red);                            
                            }else{
                                jp.setBackground(Color.yellow);
                            }
                            break;
                        case 2:
                            jp.setBackground(Color.blue);
                            break;
                        case 3:
                            break;
                    }
                }
                
                if(!(jp.getBackground() == Color.red || jp.getBackground() == Color.blue
                        || jp.getBackground() == Color.yellow)){
                    
                    jp.addMouseListener(
                        new MouseAdapter() {
                        
                        @Override
                            public void mousePressed(MouseEvent me) {
                                MyJPanel jp = (MyJPanel) me.getSource();
                                int numcol = jp.getSilla().getNumeroColumna();
                                int numfil = jp.getSilla().getNumeroFila();
                        
                                if(jp.getBackground() != Color.green){
                                    jp.setBackground(Color.green);
                                }else{
                                    switch(jp.getSilla().getTipo()){
                                        case 1:
                                            jp.setBackground(Color.gray);
                                            break;
                                        case 2:
                                            jp.setBackground(Color.blue);
                                            break;
                                    } 
                                }
                                recalculaTotal();
                            }});
                    }                
                
                jpContenedor.add(jp);
                x += anchoSilla;
            }
            y += altoSilla;
            x = 0;
        }
    }
    
    public void recalculaTotal(){
        double total = 0.0;
        ArrayList<MyJPanel> jps = new ArrayList<>();
        
        for(Component component: jpContenedor.getComponents()){
            if(component.getBackground() == Color.yellow
                    || component.getBackground() == Color.green){
                MyJPanel jp =(MyJPanel)component;
                jps.add(jp);
            }
        }
        
        if(!jps.isEmpty()){
            for(MyJPanel jp : jps){
                if(jp.getBackground() == Color.green
                        || jp.getBackground() == Color.yellow){
                    switch(jp.getSilla().getTipo()){
                        case 1:
                            total += Teatro.TARIFA_GENERAL;
                            break;
                        case 2:
                            total += Teatro.TARIFA_PREFERENCIAL;
                            break;
                    }
                }
            }
            
            if(ckTarjetas.isSelected() || ckReserva.isSelected()){
                total = total * (1 - Teatro.DESCUENTO);
            }
            
            txtValor.setText("" + total);
        }else{
            txtValor.setText("" + 0.0);
        }
        
    }
    
    public double calculaTotal(){
        double total = 0.0;
        
        ArrayList<MyJPanel> jps = new ArrayList<>();
        
        for(Component component: jpContenedor.getComponents()){
            if(component.getBackground() == Color.yellow
                    || component.getBackground() == Color.green){
                MyJPanel jp =(MyJPanel)component;
                jps.add(jp);
            }
        }
        
        if(!jps.isEmpty()){
            for(MyJPanel jp : jps){
                if(jp.getBackground() == Color.green
                        || jp.getBackground() == Color.yellow){
                    switch(jp.getSilla().getTipo()){
                        case 1:
                            total += Teatro.TARIFA_GENERAL;
                            break;
                        case 2:
                            total += Teatro.TARIFA_PREFERENCIAL;
                            break;
                    }
                }
            }
        }
        
        return total;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JComboBox cbFunciones;
    private javax.swing.JComboBox cbReservas;
    private javax.swing.JComboBox cbSaldos;
    private javax.swing.JComboBox cbTarjetas;
    private javax.swing.JCheckBox ckReserva;
    private javax.swing.JCheckBox ckTarjetas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
