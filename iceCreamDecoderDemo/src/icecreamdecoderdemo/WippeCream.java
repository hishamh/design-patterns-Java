/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icecreamdecoderdemo;

/**
 *
 * @author Gaming Pc
 */
public class WippeCream extends decodarBeverage {

    Beverage beverage;
    public WippeCream(Beverage beverage) {
      this.beverage = beverage;  
    }
    @Override
    public String getDescription(){
        return   beverage.getDescription()+ ",with Wippe Cream";
    }
    @Override
    public double cost(){
        return beverage.cost() + .30;
    }
}
