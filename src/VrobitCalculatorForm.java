/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author midon7419
 */
public class VrobitCalculatorForm extends javax.swing.JFrame {

    /**
     * Creates new form VrobitCalculatorForm
     */
    public VrobitCalculatorForm() {
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

        jPanel1 = new javax.swing.JPanel();
        titlelbl = new javax.swing.JLabel();
        inputVrobitslbl = new javax.swing.JLabel();
        inputlbl = new javax.swing.JTextField();
        inputVrobitslbl1 = new javax.swing.JLabel();
        enterbtn = new javax.swing.JButton();
        drobzitlbl = new javax.swing.JLabel();
        clickwicklbl = new javax.swing.JLabel();
        gazoontightlbl = new javax.swing.JLabel();
        frazointlbl = new javax.swing.JLabel();
        blointoitlbl = new javax.swing.JLabel();
        vrobitlbl = new javax.swing.JLabel();
        drobzitoutputlbl = new javax.swing.JLabel();
        clickwickoutputlbl = new javax.swing.JLabel();
        gazoontightoutputlbl = new javax.swing.JLabel();
        frazointoutputlbl = new javax.swing.JLabel();
        blointoitoutputlbl = new javax.swing.JLabel();
        vrobitoutputlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlelbl.setFont(new java.awt.Font("Shinobi BB", 0, 24)); // NOI18N
        titlelbl.setForeground(new java.awt.Color(102, 0, 102));
        titlelbl.setText("Vrobit Calculator");

        inputVrobitslbl.setFont(new java.awt.Font("Shinobi BB", 0, 18)); // NOI18N
        inputVrobitslbl.setText("Your coins returned:");

        inputlbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputlblActionPerformed(evt);
            }
        });

        inputVrobitslbl1.setFont(new java.awt.Font("Shinobi BB", 0, 18)); // NOI18N
        inputVrobitslbl1.setText("Input how many vrobits you want to exchange:");

        enterbtn.setText("Enter");
        enterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterbtnActionPerformed(evt);
            }
        });

        drobzitlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        drobzitlbl.setText("Drobzits:");

        clickwicklbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        clickwicklbl.setText("Clickwicks:");

        gazoontightlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        gazoontightlbl.setText("Gazoontights:");

        frazointlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        frazointlbl.setText("Frazoints:");

        blointoitlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        blointoitlbl.setText("Blointoits:");

        vrobitlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        vrobitlbl.setText("Vrobits:");

        drobzitoutputlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        drobzitoutputlbl.setText("-----");

        clickwickoutputlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        clickwickoutputlbl.setText("-----");

        gazoontightoutputlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        gazoontightoutputlbl.setText("-----");

        frazointoutputlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        frazointoutputlbl.setText("-----");

        blointoitoutputlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        blointoitoutputlbl.setText("-----");

        vrobitoutputlbl.setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        vrobitoutputlbl.setText("-----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(inputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(enterbtn)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titlelbl)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputVrobitslbl)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(drobzitoutputlbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frazointlbl))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(gazoontightoutputlbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vrobitlbl))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(clickwickoutputlbl)
                                    .addGap(50, 50, 50)
                                    .addComponent(blointoitlbl))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(frazointoutputlbl)
                            .addComponent(blointoitoutputlbl)
                            .addComponent(vrobitoutputlbl))
                        .addGap(43, 43, 43))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gazoontightlbl)
                    .addComponent(clickwicklbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(drobzitlbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputVrobitslbl1)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlelbl)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputlbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterbtn))
                .addGap(18, 18, 18)
                .addComponent(inputVrobitslbl)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drobzitlbl)
                    .addComponent(frazointlbl)
                    .addComponent(drobzitoutputlbl)
                    .addComponent(frazointoutputlbl))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clickwicklbl)
                    .addComponent(blointoitlbl)
                    .addComponent(clickwickoutputlbl)
                    .addComponent(blointoitoutputlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gazoontightlbl)
                    .addComponent(vrobitlbl)
                    .addComponent(gazoontightoutputlbl)
                    .addComponent(vrobitoutputlbl))
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(inputVrobitslbl1)
                    .addContainerGap(230, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputlblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputlblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputlblActionPerformed

    private void enterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterbtnActionPerformed
        //Taking inputted value
        try{
        int vrobitsInitial = Integer.parseInt(inputlbl.getText());
        int drobzits, clickwicks, gazoontights, frazoints, blointoits, vrobitsFinal;
        int remainder;
        
        //Initial vrobits -> drobzits
        drobzits = vrobitsInitial / 100000;
        remainder = vrobitsInitial % 100000;
        //Drobzit remainders -> clickwicks
        clickwicks = remainder / 50000;
        remainder = remainder % 50000;
        //Clickwick remainders -> gazoontights
        gazoontights = remainder / 10000;
        remainder = remainder % 10000;
        //Gazoontights -> frazoints
        frazoints = remainder / 1000;
        remainder = remainder % 1000;
        //Frazoints -> blointoits
        blointoits = remainder / 500;
        remainder = remainder % 500;
        //Remainder -> vrobits
        vrobitsFinal = remainder;
        
        //Outputs
        drobzitoutputlbl.setText(String.valueOf(drobzits));
        clickwickoutputlbl.setText(String.valueOf(clickwicks));
        gazoontightoutputlbl.setText(String.valueOf(gazoontights));
        frazointoutputlbl.setText(String.valueOf(frazoints));
        blointoitoutputlbl.setText(String.valueOf(blointoits));
        vrobitoutputlbl.setText(String.valueOf(vrobitsFinal));
        }
        //In case entered value is not an integer
        catch(NumberFormatException nfe){
            System.err.println("You must enter integers");
            System.err.println("Exception: " + nfe);
        }

        
    }//GEN-LAST:event_enterbtnActionPerformed

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
            java.util.logging.Logger.getLogger(VrobitCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VrobitCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VrobitCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VrobitCalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VrobitCalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blointoitlbl;
    private javax.swing.JLabel blointoitoutputlbl;
    private javax.swing.JLabel clickwicklbl;
    private javax.swing.JLabel clickwickoutputlbl;
    private javax.swing.JLabel drobzitlbl;
    private javax.swing.JLabel drobzitoutputlbl;
    private javax.swing.JButton enterbtn;
    private javax.swing.JLabel frazointlbl;
    private javax.swing.JLabel frazointoutputlbl;
    private javax.swing.JLabel gazoontightlbl;
    private javax.swing.JLabel gazoontightoutputlbl;
    private javax.swing.JLabel inputVrobitslbl;
    private javax.swing.JLabel inputVrobitslbl1;
    private javax.swing.JTextField inputlbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel vrobitlbl;
    private javax.swing.JLabel vrobitoutputlbl;
    // End of variables declaration//GEN-END:variables
}
