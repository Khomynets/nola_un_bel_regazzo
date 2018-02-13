/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author khomynets_20149
 */
public class MyConsole {

    public MyConsole() {
        
    }
    public String ReaderString() throws IOException{
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);       
        String read;
        read=stdin.readLine();
        return read;
    }
        public int ReaderInt() throws IOException{
        int n;
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);       
        String read;
        read=stdin.readLine();
        n=Integer.parseInt(read);
        return n;
    }
}
