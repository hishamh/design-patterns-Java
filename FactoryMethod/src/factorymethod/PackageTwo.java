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
public class PackageTwo extends Package{

    @Override
    public void move() {
        System.out.println("movie: Incredible");
    }

    @Override
    public void snak() {
       System.out.println("sank: chips");
    }

    @Override
    public void Drink() {
        System.out.println("Drink: sprite");
    }
    
}