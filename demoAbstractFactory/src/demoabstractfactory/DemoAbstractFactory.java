/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoabstractfactory;

/**
 *
 * @author Gaming Pc
 */
public class DemoAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        baseFactory kindShape = Factory.getFactory("S");
        
        shape s1 = kindShape.getShape("Sqr");
        s1.draw();
        
        
        
    }
    
}
