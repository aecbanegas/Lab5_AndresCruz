/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_andrescruz;

/**
 *
 * @author MBanegas
 */
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Lab5_AndresCruz extends javax.swing.JFrame {

    ArrayList<Empresa> lista = new ArrayList();

    /**
     * Creates new form Lab5_AndresCruz
     */
    public Lab5_AndresCruz() {
        initComponents();
        dc_fundacion.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_empresa = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        tf_nombreempresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dc_fundacion = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_ubicacion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        tf_idsucursal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_pin = new javax.swing.JTextField();
        jb_guardarempresa = new javax.swing.JButton();
        jd_menuempresa = new javax.swing.JDialog();
        nombrelabel = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jd_empleado = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        tf_nombreempleado = new javax.swing.JTextField();
        dc_nacimiento = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cb_cargo = new javax.swing.JComboBox<>();
        jb_crear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jb_crearempresa = new javax.swing.JButton();
        jb_entrar = new javax.swing.JButton();

        jLabel4.setText("Nombre: ");

        jLabel5.setText("Fecha de Fundacion: ");

        jLabel6.setText("Tipo de Empresa:");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Micro", "Mediana", "Gran" }));

        jLabel7.setText("Ubicacion: ");

        ta_ubicacion.setColumns(20);
        ta_ubicacion.setRows(5);
        jScrollPane1.setViewportView(ta_ubicacion);

        jLabel8.setText("ID de la sucursal:");

        jLabel9.setText("Contraseña:");

        jb_guardarempresa.setText("Guardar");
        jb_guardarempresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarempresaMouseClicked(evt);
            }
        });
        jb_guardarempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarempresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_empresaLayout = new javax.swing.GroupLayout(jd_empresa.getContentPane());
        jd_empresa.getContentPane().setLayout(jd_empresaLayout);
        jd_empresaLayout.setHorizontalGroup(
            jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_empresaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_empresaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_empresaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nombreempresa))
                    .addGroup(jd_empresaLayout.createSequentialGroup()
                        .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dc_fundacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jd_empresaLayout.createSequentialGroup()
                        .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_idsucursal)
                            .addComponent(tf_pin))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_empresaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_guardarempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jd_empresaLayout.setVerticalGroup(
            jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_empresaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombreempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(dc_fundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_idsucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_empresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_guardarempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nombrelabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nombrelabel.setText("jLabel10");

        idlabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        idlabel.setText("jLabel11");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree1);

        jButton1.setText("Crear Empleado");

        jLabel10.setText("Lista Empleados: ");

        jList1.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jList1);

        javax.swing.GroupLayout jd_menuempresaLayout = new javax.swing.GroupLayout(jd_menuempresa.getContentPane());
        jd_menuempresa.getContentPane().setLayout(jd_menuempresaLayout);
        jd_menuempresaLayout.setHorizontalGroup(
            jd_menuempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuempresaLayout.createSequentialGroup()
                .addGroup(jd_menuempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_menuempresaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(nombrelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_menuempresaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jd_menuempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jd_menuempresaLayout.setVerticalGroup(
            jd_menuempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_menuempresaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jd_menuempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jd_menuempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jd_menuempresaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel11.setText("Nombre: ");

        jLabel12.setText("Nacimiento:");

        jLabel13.setText("Correo:");

        jLabel14.setText("Cargo:");

        cb_cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniero", "Medico", "Estudiante", "Licenciado", "Maestro" }));

        jb_crear.setText("Crear Empleado");

        javax.swing.GroupLayout jd_empleadoLayout = new javax.swing.GroupLayout(jd_empleado.getContentPane());
        jd_empleado.getContentPane().setLayout(jd_empleadoLayout);
        jd_empleadoLayout.setHorizontalGroup(
            jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_empleadoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_crear)
                    .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dc_nacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                        .addComponent(tf_nombreempleado)
                        .addComponent(tf_correo))
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jd_empleadoLayout.setVerticalGroup(
            jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_empleadoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_nombreempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dc_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jb_crear)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("ID de la empresa: ");

        jLabel3.setText("Contraseña:");

        jb_crearempresa.setText("Crear Empresa");
        jb_crearempresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearempresaMouseClicked(evt);
            }
        });

        jb_entrar.setText("Iniciar Sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_entrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_crearempresa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crearempresa)
                    .addComponent(jb_entrar))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearempresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearempresaMouseClicked
        // TODO add your handling code here:
        jd_empresa.setModal(true);
        jd_empresa.pack();
        jd_empresa.setLocationRelativeTo(this);
        jd_empresa.setVisible(true);
    }//GEN-LAST:event_jb_crearempresaMouseClicked

    private void jb_guardarempresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarempresaMouseClicked
        // TODO add your handling code here:
        String Nombre;
        double capital = 0;
        Date fundacion;
        String tipo;
        String ubicacion;
        String id_sucursal;
        String pin;
        if (tf_pin.getText().isEmpty() || tf_idsucursal.getText().isEmpty() || tf_nombreempresa.getText().isEmpty()||ta_ubicacion.toString().isEmpty()) {
            JOptionPane.showMessageDialog(jd_empresa, "Algunos campos estan vacios!!");
        } else {
            try {
                Nombre = tf_nombreempresa.getText();
                if (cb_tipo.getSelectedItem().toString().equals("Micro")) {
                    capital = 80000;
                    tipo = cb_tipo.getSelectedItem().toString();
                }
                if (cb_tipo.getSelectedItem().toString().equals("Mediana")) {
                    capital = 120000;
                    tipo = cb_tipo.getSelectedItem().toString();
                }
                if (cb_tipo.getSelectedItem().toString().equals("Gran")) {
                    capital = 169000;
                    tipo = cb_tipo.getSelectedItem().toString();
                }
                fundacion = dc_fundacion.getDate();
                ubicacion = ta_ubicacion.getText();
                id_sucursal = tf_idsucursal.getText();
                pin = tf_pin.getText();
                if (nom(Nombre)||idsuc(id_sucursal)||idsucint(id_sucursal)) {
                    if (nom(Nombre)) {
                        JOptionPane.showMessageDialog(jd_empresa, "Ya existe otra empresa con ese nombre!!");
                    }
                    if (idsuc(id_sucursal)) {
                        JOptionPane.showMessageDialog(jd_empresa,"Ya existe otra empresa con ese ID de sucursal!!" );
                    }
                    if (idsucint(id_sucursal)) {
                        JOptionPane.showMessageDialog(jd_empresa,"La id de sucursal debe ser siempre numerico!!" );
                    }
                }else{
                    tf_idsucursal.setText("");
                    tf_nombreempresa.setText("");
                    tf_pin.setText("");
                    cb_tipo.setSelectedIndex(0);
                    ta_ubicacion.setText("");
                    dc_fundacion.setDate(new Date());
                lista.add(new Empresa(Nombre, capital, fundacion, ubicacion, id_sucursal, pin));
                JOptionPane.showMessageDialog(jd_empresa, "Se creo la empresa de manera correcta!");
                jd_empresa.dispose();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jd_empresa, "Datos ingresados incorrectos!!");
            }

        }
    }//GEN-LAST:event_jb_guardarempresaMouseClicked

    private void jb_guardarempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_guardarempresaActionPerformed
    
    private boolean nom(String nombre){
        for (int i = 0; i < lista.size(); i++) {
            if (nombre.equals(lista.get(i).getNombre())) {
                return true;
            }
        }
        return false;
    }
    private boolean idsuc(String nombre){
        for (int i = 0; i < lista.size(); i++) {
            if (nombre.equals(lista.get(i).getId_sucursal())) {
                return true;
            }
        }
        return false;
    }
    private boolean idsucint(String nombre){
        for (int i = 0; i < nombre.length(); i++) {
            if (Character.isDigit(nombre.charAt(i))) {
                
            }else{
            return true;
            }
        }
        return false;
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
            java.util.logging.Logger.getLogger(Lab5_AndresCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab5_AndresCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab5_AndresCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab5_AndresCruz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab5_AndresCruz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_cargo;
    private javax.swing.JComboBox<String> cb_tipo;
    private com.toedter.calendar.JDateChooser dc_fundacion;
    private com.toedter.calendar.JDateChooser dc_nacimiento;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_crearempresa;
    private javax.swing.JButton jb_entrar;
    private javax.swing.JButton jb_guardarempresa;
    private javax.swing.JDialog jd_empleado;
    private javax.swing.JDialog jd_empresa;
    private javax.swing.JDialog jd_menuempresa;
    private javax.swing.JLabel nombrelabel;
    private javax.swing.JTextArea ta_ubicacion;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_idsucursal;
    private javax.swing.JTextField tf_nombreempleado;
    private javax.swing.JTextField tf_nombreempresa;
    private javax.swing.JTextField tf_pin;
    // End of variables declaration//GEN-END:variables
Empresa seleccionado;
}
