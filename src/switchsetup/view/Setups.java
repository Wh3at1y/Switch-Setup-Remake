/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchsetup.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author samuel.montoya
 */
public interface Setups {
    
    static void setupLogo(JLabel pic)
	{
			ImageIcon backgroundImage = new ImageIcon(MainMenu.class.getResource("/resources/netLogo.png"));
			Image image = backgroundImage.getImage();
			image = image.getScaledInstance(450, 175, java.awt.Image.SCALE_SMOOTH);
			backgroundImage = new ImageIcon(image);
			pic.setIcon(backgroundImage);
	}
    
    static void setupMenuButton(JButton button, String pictureLoc, Class componentClass)
	{
                button.setBorderPainted(false);
                button.setFocusPainted(false);
                button.setFocusable(true);
                button.setContentAreaFilled(false);
		ImageIcon backgroundImage = new ImageIcon(componentClass.getResource(pictureLoc));
		Image image = backgroundImage.getImage();
		image = image.getScaledInstance(600, 80, java.awt.Image.SCALE_SMOOTH);
		backgroundImage = new ImageIcon(image);
		button.setIcon(backgroundImage);
		
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Neue", Font.BOLD, 17));
                button.setForeground(Color.DARK_GRAY);
	}
    
    static void setupSmallButton(JButton button, String pictureLoc, Class componentClass)
	{
            button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Neue", Font.BOLD, 14));
		button.setForeground(Color.DARK_GRAY);
                button.setBorderPainted(false);
                button.setFocusPainted(false);
                button.setFocusable(true);
                button.setContentAreaFilled(false);
		ImageIcon backgroundImage = new ImageIcon(componentClass.getResource(pictureLoc));
		Image image = backgroundImage.getImage();
		image = image.getScaledInstance(130, 60, java.awt.Image.SCALE_FAST);
		backgroundImage = new ImageIcon(image);
		button.setIcon(backgroundImage);
	}
}
