/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Hy
 */
public class Config extends JPanel {
    
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.green);
        g.fillRect(0, 0, 32, 32);
    }
}
