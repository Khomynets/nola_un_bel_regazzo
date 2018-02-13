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
public class Move {
    int box;
    Player player;

    public Move(int box, Player player) {
        this.box = box;
        this.player = player;
    }

    public int getBox() {
        return box;
    }

    public Player getPlayer() {
        return player;
    }
    
}
