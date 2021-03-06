/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.coon;
/**
 *
 * @author HP
 */
public class biodata_mhs extends javax.swing.JFrame {

    /**
     * Creates new form biodata_mhs
     */
    public biodata_mhs() {
        initComponents();
        datatable();
        cleardata();
        
    }
    
    public void cleardata(){
        txtNim.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtTglL.setText("");
        cbFakultas.setSelectedItem("--Fakultas--");
        cbJurusan.setSelectedItem("--Jurusan--");
        cbAngkatan.setSelectedItem("--Angkatan--");
        txtNim.requestFocus();
    }
    
     public void datatable(){
        DefaultTableModel tbl=new DefaultTableModel();
        
        tbl.addColumn("NIM");
        tbl.addColumn("Nama");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Tanggal Lahir");
        tbl.addColumn("Alamat");
        tbl.addColumn("Fakultas");
        tbl.addColumn("Jurusan");
        tbl.addColumn("Angkatan");
        table.setModel(tbl);
    
        try{
            Statement statement = (Statement)coon.getConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM biodata_mhs");
            while(result.next())
            {
                tbl.addRow(new Object[]{
                    result.getString("nim"),
                    result.getString("nama"),
                    result.getString("jenis_kelamin"),
                    result.getString("tanggal_lahir"),
                    result.getString("alamat"),
                    result.getString("fakultas"),
                    result.getString("jurusan"),
                    result.getString("angkatn")
                });
                table.setModel(tbl);
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Terjadi kesalahan!!!"+e);
        }
    
    }
    
    public void create(){
        txtNim.setEnabled(true);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNim = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTglL = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPr = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        cbFakultas = new javax.swing.JComboBox();
        cbJurusan = new javax.swing.JComboBox();
        cbAngkatan = new javax.swing.JComboBox();
        btnCreate = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORM BIODATA");

        jLabel2.setText("NIM");

        jLabel3.setText("NAMA");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("TANGGAL LAHIR");

        jLabel6.setText("ALAMAT");

        jLabel7.setText("FAKULTAS");

        jLabel8.setText("JURUSAN");

        jLabel9.setText("ANGKATAN");

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLaki);
        rbLaki.setText("LAKI-LAKI");

        buttonGroup1.add(rbPr);
        rbPr.setText("PEREMPUAN");
        rbPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrActionPerformed(evt);
            }
        });

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        cbFakultas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "STIE", "STT", "STAI" }));
        cbFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFakultasActionPerformed(evt);
            }
        });

        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Managemen", "Akutansi", "Teknik mesin", "Teknik industri", "Teknik informatika", "Teknik arsitektur", "Teknik lingkungan" }));

        cbAngkatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011" }));
        cbAngkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAngkatanActionPerformed(evt);
            }
        });

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSimpan.setText("SAVE");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "NAMA", "JENIS KELAMIN", "TANGGAL LAHIR", "ALAMAT", "FAKULTAS", "JURUSAN", "ANGKATAN"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(rbLaki)
                        .addGap(18, 18, 18)
                        .addComponent(rbPr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbFakultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbAngkatan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTglL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbLaki)
                    .addComponent(rbPr))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTglL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnSimpan)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAngkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAngkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAngkatanActionPerformed

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void rbPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPrActionPerformed

    private void cbFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFakultasActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        
        String nim_ = txtNim.getText();
        String nama_ = txtNama.getText();   
        String tgl_ = txtTglL.getText();
        String alamat_ = txtAlamat.getText();
        String fakultas_ = (String) cbFakultas.getSelectedItem();
        String jurusan_ = (String) cbJurusan.getSelectedItem();
        String angkatan_ = (String) cbAngkatan.getSelectedItem();
        String jk_ = "";
        
        if (rbLaki.isSelected()){
            jk_="Laki-laki";
        }else if(rbPr.isSelected()){
            jk_="Perempuan";
        }
        
        Statement statement;
        try {
            statement = (Statement)coon.getConnection().createStatement();
            statement.executeUpdate("INSERT INTO biodata_mhs VALUES ('"+nim_+"', '"+nama_+"', '"+jk_+"', '"+tgl_+"', '"+alamat_+"', '"+fakultas_+"', '"+jurusan_+"', '"+angkatan_+"');");
            statement.close();
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
            Logger.getLogger(biodata_mhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        datatable();
        cleardata();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         cleardata();
        create();
        btnDelete.setEnabled(false);
        txtNim.requestFocus();
        if(txtNim.getText()=="")
            btnSimpan.setEnabled(false);
        else
            btnSimpan.setEnabled(true);
        btnCreate.setEnabled(false);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtNim.setEnabled(true);
        String nim_ = txtNim.getText();
        String nama_ = txtNama.getText();   
        String tgl_ = txtTglL.getText();
        String alamat_ = txtAlamat.getText();
        String fakultas_ = (String) cbFakultas.getSelectedItem();
        String jurusan_ = (String) cbJurusan.getSelectedItem();
        String angkatan_ = (String) cbAngkatan.getSelectedItem();
        String jk_ = "";
        
        if (rbLaki.isSelected()){
            jk_="Laki-laki";
        }else if(rbPr.isSelected()){
            jk_="Perempuan";
        }
        
        Statement statement;
        try {
            statement = (Statement)coon.getConnection().createStatement();
            statement.executeUpdate("UPDATE biodata_mhs SET "+"nama='"+nama_+"',"+"jenis_kelamin='"+jk_+"',"+"tanggal_lahir='"+tgl_+"',"+"alamat='"+alamat_+"',"+"fakultas='"+fakultas_+"',"+"jurusan='"+jurusan_+"',"+"angkatn='"+angkatan_+"'" + "WHERE nim='"+nim_+"'");
            statement.close();
            JOptionPane.showMessageDialog(null, "data berhasil di update");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "data gagal update: "+ex);
            Logger.getLogger(biodata_mhs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        datatable();
        cleardata();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        Statement statement;
        try {
            statement = (Statement)coon.getConnection().createStatement();
            statement.executeUpdate("DELETE FROM biodata_mhs WHERE nim='"+txtNim.getText()+"'");
            statement.close();
            JOptionPane.showMessageDialog(null, "data berhasil di hapus");
            datatable();
            cleardata();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "data gagal hapus: "+ex);
            Logger.getLogger(biodata_mhs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int tableData = table.getSelectedRow();
         
        txtNim.setText(table.getValueAt(tableData, 0).toString());
        txtNama.setText(table.getValueAt(tableData, 1).toString());
        if("Laki-laki".equals(table.getValueAt(tableData, 2).toString())) {
                rbLaki.setSelected(true);
              //  rbPr.setSelected(false);
        }else{
                rbPr.setSelected(true);
              //  rbLaki.setSelected(false);
        }
        txtTglL.setText(table.getValueAt(tableData, 3).toString());
        txtAlamat.setText(table.getValueAt(tableData, 4).toString());
        cbFakultas.setSelectedItem(table.getValueAt(tableData, 5).toString());
        cbJurusan.setSelectedItem(table.getValueAt(tableData, 6).toString());
        cbAngkatan.setSelectedItem(table.getValueAt(tableData, 7).toString());
        txtNim.setEnabled(false);
        
    }//GEN-LAST:event_tableMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(biodata_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biodata_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biodata_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biodata_mhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biodata_mhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbAngkatan;
    private javax.swing.JComboBox cbFakultas;
    private javax.swing.JComboBox cbJurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPr;
    private javax.swing.JTable table;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtTglL;
    // End of variables declaration//GEN-END:variables
}
