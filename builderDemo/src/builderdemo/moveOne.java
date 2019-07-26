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
public class moveOne extends builderAb {
    
    product P = new product();
    @Override
    public void getMove() {
        P.move = "Spider Man";
    }

    @Override
    public void getSank() {
       P.sank = "Cookies";
    }

    @Override
    public void getDrink() {
        P.drink = "Pepsi";
    }
       @Override
    public product getProduct() {
        return P;
    }
}
