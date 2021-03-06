/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soni.agencies;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import soni.agencies.data.ShopkeepersData;
import soni.agencies.db.BeatDetailsDb;
import soni.agencies.db.ShopkeeperDetailsDb;

/**
 *
 * @author YATRAONLINE\himanshu.soni
 */
public class BeatDetails extends javax.swing.JFrame {

    /**
     * Creates new form AddBeat
     */
    private Connection conn;
    List<ShopkeepersData> shopkeeperData;
    public BeatDetails() {
        initComponents();
        shopkeeperData = new ArrayList<>();
        this.getRootPane().setDefaultButton(jButtonAdd);
        doFrameConfiguration();
    }

    public BeatDetails(Connection conn) {
        this();
        this.conn = conn;
        updateBeatDetails();
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
        jLabelBeatName = new javax.swing.JLabel();
        jTextFieldBeat = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabelBeatSelect = new javax.swing.JLabel();
        jButtonView = new javax.swing.JButton();
        jComboBoxBeat = new javax.swing.JComboBox<>();
        jButtonPrint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFilterName = new javax.swing.JTextField();
        jTextFilterMobile = new javax.swing.JTextField();
        jToggleGst = new javax.swing.JToggleButton();
        jToggleAdhaar = new javax.swing.JToggleButton();
        jTogglePan = new javax.swing.JToggleButton();
        jToggleComposition = new javax.swing.JToggleButton();
        jButtonApplyFilter = new javax.swing.JButton();
        jButtonResetFilter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beat Details");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel1.setText("Beat Details");

        jLabelBeatName.setText("Beat Name");

        jButtonAdd.setText("Add Beat");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelBeatSelect.setText("Beat Name");

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jComboBoxBeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Beat" }));

        jButtonPrint.setText("Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No", "Id", "Beat", "Name", "Mobile No", "GST No", "Adhaar No", "PAN No", "Composition No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(1).setMinWidth(0);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(0);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(15);
        }

        jTextFilterName.setToolTipText("Name");

        jTextFilterMobile.setToolTipText("Mobile No");

        jToggleGst.setText("GST No");
        jToggleGst.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleGstStateChanged(evt);
            }
        });

        jToggleAdhaar.setText("Adhaar No");
        jToggleAdhaar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleAdhaarStateChanged(evt);
            }
        });

        jTogglePan.setText("PAN No");
        jTogglePan.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTogglePanStateChanged(evt);
            }
        });

        jToggleComposition.setText("Composition No");
        jToggleComposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleCompositionActionPerformed(evt);
            }
        });

        jButtonApplyFilter.setText("Apply Filter");
        jButtonApplyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApplyFilterActionPerformed(evt);
            }
        });

        jButtonResetFilter.setText("Reset Filter");
        jButtonResetFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetFilterActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Mobile");

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelBeatName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jTextFieldBeat, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelBeatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(jComboBoxBeat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFilterMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jTextFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleAdhaar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(jToggleGst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleComposition, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jTogglePan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonApplyFilter)
                    .addComponent(jButtonResetFilter))
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBeatName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBeatSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonView)
                    .addComponent(jButtonPrint)
                    .addComponent(jButtonEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleGst)
                    .addComponent(jTogglePan)
                    .addComponent(jButtonApplyFilter)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFilterMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleAdhaar)
                    .addComponent(jToggleComposition)
                    .addComponent(jButtonResetFilter)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        updateShopkeeperDetails();
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        try {
            String beat = jComboBoxBeat.getSelectedItem().toString();
            jTable1.print(JTable.PrintMode.NORMAL, new MessageFormat(beat), new MessageFormat("Soni Agencies"));
        } catch (PrinterException ex) {
            Logger.getLogger(BeatDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String beat = jTextFieldBeat.getText();
        if(!beat.isEmpty()){
            BeatDetailsDb detailsDb = new BeatDetailsDb();
            boolean result = detailsDb.saveData(conn, beat);
            if(result){
                jComboBoxBeat.addItem(jTextFieldBeat.getText());
                jTextFieldBeat.setText("");
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        ShopkeepersData data = new ShopkeepersData();
        int row = jTable1.getSelectedRow();
        String value = jTable1.getValueAt(row, 1).toString();
        data.setId(value);
        value = jTable1.getValueAt(row, 2).toString();
        data.setBeat(value);
        value = jTable1.getValueAt(row, 3).toString();
        data.setName(value);
        value = jTable1.getValueAt(row, 4).toString();
        data.setMobileNo(value);
        value = jTable1.getValueAt(row, 5).toString();
        data.setGstNo(value);
        value = jTable1.getValueAt(row, 6).toString();
        data.setAdhaarNo(value);
        value = jTable1.getValueAt(row, 7).toString();
        data.setPanNo(value);
        value = jTable1.getValueAt(row, 8).toString();
        data.setCompositionNo(value);
        
        new ShopkeeperDetails(conn, data, this).setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApplyFilterActionPerformed
        String name = jTextFilterName.getText();
        String mobileNo = jTextFilterMobile.getText();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        int i = 1;
        for(ShopkeepersData data : shopkeeperData){
            if(name.isEmpty() && mobileNo.isEmpty()){
                if(data.getGstNo().isEmpty() && data.getAdhaarNo().isEmpty() && data.getPanNo().isEmpty() && data.getCompositionNo().isEmpty())
                    model.addRow(new Object[]{i++, data.getId(), data.getBeat(), data.getName(), data.getMobileNo(), data.getGstNo(), data.getAdhaarNo(), data.getPanNo(), data.getCompositionNo()});
            }
            else if((name.isEmpty() || data.getName().toLowerCase().startsWith(name.toLowerCase())) && (mobileNo.isEmpty() || data.getMobileNo().startsWith(mobileNo))){
                    model.addRow(new Object[]{i++, data.getId(), data.getBeat(), data.getName(), data.getMobileNo(), data.getGstNo(), data.getAdhaarNo(), data.getPanNo(), data.getCompositionNo()});
            }
        }
    }//GEN-LAST:event_jButtonApplyFilterActionPerformed

    private void jButtonResetFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetFilterActionPerformed
        resetFilter();
    }//GEN-LAST:event_jButtonResetFilterActionPerformed

    private void jToggleGstStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleGstStateChanged
        applyFilters();
    }//GEN-LAST:event_jToggleGstStateChanged

    private void jTogglePanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTogglePanStateChanged
        applyFilters();
    }//GEN-LAST:event_jTogglePanStateChanged

    private void jToggleAdhaarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleAdhaarStateChanged
        applyFilters();
    }//GEN-LAST:event_jToggleAdhaarStateChanged

    private void jToggleCompositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleCompositionActionPerformed
        applyFilters();
    }//GEN-LAST:event_jToggleCompositionActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        String beat = jComboBoxBeat.getSelectedItem().toString();
        if(!beat.equalsIgnoreCase("Select Beat")){
            new BeatName(conn, beat).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

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
            java.util.logging.Logger.getLogger(BeatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeatDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeatDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonApplyFilter;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonResetFilter;
    private javax.swing.JButton jButtonView;
    private javax.swing.JComboBox<String> jComboBoxBeat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBeatName;
    private javax.swing.JLabel jLabelBeatSelect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBeat;
    private javax.swing.JTextField jTextFilterMobile;
    private javax.swing.JTextField jTextFilterName;
    private javax.swing.JToggleButton jToggleAdhaar;
    private javax.swing.JToggleButton jToggleComposition;
    private javax.swing.JToggleButton jToggleGst;
    private javax.swing.JToggleButton jTogglePan;
    // End of variables declaration//GEN-END:variables

     private void updateBeatDetails() {
        BeatDetailsDb details = new BeatDetailsDb();
        Set<String> beats = details.getBeats(conn);
        Iterator<String> itr = beats.iterator();
        while(itr.hasNext()){
            jComboBoxBeat.addItem(itr.next());
        }
    }

    public void updateShopkeeperDetails() {
        ShopkeeperDetailsDb details = new ShopkeeperDetailsDb();
        String beat = jComboBoxBeat.getSelectedItem().toString();
        beat = beat.equalsIgnoreCase("Select Beat") ? "" : beat;
        ResultSet rs = details.getShopkeeperData(conn, beat);
        if(rs == null)
            return;
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        shopkeeperData.clear();
        
        try{
            int i = 1;
            while (rs.next()) {
                ShopkeepersData data = new ShopkeepersData();
                data.setId(rs.getString(1));
                data.setBeat(rs.getString(2));
                data.setName(rs.getString(3));
                data.setMobileNo(rs.getString(4));
                data.setGstNo(rs.getString(5));
                data.setAdhaarNo(rs.getString(6));
                data.setPanNo(rs.getString(7));
                data.setCompositionNo(rs.getString(8));
                shopkeeperData.add(data);
                model.addRow(new Object[]{"" + i++, rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    private void applyFilters() {
        boolean gst = jToggleGst.isSelected();
        boolean adhaar = jToggleAdhaar.isSelected();
        boolean pan = jTogglePan.isSelected();
        boolean com = jToggleComposition.isSelected();
        
        if(!(gst || adhaar || pan || com)){
            resetFilter();
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        int i = 1;
        for(ShopkeepersData data : shopkeeperData){
            if((gst && !data.getGstNo().isEmpty()) || (adhaar && !data.getAdhaarNo().isEmpty()) || (pan && !data.getPanNo().isEmpty()) || (com && !data.getCompositionNo().isEmpty())){
                model.addRow(new Object[]{i++, data.getId(), data.getBeat(), data.getName(), data.getMobileNo(), data.getGstNo(), data.getAdhaarNo(), data.getPanNo(), data.getCompositionNo()});
            }
        }
    }

    private void resetFilter() {
        jToggleAdhaar.setSelected(false);
        jToggleGst.setSelected(false);
        jTogglePan.setSelected(false);
        jToggleComposition.setSelected(false);
        jTextFilterMobile.setText("");
        jTextFilterName.setText("");
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        int i = 1;
        for(ShopkeepersData data : shopkeeperData){
            model.addRow(new Object[]{i++, data.getId(), data.getBeat(), data.getName(), data.getMobileNo(), data.getGstNo(), data.getAdhaarNo(), data.getPanNo(), data.getCompositionNo()});
        }
    }

    private void doFrameConfiguration() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        this.getRootPane().getActionMap().put("Cancel", new AbstractAction()
        { 
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
       });
    }
}
