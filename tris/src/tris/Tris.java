/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tris;

import exceptions.FullBox;
import exceptions.OutOfBoard;
import moves.*;
import grafica.*;
import java.io.IOException;
import logic.Logic;
import state.EvaluateStatus;
/**
 *
 * @author olga
 */
public class Tris {
    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws exceptions.FullBox
     * @throws exceptions.OutOfBoard
     */
    public static void main(String[] args) throws Exception {
        GUI g;
        g = new GUI();
        Graphic gf = new Graphic();
        MyBoard board=new MyBoard();
        Player players[];
        players=gf.readPlayer();
        Logic l=new Logic(0,players,board);
        g.ActionButton(l,board);
        gf.printBoard(board);
        if(board.isFull()) System.out.println("vubshcdnjvdjiivnikas");
        
//        Player players[];
//        players = new Player[2];
//        Move m;
//        int next = 0;
//        boolean ask=true;
//        int start;
//        Logic l;
//        MyBoard board=new MyBoard();
//        g.printBoard(board);
//        EvaluateStatus e=new EvaluateStatus();
//        
//        players=g.readPlayer();
//        
//        g.printBoard(board);
//        
//        start=g.startGame(players);
//        
//        l=new Logic(start,players,board);
//        g.printBoard(board);
//        do{    
//            next++;
//            do{
//                try{
//                    l.applaiMoves(g.readMove(players[start]));
//                    ask=false;
//                }catch(OutOfBoard | FullBox ex){
//                    String msg = ex.toString();
//                    System.out.println(msg);
//            }
//            }while(ask);
//            g.printBoard(board);
//            g.printStatus(e);
//            start=l.nextPlayer();
//        }while((e.getValue(board)==0)|(next==8));
        
    }
    
}
