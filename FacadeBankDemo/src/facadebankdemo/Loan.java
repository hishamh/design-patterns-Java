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
public class Loan {
    
    
    public Loan(){}
    
    public boolean HasBadLoan(Customer C){
        
        if(C.HasBadLoan & C.SavingAmount < 1000){
            return true;
        }else{
            return false;
        }
        
    }
    
    
}
