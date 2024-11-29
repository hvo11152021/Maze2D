/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maze;

import java.util.Scanner;

/**
 *
 * @author Hy
 */
public class Map {
    private Scanner m;
    private String Map[] = new String[14];
    
    public Map(){
        openFile();
        readFile();
        closeFile();
    }
    
    public String getMap(int x, int y){
        return Map[y].substring(x, x + 1);
    }

    private void openFile() {
        
    }

    private void readFile() {
        
    }

    private void closeFile() {
        
    }
    
    
}
