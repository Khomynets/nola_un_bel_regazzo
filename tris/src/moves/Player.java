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
public class Player {
    String name;
    char marker;

    public Player(String name, char marker) {
        this.name = name;
        this.marker = marker;
    }

    public String getName() {
        return name;
    }

    public char getMarker() {
        return marker;
    }

    public void setMarker(char marker) {
        this.marker = marker;
    }
    
}
