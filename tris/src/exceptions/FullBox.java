/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author olga
 */
public class FullBox extends TrisException{
    String msg;
    @Override
    public String getMessage(){
        msg="Full Box";
        return this.msg;
    }
}
