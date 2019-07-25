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
public class Factory {
    
    public static baseFactory getFactory(String rounded){
        
        if(rounded == "R"){
            return new notNShape();
        }else if(rounded == "S"){
            return new shapeNormal();
        }
        
        
        return null;
    }
    
    
}
