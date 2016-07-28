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
        
        setupLogo(logoLabel);
        setupMenuButton(irfButton, "/resources/netButtonMenu.png", this.getClass());
        setupMenuButton(linkButton, "/resources/netButtonMenu.png", this.getClass());
        setupMenuButton(snmpButton, "/resources/netButtonMenu.png", this.getClass());
        
        setupSmallButton(exitButton, "/resources/netButtonSmall.png", this.getClass());
        setupSmallButton(changelogButton, "/resources/netButtonSmall.png", this.getClass());
        setupSmallButton(aboutButton, "/resources/netButtonSmall.png", this.getClass());
        setupSmallButton(helpButton, "/resources/netButtonSmall.png", this.getClass());
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
        versionLabel = new javax.swing.JLabel();
        changelogButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/netLogo.png"))); // NOI18N

        irfButton.setText("IRF SETUP");

        linkButton.setText("LINK AGGREGATION");

        snmpButton.setText("SNMP SETUP");

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/netButtonSmall.png"))); // NOI18N
        exitButton.setText("EXIT");

        versionLabel.setText("V: 2.1 [beta 4ever]");

        changelogButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/netButtonSmall.png"))); // NOI18N
        changelogButton.setText("CHANGELOG");

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/netButtonSmall.png"))); // NOI18N
        aboutButton.setText("ABOUT");

        helpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/netButtonSmall.png"))); // NOI18N
        helpButton.setText("ASSISTANCE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(irfButton)
                    .addComponent(linkButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(snmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changelogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(aboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(logoLabel)
                .addGap(140, 140, 140)
                .addComponent(versionLabel))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(versionLabel))
                .addGap(24, 24, 24)
                .addComponent(irfButton)
                .addGap(18, 18, 18)
                .addComponent(linkButton)
                .addGap(18, 18, 18)
                .addComponent(snmpButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(changelogButton)
                    .addComponent(aboutButton)
                    .addComponent(helpButton)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton changelogButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JButton irfButton;
    private javax.swing.JButton linkButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton snmpButton;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables
}
