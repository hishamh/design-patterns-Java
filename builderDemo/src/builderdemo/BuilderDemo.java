/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdemo;

/**
 *
 * @author Hisham Hussein
 */
public class BuilderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        engineerMove mydriector = new engineerMove();
        
        builderAb move1 = new moveOne();
        builderAb move2 = new moveTwo();
        
        mydriector.engineerMove(move1);
       product completeMoveOne = move1.getProduct();
       completeMoveOne.show();
        
       mydriector.engineerMove(move2);
       product completeMoveTwo = move2.getProduct();
       completeMoveTwo.show();
        
    }
    
}
