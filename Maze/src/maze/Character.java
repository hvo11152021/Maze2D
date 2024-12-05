/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Hy
 */
public class Character {
    private int x, y, blockX, blockY;
    private Image character;
    
    public Character(){
        ImageIcon img = new ImageIcon("");
        character = img.getImage();
        
        x = 32;
        y = 32;
        
        blockX = 1;
        blockY = 1;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getBlockX(){
        return blockX;
    }
    
    public int getBlockY(){
        return blockY;
    }
    
    public Image getCharacter(){
        return character;
    }
    
    public void move(int dx, int dy, int bx, int by){
    
    }
}
