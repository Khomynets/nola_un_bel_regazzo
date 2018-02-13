/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moves;

/**
 *
 * @author olga
 */
public class MyBoard {
    char[] boxes;

    public MyBoard() {
        boxes=new char[9];
        for(int c=0;c<9;c++){
            boxes[c]=' ';
        }
    }
    
    public char getBox(int n){
        return this.boxes[n];
    }
    
    public void applyMove(Move toApply){       
        this.boxes[toApply.box]=toApply.player.marker;
    }
    
    public boolean isFull(){
        boolean b = false;
        int c;
        for(c=0;c<9;c++){
            if((boxes[c]!='X')|(boxes[c]!='O')) {
                b=false;
                c=10;
            }else{
                b=true;
            }
        }
        return b;
    }
}
