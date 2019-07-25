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
public class Credit {
    public Credit(){}
    
    
    public boolean HasBadCredit(Customer C){
        
        if(C.HasBadCredit & C.SavingAmount < 1500){
            return true;
        }else{
            return false;
        }
    }
}
