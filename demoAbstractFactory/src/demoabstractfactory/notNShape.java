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
public class notNShape extends baseFactory{

    @Override
    shape getShape(String factoryName) {
        
        
        if(factoryName =="S"){
            return new roundSquar();
        }else if (factoryName == "Tri"){
            return new roundTri();
        }
        return null;
        
        
    }
    
}
