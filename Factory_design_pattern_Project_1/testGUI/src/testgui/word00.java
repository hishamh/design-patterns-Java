/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

/**
 *
 * @author Hisham Hussein
 */
public class word00 implements TestGUIElements {

    //this class will only implemnt the methos in the interaface
    @Override
    public void panel() {
        System.out.print("Panel word00, ");
    }

    @Override
    public void buttons() {
        System.out.print("Button word00, "); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void textBox() {
        System.out.print("Textbox word00\n"); //To change body of generated methods, choose Tools | Templates.
    }
    



}
