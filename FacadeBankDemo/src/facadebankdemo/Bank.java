/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadebankdemo;

/**
 *
 * @author Gaming Pc
 */
public class Bank {
    public Bank(){}
    
    
    
    public boolean hasSufficientSaving(Customer C, int amount){
        
        if(C.SavingAmount > amount){
            return true;
        }else{
            return false;
        }
        
    }
    
}
