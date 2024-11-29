/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maze;

import javax.swing.JFrame;

/**
 *
 * @author Hy
 */
public class Maze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Maze();
    }
    
    public Maze(){
        JFrame frame = new JFrame();
        frame.setTitle("Maze Game");
        frame.setSize(900,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
