
package com.mycompany.maintechnician;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class TechnicianForm extends javax.swing.JFrame {

    public TechnicianForm() 
    {
        initComponents();
        setTitle("TECHNICIAN");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LocationLabel = new javax.swing.JLabel();
        CityComboBox = new javax.swing.JComboBox<>();
        TechnicianNameLbl = new javax.swing.JLabel();
        txtTechnicianName = new javax.swing.JTextField();
        CostLbl = new javax.swing.JLabel();
        txtRepairCost = new javax.swing.JTextField();
        technicianRateLbl = new javax.swing.JLabel();
        txtTechnicianRate = new javax.swing.JTextField();
        ReportLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFieldReport = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItem_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItem_ProcessReport = new javax.swing.JMenuItem();
        MenuItem_Clear = new javax.swing.JMenuItem();
        MenuItem_Save = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LocationLabel.setText("TECHNICIAN LOCATION: ");

        CityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cape Town", "Durban", "Pretoria" }));
        CityComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CityComboBoxItemStateChanged(evt);
            }
        });
        CityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CityComboBoxActionPerformed(evt);
            }
        });

        TechnicianNameLbl.setText("TECHNICIAN NAME:");

        txtTechnicianName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTechnicianNameActionPerformed(evt);
            }
        });

        CostLbl.setText("REPAIR COST:");

        txtRepairCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepairCostActionPerformed(evt);
            }
        });

        technicianRateLbl.setText("TECHNICIAN RATE:");

        txtTechnicianRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTechnicianRateActionPerformed(evt);
            }
        });

        ReportLbl.setText("TECHNICIAN REPORT:");

        txtFieldReport.setColumns(20);
        txtFieldReport.setRows(5);
        jScrollPane1.setViewportView(txtFieldReport);

        jMenu1.setText("File");

        MenuItem_Exit.setText("Exit");
        MenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        MenuItem_ProcessReport.setText("Process Report");
        MenuItem_ProcessReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ProcessReportActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_ProcessReport);

        MenuItem_Clear.setText("Clear");
        MenuItem_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ClearActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_Clear);

        MenuItem_Save.setText("Save");
        MenuItem_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_SaveActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_Save);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(technicianRateLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTechnicianRate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CostLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRepairCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TechnicianNameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTechnicianName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LocationLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(ReportLbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TechnicianNameLbl)
                    .addComponent(txtTechnicianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRepairCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(technicianRateLbl)
                    .addComponent(txtTechnicianRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(ReportLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTechnicianNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTechnicianNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTechnicianNameActionPerformed

    private void txtRepairCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepairCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepairCostActionPerformed

    private void txtTechnicianRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTechnicianRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTechnicianRateActionPerformed

    private void MenuItem_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ClearActionPerformed
        txtTechnicianName.setText("");
        txtRepairCost.setText("");
        txtTechnicianRate.setText("");
    }//GEN-LAST:event_MenuItem_ClearActionPerformed

    private void MenuItem_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_SaveActionPerformed
                
        try
        {
        // Get the user's input to pass the classes and methods
        String location = CityComboBox.getSelectedItem().toString();
        String name = txtTechnicianName.getText();
        String cost = txtRepairCost.getText();
        String rate = txtTechnicianRate.getText();
        
        String output = "";
        
        // Create the object of Data class to test the user input validation
        Data data = new Data (location, name, Double.parseDouble(cost), Double.parseDouble(rate));
        
        //To access the 2 methods to calcualte the totals and validations we need to make instance of the class
        Technician tech = new Technician();
        
        // ValidateData method holding values of Technician Data
        if(tech.ValidateData(data) == true)
        {
            double pay = tech.CalculatePay(cost, rate);
            
            output = "TECHNICIAN LOCATION: " + data.Technician_Location + "\n"
            + "TECHNICIAN NAME: " + data.Technician_Name + "\n"
            + "REPAIR COST: R" + data.Repair_Cost + "\n"
            + "TECHNICIAN RATE: " + data.Technician_Rate + "\n"
            + "CALCULATED PAY: R" + String.format("%.2f", pay);
        }
        
        //Write the same output report to the text file
        FileWriter writer = new FileWriter("report.txt", true);
        
        writer.write("\nTECHNICIAN REPORT \n"
                + "*********************************** \n"
                + output + "\n"
                + "**********************************\n");
        writer.close();
        
        JOptionPane.showMessageDialog(this, "Record saved successfully!");
        }
        
        catch(IOException e)
        {
           JOptionPane.showMessageDialog(this, "Error saving file: " + e.getMessage());
        }
    }//GEN-LAST:event_MenuItem_SaveActionPerformed

    private void MenuItem_ProcessReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ProcessReportActionPerformed
        // Get the user's input to pass the classes and methods
        String location = CityComboBox.getSelectedItem().toString();
        String name = txtTechnicianName.getText();
        String cost = txtRepairCost.getText();
        String rate = txtTechnicianRate.getText();
        
        String output = "";
        
        // Create the object of Data class to test the user input validation
        Data data = new Data (location, name, Double.parseDouble(cost), Double.parseDouble(rate));
        
        //To access the 2 methods to calcualte the totals and validations we need to make instance of the class
        Technician tech = new Technician();
        
        // ValidateData method holding values of Technician Data
        if(tech.ValidateData(data) == true)
        {
            double pay = tech.CalculatePay(cost, rate);
            
            output = "TECHNICIAN LOCATION: " + data.Technician_Location + "\n"
            + "TECHNICIAN NAME: " + data.Technician_Name + "\n"
            + "REPAIR COST: R" + data.Repair_Cost + "\n"
            + "TECHNICIAN RATE: " + data.Technician_Rate + "%" + "\n"
            + "CALCULATED PAY: R" + String.format("%.2f", pay);
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid input! Check your entries.");
        }
        
        txtFieldReport.setText(output);
    }//GEN-LAST:event_MenuItem_ProcessReportActionPerformed

    private void CityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityComboBoxActionPerformed

    private void CityComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CityComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CityComboBoxItemStateChanged

    private void MenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ExitActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to exit?",
        "Exit Confirmation",
        JOptionPane.YES_NO_OPTION
    );

    if (confirm == JOptionPane.YES_OPTION) 
    {
        System.exit(0);
    }

    }//GEN-LAST:event_MenuItem_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TechnicianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TechnicianForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CityComboBox;
    private javax.swing.JLabel CostLbl;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JMenuItem MenuItem_Clear;
    private javax.swing.JMenuItem MenuItem_Exit;
    private javax.swing.JMenuItem MenuItem_ProcessReport;
    private javax.swing.JMenuItem MenuItem_Save;
    private javax.swing.JLabel ReportLbl;
    private javax.swing.JLabel TechnicianNameLbl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel technicianRateLbl;
    private javax.swing.JTextArea txtFieldReport;
    private javax.swing.JTextField txtRepairCost;
    private javax.swing.JTextField txtTechnicianName;
    private javax.swing.JTextField txtTechnicianRate;
    // End of variables declaration//GEN-END:variables
}
