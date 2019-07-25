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
public class PackageOne extends Package{

    @Override
    public void move() {
        System.out.println("movie: star war");
    }

    @Override
    public void snak() {
       System.out.println("sank: POPcorn");
    }

    @Override
    public void Drink() {
        System.out.println("Drink: Coke");
    }
    
}
