/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waroengkoe;

import com.mysql.jdbc.Connection;
import java.awt.Component;
import java.awt.Color;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author indra
 */
public class PenjualanPanel extends javax.swing.JPanel {

    /**
     * Creates new form PenjualanPanel
     */
    public PenjualanPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaPopupMenu = new javax.swing.JPopupMenu();
        jLabel5 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tambahButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jumlahBarangFormattedTextField = new javax.swing.JFormattedTextField();
        namaTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        hapusButton = new javax.swing.JButton();
        errorMarkJumlahLabel = new javax.swing.JLabel();
        errorMarkNamaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        namaPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namaPopupMenuMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                namaPopupMenuMouseReleased(evt);
            }
        });

        setForeground(new java.awt.Color(255, 51, 51));
        setFont(new java.awt.Font("Dialog", 0, 5)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("24.900");

        simpanButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        simpanButton.setText("Simpan");

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("TOTAL:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bakwan", "1000", "10"},
                {"Rokok A-Mild", "1200", "12"},
                {"Mount Tea", "500", "1"},
                {null, null, null}
            },
            new String [] {
                "Barang", "Harga", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setPreferredSize(null);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tambahButton.setText("Tambahkan");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        batalButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        batalButton.setText("Batal");

        jLabel3.setText("Jumlah");

        jumlahBarangFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jumlahBarangFormattedTextField.setInputVerifier(new IntegerVerifier());
        jumlahBarangFormattedTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jumlahBarangFormattedTextFieldPropertyChange(evt);
            }
        });

        namaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaTextFieldKeyReleased(evt);
            }
        });

        jLabel2.setText("Nama barang");

        hapusButton.setText("Hapus");

        errorMarkJumlahLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorMarkJumlahLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorMarkJumlahLabel.setText("*)");

        errorMarkNamaLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        errorMarkNamaLabel.setForeground(new java.awt.Color(255, 51, 51));
        errorMarkNamaLabel.setText("*)");

        jLabel1.setText("Harga");

        jLabel6.setText("jLabel6");

        jLabel7.setText("Total Harga");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(batalButton))
                            .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hapusButton)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jumlahBarangFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(errorMarkJumlahLabel))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(errorMarkNamaLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMarkNamaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jumlahBarangFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorMarkJumlahLabel))
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(tambahButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpanButton)
                            .addComponent(batalButton))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapusButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        if(namaTextField.getText().isEmpty()){
            errorMarkNamaLabel.setVisible(true);
        }
        else{
            errorMarkNamaLabel.setVisible(false);
        }
        if(!jumlahBarangFormattedTextField.getText().isEmpty() && jumlahBarangFormattedTextField.isEditValid()){
            errorMarkJumlahLabel.setVisible(false);
        }else{
            errorMarkJumlahLabel.setVisible(true);
        }
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void jumlahBarangFormattedTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jumlahBarangFormattedTextFieldPropertyChange
        if(evt.getPropertyName().equals("value")){
            if(jumlahBarangFormattedTextField.isEditValid()){
                jumlahBarangFormattedTextField.setForeground(Color.black);
            }else{
                jumlahBarangFormattedTextField.setForeground(Color.red);
                
            }
        }
    }//GEN-LAST:event_jumlahBarangFormattedTextFieldPropertyChange

    private void namaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaTextFieldKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE || 
                evt.getKeyCode() == KeyEvent.VK_ENTER){
            return;
        }
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            namaPopupMenu.requestFocus();
            return;
        }
        try {
            Statement statement = DatabaseUtil.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT nama FROM barang");
            namaPopupMenu.removeAll();
            while(resultSet.next()){
                namaPopupMenu.add(resultSet.getString("nama"));
            }
            namaPopupMenu.setInvoker(this);
            namaPopupMenu.setVisible(true);
            Point location = namaTextField.getLocation();
            location.y += 5 * namaTextField.getHeight();
            namaPopupMenu.setLocation(location);
            namaTextField.requestFocus();
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_namaTextFieldKeyReleased

    private void namaPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namaPopupMenuMouseClicked
        // Get the selected menu path
        MenuElement[] path = MenuSelectionManager.defaultManager().getSelectedPath();

        if (path.length == 0) {
            // No menus are opened or menu items selected
        }

        // Retrieve the labels of all the menu elements in the path
        for (int i=0; i<path.length; i++) {
            Component c = path[i].getComponent();

            if (c instanceof JMenuItem) {
                JMenuItem mi = (JMenuItem)c;
                namaTextField.setText(mi.getText());
                // Note: JMenu is a subclass of JMenuItem; also JMenuBar does not have a label
            }
        }
    }//GEN-LAST:event_namaPopupMenuMouseClicked

    private void namaPopupMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namaPopupMenuMouseReleased
        // Get the selected menu path
        MenuElement[] path = MenuSelectionManager.defaultManager().getSelectedPath();

        if (path.length == 0) {
            // No menus are opened or menu items selected
        }

        // Retrieve the labels of all the menu elements in the path
        for (int i=0; i<path.length; i++) {
            Component c = path[i].getComponent();

            if (c instanceof JMenuItem) {
                JMenuItem mi = (JMenuItem)c;
                namaTextField.setText(mi.getText());
                // Note: JMenu is a subclass of JMenuItem; also JMenuBar does not have a label
            }
        }
    }//GEN-LAST:event_namaPopupMenuMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JLabel errorMarkJumlahLabel;
    private javax.swing.JLabel errorMarkNamaLabel;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField jumlahBarangFormattedTextField;
    private javax.swing.JPopupMenu namaPopupMenu;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton tambahButton;
    // End of variables declaration//GEN-END:variables
}
