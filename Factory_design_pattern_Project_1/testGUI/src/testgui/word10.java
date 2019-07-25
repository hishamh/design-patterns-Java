/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

/**
 *
 * @author Gaming Pc
 */
public class word10 implements TestGUIElements {
    
    //This function will only implements the interace of TestGUIEleemnts that will be showing up during test
    @Override
    public void panel() {
        System.out.print("Panel word10, ");
    }

    @Override
    public void buttons() {
        System.out.print("Button word10, "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void textBox() {
        System.out.print("Textbox word10\n"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
