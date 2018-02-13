/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import logic.Logic;
import moves.MyBoard;

/**
 *
 * @author khomynets_20149
 */
public class GUI extends JFrame{
    
    static final String TRIS="tris";
    JButton button[]= new JButton[9];
    ActionListener l;
    
    public GUI() throws HeadlessException {
        super(TRIS);
        for(int c=0;c<9;c++){
            this.button[c] = new JButton(String.valueOf(c));
            this.add(this.button[c]);
            button[c].setBackground(Color.pink.darker());
            button[c].setBorderPainted(true);
        }
        this.setVisible(true);
        this.setSize(500, 500);
        this.setLayout(new GridLayout(3,3));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void printBoard(MyBoard b){  
        for(int c=0;c<9;c++){
            button[c].setText(String.valueOf(b.getBox(c)));           
        }        
    }
    
    public void ActionButton(Logic lg,MyBoard m){     
        l = new MoveButtonListener(lg,m);
        for( int c=0;c<9;c++){
            button[c].addActionListener(l);
        }
//        if(m.isFull()) this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
