/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchsetup.view;

import static switchsetup.view.Setups.*;

/**
 *
 * @author samuel.montoya
 */
public class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setupMenuButton(irfButton, "/resources/netButtonMenu.png", this.getClass());
        setupMenuButton(linkButton, "/resources/netButtonMenu.png", this.getClass());
        setupMenuButton(snmpButton, "/resources/netButtonMenu.png", this.getClass());
        
        setupSmallButton(exitButton, "/resources/netButtonSmall.png", this.getClass());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        irfButton = new javax.swing.JButton();
        linkButton = new javax.swing.JButton();
        snmpButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/netLogo.png"))); // NOI18N
        logoLabel.setToolTipText("");

        irfButton.setText("IRF SETUP");
        irfButton.setBounds(new java.awt.Rectangle(300, 200, 97, 29));
        irfButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        irfButton.setPreferredSize(new java.awt.Dimension(400, 180));

        linkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkButton.setLabel("LINK AGGREGATION");

        snmpButton.setText("SNMP SETUP");
        snmpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        exitButton.setText("EXIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(logoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(irfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(snmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoLabel)
                .addGap(18, 18, 18)
                .addComponent(irfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(snmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton irfButton;
    private javax.swing.JButton linkButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton snmpButton;
    // End of variables declaration//GEN-END:variables
}
