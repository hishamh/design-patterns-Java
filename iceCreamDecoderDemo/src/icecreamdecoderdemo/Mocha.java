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
public class Mocha extends decodarBeverage {
    Beverage beverage;
public Mocha(Beverage beverage)
{
this.beverage = beverage;
//a way to set this instance variable to the object we are wrapping
//Here, we pass the beverage we are wrapping to the decorator's constructor.
}
public String getDescription()
{
return beverage.getDescription() + ",Mocha";
//we want our description to not only include the beverage name, but also
//to include each item decorating the beverage.
//so we first delegate to the object we are decorating to get its description
//then append "Mocha" to that description
}
public double cost()
{
return .20 + beverage.cost();
// We first delegate the call to the object we are decorating, so that it can
//compute the cost; then add the cost of Mocha to that result.
}
}
