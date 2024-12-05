/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Hy
 */
public class Config extends JPanel implements ActionListener {
    private Timer timer;
    private Map m;
    private Character c;
    private char[][] map;
    
    public Config(){
        m = new Map();
        c = new Character();
        
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
        
        g.drawImage(c.getCharacter(), c.getX(), c.getY(), null);
    }
    
    public class Al extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            int keyletter = e.getKeyCode();
            
            if (keyletter == KeyEvent.VK_W){
                c.move(0, -32, 0, -1);
            }
            
            if (keyletter == KeyEvent.VK_S){
                c.move(-32, 0, -1, 0);
            }
            
            if (keyletter == KeyEvent.VK_A){
                c.move(32, 0, 1, 0);
            }
            
            if (keyletter == KeyEvent.VK_D){
                c.move(0, 32, 0, 1);
            }
        }
        
        public void keyReleased(KeyEvent e){
            
        }
        
        public void keyTyped(KeyEvent e){
            
        }
    }
}
