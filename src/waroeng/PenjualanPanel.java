package waroeng;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indra
 */
public class PenjualanPanel extends javax.swing.JPanel {

    DefaultTableModel penjualanModel;
    int totalPenjualan = 0;

    /**
     * Creates new form PenjualanPanel
     */
    public PenjualanPanel() {
        initComponents();
        penjualanModel = new DefaultTableModel();
        penjualanModel.addColumn("barang");
        penjualanModel.addColumn("harga");
        penjualanModel.addColumn("jumlah");
        penjualanTable.setModel(penjualanModel);
        autocompleteScrollPane.setVisible(false);
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
        totalPenjualanLabel = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        penjualanTable = new javax.swing.JTable();
        tambahButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        autocompleteScrollPane = new javax.swing.JScrollPane();
        autocompleteList = new javax.swing.JList();
        hargaBarangLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        totalHargaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jumlahBarangFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();

        namaPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namaPopupMenuMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                namaPopupMenuMouseReleased(evt);
            }
        });
        namaPopupMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaPopupMenuKeyReleased(evt);
            }
        });

        setForeground(new java.awt.Color(255, 51, 51));
        setFont(new java.awt.Font("Dialog", 0, 5)); // NOI18N

        totalPenjualanLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        totalPenjualanLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPenjualanLabel.setText("0");

        simpanButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("TOTAL:");

        penjualanTable.setModel(new javax.swing.table.DefaultTableModel(
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
        penjualanTable.setPreferredSize(null);
        jScrollPane1.setViewportView(penjualanTable);
        penjualanTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        tambahButton.setText("Tambahkan");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        batalButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        hapusButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Rp. ");

        autocompleteList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        autocompleteList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        autocompleteList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                autocompleteListValueChanged(evt);
            }
        });
        autocompleteList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                autocompleteListKeyReleased(evt);
            }
        });
        autocompleteScrollPane.setViewportView(autocompleteList);

        autocompleteScrollPane.setBounds(0, 40, 290, 70);
        jLayeredPane1.add(autocompleteScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        hargaBarangLabel.setText("0");
        hargaBarangLabel.setBounds(40, 70, 8, 15);
        jLayeredPane1.add(hargaBarangLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("Total Harga:");
        jLabel7.setBounds(0, 140, 88, 15);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Harga:");
        jLabel1.setBounds(0, 50, 48, 15);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        totalHargaLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalHargaLabel.setText("0");
        totalHargaLabel.setBounds(40, 160, 8, 15);
        jLayeredPane1.add(totalHargaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Jumlah:");
        jLabel3.setBounds(0, 90, 52, 15);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jumlahBarangFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jumlahBarangFormattedTextField.setInputVerifier(new IntegerVerifier());
        jumlahBarangFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jumlahBarangFormattedTextFieldFocusLost(evt);
            }
        });
        jumlahBarangFormattedTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jumlahBarangFormattedTextFieldPropertyChange(evt);
            }
        });
        jumlahBarangFormattedTextField.setBounds(0, 110, 118, 19);
        jLayeredPane1.add(jumlahBarangFormattedTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("Rp. ");
        jLabel8.setBounds(0, 160, 27, 15);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Rp. ");
        jLabel6.setBounds(0, 70, 27, 15);
        jLayeredPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Nama barang:");
        jLabel2.setBounds(0, 0, 118, 15);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        namaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaTextFieldFocusLost(evt);
            }
        });
        namaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                namaTextFieldKeyReleased(evt);
            }
        });
        namaTextField.setBounds(0, 20, 290, 19);
        jLayeredPane1.add(namaTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(batalButton))
                            .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalPenjualanLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hapusButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalPenjualanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambahButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(simpanButton)
                            .addComponent(batalButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hapusButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        Object[] cols = new Object[3];
        cols[0] = namaTextField.getText();
        cols[1] = hargaBarangLabel.getText();
        cols[2] = totalHargaLabel.getText();
        penjualanModel.addRow(cols);
        penjualanModel.fireTableDataChanged();
        namaTextField.requestFocus();
        InputUtil.emptyAllTextComponent(this);
        int totalHarga = Integer.parseInt(totalHargaLabel.getText());
        totalPenjualan += totalHarga;
        totalPenjualanLabel.setText(String.valueOf(totalPenjualan));
    }//GEN-LAST:event_tambahButtonActionPerformed

    private void jumlahBarangFormattedTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jumlahBarangFormattedTextFieldPropertyChange
        if (evt.getPropertyName().equals("value")) {
            if (jumlahBarangFormattedTextField.isEditValid()) {
                jumlahBarangFormattedTextField.setForeground(Color.black);
            } else {
                jumlahBarangFormattedTextField.setForeground(Color.red);

            }
        }
    }//GEN-LAST:event_jumlahBarangFormattedTextFieldPropertyChange

    private void namaPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namaPopupMenuMouseClicked
    }//GEN-LAST:event_namaPopupMenuMouseClicked

    private void namaPopupMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namaPopupMenuMouseReleased
    }//GEN-LAST:event_namaPopupMenuMouseReleased

    private void namaTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaTextFieldKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //autocompleteList.setVisible(false);
            autocompleteScrollPane.setVisible(false);
            namaTextField.setCaretPosition(namaTextField.getText().length());
            return;
        }      
        /*
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            namaPopupMenu.setVisible(true);
            namaPopupMenu.requestFocus();
            return;
        }
        * 
        */
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            //autocompleteList.requestFocus();
            int selectedIndex = autocompleteList.getSelectedIndex();
            if(selectedIndex == -1){
                autocompleteList.setSelectedIndex(0);
            }else{
                ++selectedIndex;
                autocompleteList.setSelectedIndex(selectedIndex);
            }
            return;
        }
        
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            //autocompleteList.requestFocus();
            int selectedIndex = autocompleteList.getSelectedIndex();
            if(selectedIndex == -1){
                autocompleteList.setSelectedIndex(0);
            }else if(selectedIndex > 0){
                --selectedIndex;
                autocompleteList.setSelectedIndex(selectedIndex);
            }else{
                int start = 
            }
            return;
        }
        
        try {
            Statement statement = DatabaseUtil.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT nama FROM barang WHERE nama LIKE \""
                    + namaTextField.getText()
                    + "%\" LIMIT 10");
            Vector<String> v = new Vector<String>();
            while (resultSet.next()) {
                autocompleteList.add(new JLabel(resultSet.getString("nama")));
                v.addElement(resultSet.getString("nama"));

            }
            autocompleteList.setListData(v);


            autocompleteScrollPane.setVisible(true);
            if(!v.isEmpty()){
                
            }
            namaTextField.requestFocus();


        } catch (SQLException ex) {
            Logger.getLogger(PenjualanPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_namaTextFieldKeyReleased

    private void namaPopupMenuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaPopupMenuKeyReleased
        MenuElement[] path = MenuSelectionManager.defaultManager().getSelectedPath();

        if (path.length == 0) {
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            for (int i = 0; i < path.length; i++) {
                Component c = path[i].getComponent();

                if (c instanceof JMenuItem) {
                    JMenuItem mi = (JMenuItem) c;
                    namaTextField.setText(mi.getText());
                }
            }
            namaPopupMenu.setVisible(false);
            namaTextField.requestFocus();
        }


    }//GEN-LAST:event_namaPopupMenuKeyReleased

    private void namaTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaTextFieldFocusLost
        try {
            Statement statement = DatabaseUtil.getConnection().createStatement();
            String query = "select hargajual from barang where nama='" + namaTextField.getText() + "'";
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                hargaBarangLabel.setText(resultSet.getString("hargajual"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_namaTextFieldFocusLost

    private void jumlahBarangFormattedTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jumlahBarangFormattedTextFieldFocusLost
        int harga = Integer.parseInt(hargaBarangLabel.getText());
        int jumlah = Integer.parseInt(jumlahBarangFormattedTextField.getText());
        totalHargaLabel.setText("" + harga * jumlah);
    }//GEN-LAST:event_jumlahBarangFormattedTextFieldFocusLost

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        penjualanModel.getDataVector().removeAllElements();
        penjualanModel.fireTableDataChanged();
        namaTextField.setText("");
        hargaBarangLabel.setText("0");
        totalHargaLabel.setText("0");
        totalPenjualanLabel.setText("0");
    }//GEN-LAST:event_batalButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        if (penjualanTable.getSelectedRow() == -1) {
            return;
        }
        penjualanModel.getDataVector().removeElementAt(penjualanTable.getSelectedRow());
        penjualanModel.fireTableDataChanged();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        penjualanModel.getDataVector().removeAllElements();
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void autocompleteListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_autocompleteListValueChanged
        int startSelection = namaTextField.getSelectionStart();
        String nama = namaTextField.getText().substring(0, startSelection);
        int pos = nama.length();
        String completetion = autocompleteList.getSelectedValue().toString().substring(pos);
        namaTextField.setText(nama + completetion);
        namaTextField.setCaretPosition(namaTextField.getText().length());
        namaTextField.moveCaretPosition(pos);
    }//GEN-LAST:event_autocompleteListValueChanged

    private void autocompleteListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_autocompleteListKeyReleased
        namaTextField.requestFocus();
        autocompleteScrollPane.setVisible(false);
        autocompleteList.setVisible(false);
    }//GEN-LAST:event_autocompleteListKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList autocompleteList;
    private javax.swing.JScrollPane autocompleteScrollPane;
    private javax.swing.JButton batalButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel hargaBarangLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jumlahBarangFormattedTextField;
    private javax.swing.JPopupMenu namaPopupMenu;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTable penjualanTable;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton tambahButton;
    private javax.swing.JLabel totalHargaLabel;
    private javax.swing.JLabel totalPenjualanLabel;
    // End of variables declaration//GEN-END:variables

    private class CompletionTask implements Runnable {
        String completion;
        int position;
        
        CompletionTask(String completion, int position) {
            this.completion = completion;
            this.position = position;
        }
        
        @Override
        public void run() {
            //namaTextField.set
            //namaTextField.insert(completion, position);
            //String existingString = namaTextField.getText();
            namaTextField.setText(namaTextField.getText() + completion);
            namaTextField.setCaretPosition(position + completion.length());
            namaTextField.moveCaretPosition(position);
            //mode = Mode.COMPLETION;
        }
    }


}