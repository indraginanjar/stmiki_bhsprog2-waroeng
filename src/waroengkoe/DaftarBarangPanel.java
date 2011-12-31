/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package waroengkoe;

/**
 *
 * @author indra
 */
public class DaftarBarangPanel extends javax.swing.JPanel {

    final String simpan = "Simpan";
    final String tambah = "Tambah";
    final String ubah = "Ubah";    
    
    /**
     * Creates new form DaftarBarangPanel
     */
    public DaftarBarangPanel() {
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

        persediaanFormattedTextField = new javax.swing.JFormattedTextField();
        batalButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        daftarBarangTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        ubahButton = new javax.swing.JButton();
        tambahButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        hargaFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        persediaanFormattedTextField.setEditable(false);
        persediaanFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        batalButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        batalButton.setText("Batal");
        batalButton.setEnabled(false);
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        hapusButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        hapusButton.setText("Hapus");

        daftarBarangTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Barang", "Harga", "Persediaan"
            }
        ));
        jScrollPane3.setViewportView(daftarBarangTable);

        jLabel11.setText("Nama");

        namaTextField.setColumns(200);
        namaTextField.setEditable(false);

        ubahButton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        ubahButton.setText("Ubah");
        ubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahButtonActionPerformed(evt);
            }
        });

        tambahButton.setText("Tambah");
        tambahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButtonActionPerformed(evt);
            }
        });

        jLabel15.setText("Harga");

        hargaFormattedTextField.setEditable(false);
        hargaFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤¤#,##0"))));

        jLabel16.setText("Persediaan");

        jLabel1.setText("Saring berdasarkan nama");

        jButton1.setText("Saring");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tambahButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ubahButton)
                                .addGap(18, 18, 18)
                                .addComponent(batalButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hapusButton))
                            .addComponent(jLabel11)
                            .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(hargaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(persediaanFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubahButton)
                    .addComponent(tambahButton)
                    .addComponent(batalButton)
                    .addComponent(hapusButton))
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(5, 5, 5)
                .addComponent(hargaFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(persediaanFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        if (tambahButton.getText().equals(simpan)) {
            namaTextField.setEditable(false);
            hargaFormattedTextField.setEditable(false);
            persediaanFormattedTextField.setEditable(false);

            batalButton.setEnabled(false);
            hapusButton.setEnabled(true);
            ubahButton.setEnabled(true);

            tambahButton.setText(tambah);
        } else {
            namaTextField.setEditable(false);
            hargaFormattedTextField.setEditable(false);
            persediaanFormattedTextField.setEditable(false);

            batalButton.setEnabled(false);
            hapusButton.setEnabled(true);
            tambahButton.setEnabled(true);

            ubahButton.setText(ubah);
        }
    }//GEN-LAST:event_batalButtonActionPerformed

    private void ubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahButtonActionPerformed
        if (ubahButton.getText().equals(ubah)) {
            ubahButton.setText(simpan);
            batalButton.setEnabled(true);
            hapusButton.setEnabled(false);
            tambahButton.setEnabled(false);

            namaTextField.setEditable(true);
            hargaFormattedTextField.setEditable(true);
            persediaanFormattedTextField.setEditable(true);
            return;
        }

        namaTextField.setEditable(false);
        hargaFormattedTextField.setEditable(false);
        persediaanFormattedTextField.setEditable(false);

        batalButton.setEnabled(false);
        hapusButton.setEnabled(true);
        tambahButton.setEnabled(true);

        ubahButton.setText(ubah);
    }//GEN-LAST:event_ubahButtonActionPerformed

    private void tambahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButtonActionPerformed
        if (tambahButton.getText().equals(tambah)) {
            tambahButton.setText(simpan);
            batalButton.setEnabled(true);
            hapusButton.setEnabled(false);
            ubahButton.setEnabled(false);

            namaTextField.setText(null);
            hargaFormattedTextField.setText(null);
            persediaanFormattedTextField.setText(null);

            namaTextField.setEditable(true);
            hargaFormattedTextField.setEditable(true);
            persediaanFormattedTextField.setEditable(true);
            return;
        }
        /*
         * daftarBarang.tambah(namaDaftarBarangTextField.getText(),
         * hargaDaftarBarangFormattedTextField.getText(),
         * persediaanDaftarBarangFormattedTextField.getText());
         */
        namaTextField.setEditable(false);
        hargaFormattedTextField.setEditable(false);
        persediaanFormattedTextField.setEditable(false);

        batalButton.setEnabled(false);
        hapusButton.setEnabled(true);
        ubahButton.setEnabled(true);

        tambahButton.setText(tambah);
    }//GEN-LAST:event_tambahButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JTable daftarBarangTable;
    private javax.swing.JButton hapusButton;
    private javax.swing.JFormattedTextField hargaFormattedTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JFormattedTextField persediaanFormattedTextField;
    private javax.swing.JButton tambahButton;
    private javax.swing.JButton ubahButton;
    // End of variables declaration//GEN-END:variables
}
