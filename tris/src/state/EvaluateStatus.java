/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import moves.*;

/**
 *
 * @author khomynets_20149
 */
public class EvaluateStatus {
    int state;

    public EvaluateStatus() {
        this.state=0;
    }
    
    /**
     * 
     * @param board
     * @return 
     * 0:  partita in corso
     * 1:  tris fatto
     * 2:  parità
     */
    public int getValue(MyBoard board){
        char[] ch= new char[9];
        int c;
        for(c=0;c<9;c++){
            ch[c]=board.getBox(c);
        }
        this.state=0;
        for(c=0;c<9;c=c+3){
            if((ch[c]==ch[c+1])&(ch[c]==ch[c+2])&(ch[c]!=' '))    this.state=1;
        }
        for(c=0;c<3;c++){
            if((ch[c]==ch[c+3])&(ch[c]==ch[c+6])&(ch[c]!=' '))    this.state=1;
        }
        if((ch[0]==ch[4])&(ch[0]==ch[8])&(ch[0]!=' '))   this.state=1;
        
        if((ch[2]==ch[4])&(ch[2]==ch[6])&(ch[2]!=' '))   this.state=1;

        if(board.isFull()==true)  this.state=2;
        
        return this.state;
    }
    public String getMessage(){
        String msg = null;
        if(state==0) msg="game not finiched";
        if(state==1) msg="we have a winner";
        if(state==2) msg="draw";
        return msg;
    }
}
