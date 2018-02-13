/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import logic.Logic;
import moves.Move;
import moves.MyBoard;

/**
 *
 * @author khomynets_20149
 */
public class MoveButtonListener implements ActionListener {
    Logic l;
    MyBoard mb;
    public MoveButtonListener(Logic l,MyBoard mb) {
        this.l=l;
        this.mb=mb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        Move m;
        Graphic g = new Graphic();
        if(!("X".equals(b.getText()) | "O".equals(b.getText()))){
            m=new Move(Integer.parseInt(b.getText()),l.getCurrentPlayer());
            mb.applyMove(m);
            b.setText(String.valueOf(l.getCurrentPlayer().getMarker()));
            b.setBackground(Color.green.darker());
            l.nextPlayer();
            g.printBoard(mb);
        }else{
            System.out.println("Invalid move");
        }
        
    }    
}
