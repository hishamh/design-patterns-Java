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
public class shapeNormal extends baseFactory{

    @Override
    shape getShape(String factoryName) {
       
        if(factoryName =="Sqr"){
            return new squar();
        }else if (factoryName == "Tri"){
            return new tri();
        }
        return null;
    }
   
   
}
