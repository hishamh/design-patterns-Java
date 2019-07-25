/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Hisham Hussein
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factory myFactory = new Factory();
        
        Package P1 = myFactory.getPackage(1);
        Package P2 = myFactory.getPackage(2);
    }
    
}
