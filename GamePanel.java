/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.snakeproject;

/**
 *
 * @author abhay
 */
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GamePanel extends JPanel implements ActionListener{
    // initialize the starting values
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int  bodyparts = 6;   // initial size of snake
    int applesEaten = 0;  // no of apples comsumed
    int appleX;           // coordinates of apple decided randomly
    int appleY;
    // R -> right in initial direction
    char direction = 'R';
    boolean running = false;
    Timer timer ;
    Random random;


    
GamePanel()
{
     random = new Random();  // initialize randomization
     // set prefered size of the game window
     this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
     // component of Jpanel sets background
     this.setBackground(Color.BLACK);
     this.setFocusable(true);
     this.addKeyListener(new MyKeyAdapter());
     startGame();
}
public void startGame()
{
    newApple();
    running = true;
    timer = new Timer(DELAY,this);  // set the speed of the game
    timer.start();
}
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    draw(g);

}
public void draw(Graphics g)
{
   for(int i = 0 ; i < SCREEN_HEIGHT/UNIT_SIZE  ; i++)
   {
    g.drawLine(i*UNIT_SIZE,0 ,i*UNIT_SIZE ,  SCREEN_HEIGHT);
    g.drawLine(0,i*UNIT_SIZE,SCREEN_WIDTH,i*UNIT_SIZE);
   }
}
public void newApple()
{

}
public void move()
{
    
}
public void checkApple()
{

}
public void checkCollisons()
{

}
public void gameOver(Graphics g)
{

}
public void actionPerformed(ActionEvent e)
{

}
public class MyKeyAdapter extends KeyAdapter
{
    public void keyPressed(KeyEvent e)
    {
        
    }
}


    public static void main (String args[]){
        
}
}
