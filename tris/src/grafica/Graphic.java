/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.HeadlessException;
import java.io.IOException;
import moves.*;
import state.EvaluateStatus;

/**
 *
 * @author khomynets_20149
 */
public class Graphic{
    
    
    public Graphic() throws HeadlessException {
        
    }
    
    public Player[] readPlayer() throws IOException {
        MyConsole read= new MyConsole();
        String s[]=new String[2];
        Player players[]=new Player[2];
        System.out.print("Inserisci il nome dei primo giocatore ");
        s[0]=read.ReaderString();
        players[0]= new Player (s[0],'X');
        System.out.print("Inserisci il nome dei secondo giocatore ");
        s[1]=read.ReaderString();
        players[1]= new Player (s[1],'O');    
        return players;
        
    }
    public int startGame(Player[] players){        
        MyConsole read=new MyConsole();
        int n = 0;
        System.out.println("°°°°°°°°°°°°°°°°°");
        System.out.println("°     START     °");
        System.out.println("°°°°°°°°°°°°°°°°°");
        
        boolean ask=true;
        do{
            try {
                System.out.println("Who starts?");
                n=read.ReaderInt();
                ask=false;
                if(n>1) ask=true;
                
            } catch (IOException | NumberFormatException ex) {
                System.out.println("error");
            }  
        }while(ask);
        System.out.print(players[n].getName());
        System.out.println(" starts");
        return n;
    }
    
    public void printBoard(MyBoard board){        
        int r;
        for(r=0;r<9;r+=3){
            System.out.print(board.getBox(r));
            System.out.print("  I ");
            System.out.print(board.getBox(r+1));
            System.out.print(" I ");
            System.out.println(board.getBox(r+2));
            if(r<5) System.out.println("---I---I---");
        }
    }
    public Move readMove(Player currPlayer){
        MyConsole read=new MyConsole();
        int n=0;
        Move m;
        boolean ask=true;
        do{
            try{
                System.out.print("Chose the box ");
                n=read.ReaderInt();
                
                ask=false;
                if(n>9) ask=true;
            }catch(IOException | NumberFormatException ex){
                System.out.println("Error");
            }
        }while(ask);
        m=new Move(n,currPlayer);       
        return m;       
    }
    public void printStatus (EvaluateStatus state){
        System.out.println(state.getMessage());
    }
}
