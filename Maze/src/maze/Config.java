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
public class Config extends JPanel implements ActionListener {
    private Timer timer;
    private Map m;
    private char[][] map;
    
    public Config(){
        m = new Map();
        
        timer = new Timer(25, this);
        timer.start();
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        map = m.getMap();
//        g.setColor(Color.green);
//        g.fillRect(0, 0, 32, 32);
        for (int y = 0; y < 14; y++){
            for (int x = 0; x < 14; x++){
                if (map[y][x] == 'f'){
                    g.drawImage(m.makeFloor(), x * 32, y * 32, null);
                }
                if (map[y][x] == 'w'){
                    g.drawImage(m.makeWall(), x * 32, y * 32, null);
                }
            }
        }
    }
}
