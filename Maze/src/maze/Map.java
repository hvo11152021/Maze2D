/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze;

import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;

/**
 *
 * @author Hy
 */
public class Map {
    private Scanner m;
    private String Map[] = new String[14];
    private Image floor;
    private Image wall;
    
    public Map(){
        // assign new vairables with sprites in resources
        ImageIcon image = new ImageIcon("//");
        floor = image.getImage();
        image = new ImageIcon("//");
        wall = image.getImage();
        
        openFile();
        readFile();
        closeFile();
    }
    
    public String getMap(int x, int y){
        return Map[y].substring(x, x + 1);
    }

    private void openFile() {
        try {
            m = new Scanner(new File("//"));
        } catch(Exception e){
            System.out.println(e);
        }
    }

    private void readFile() {
        
    }

    private void closeFile() {
        
    }
    
    
}
