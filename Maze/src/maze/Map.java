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
//    private Scanner m;
    private char[][] map;
    private String Map[] = new String[14];
    private Image floor;
    private Image wall;
    
    public Map(){
        // assign new vairables with sprites in resources
        ImageIcon image = new ImageIcon("C://Users//Hy//Documents//GitHub//Maze2D//Maze//resources//floor.png");
        floor = image.getImage();
        image = new ImageIcon("C://Users//Hy//Documents//GitHub//Maze2D//Maze//resources//wall.png");
        wall = image.getImage();
        
        openFile();
        readFile();
        closeFile();
    }
    
    public Image makeFloor() {
        return floor;
    }
    
    public Image makeWall() {
        return wall;
    }
    
    public char[][] getMap() {
        return map;
    }
    
    public String getMap(int x, int y){
        String index = Map[y].substring(x, x + 1);
        return index;
    }

    private void openFile() {
        try (Scanner scanner = new Scanner(new File("C://Users//Hy//Documents//GitHub//Maze2D//Maze//resources//Map.txt"))){
            map = new char[14][14];
            int y = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                map[y] = line.toCharArray();
                y++;
            }
        } catch(Exception e){
            System.out.println("Error reading the map file: " + e.getMessage());
        }
    }

    private void readFile() {
        
    }

    private void closeFile() {
        
    }
    
    
}
