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
public class Factory {
    
    public Package getPackage(int num){
        
        Package newPackage = null;
        
        if(num ==1){
            newPackage = new PackageOne();
        }else  if(num ==2){
            newPackage = new PackageTwo();
        }
        
        newPackage.move();
        newPackage.snak();
        newPackage.Drink();
        return newPackage;
    }
    
}
