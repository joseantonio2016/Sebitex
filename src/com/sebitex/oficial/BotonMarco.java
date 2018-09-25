/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebitex.oficial;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author jose
 */
public class BotonMarco extends JButton implements MouseListener {

    private final String iconEntered, iconSalida, alter;

        
    
    public BotonMarco(String imgEntered, String imgSalida, String alter) {
        this.iconEntered = imgEntered;
        this.iconSalida = imgSalida;
        this.alter = alter;
        try {
            super.setIcon(new javax.swing.ImageIcon(
                    getClass().getResource("/res/".concat(this.iconEntered))));
            setBorder(null);
        setBorderPainted(false);
        setContentAreaFilled(false);
        } catch (Exception ex) {
            super.setText(alter);
        }
        
    }

    
    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
       
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\jose\\Pictures\\cerrar1.png"));
        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/20180922_010830.png")));
       
        try {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/".concat(this.iconSalida))));
        } catch (Exception ex) {
            setText(alter);
            System.out.println(ex.getMessage());
        setBorderPainted(true);
        setContentAreaFilled(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
        try {
            setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/".concat(this.iconEntered))));
        } catch (Exception ex) {
            setText(alter);
            System.out.println(ex.getMessage());
        }
    }

    
}
