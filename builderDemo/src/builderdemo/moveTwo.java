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
public class moveTwo extends builderAb {
    
    product P = new product();
    @Override
    public void getMove() {
        P.move = "Asal Aswad";
    }

    @Override
    public void getSank() {
       P.sank = "Nothing";
    }

    @Override
    public void getDrink() {
        P.drink = "cocal";
    }

    @Override
    public product getProduct() {
        return P;
    }
    
}