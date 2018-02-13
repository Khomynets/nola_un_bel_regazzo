/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import exceptions.*;
import moves.Move;
import moves.MyBoard;
import moves.Player;
import state.EvaluateStatus;

/**
 *
 * @author kate
 */
public class Logic {
    Player[] Players=new Player[2];
    MyBoard board;
    int currentPlayer;

    public Logic(int currentPlayer,Player[] p,MyBoard board) {
        this.currentPlayer = currentPlayer;
        this.Players=p;
        this.board=board;
    }

    public Player getCurrentPlayer() {
        return Players[currentPlayer];
    }
    public void applaiMoves(Move toApply) throws FullBox, OutOfBoard{
        char n;
        int c;
        FullBox FullBoxx = new FullBox();
        OutOfBoard OutOfBoar=new OutOfBoard();
        c=toApply.getBox();
        n=board.getBox(c);
        if(n!=' ') throw FullBoxx;  
        if(c>8) throw OutOfBoar;
        board.applyMove(toApply);
    }
    public void newGame(){
        board.applyMove(null);
    }
    /*  public GameStatus getStatus(){
    
    }*/
    public void nextPlayer(){
        if(currentPlayer==0) currentPlayer=1;
        else currentPlayer=0;
    }

}