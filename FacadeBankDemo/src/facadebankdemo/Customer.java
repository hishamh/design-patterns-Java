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
public class Customer {
    
    int SavingAmount;
    boolean HasBadLoan;
    boolean HasBadCredit;
    String name;
    
    public Customer(String name,int SavingAmount,boolean HasBadLoan,boolean HasBadCredit){
        this.name = name;
        this.HasBadLoan = HasBadLoan;
        this.HasBadCredit = HasBadCredit;
        this.SavingAmount = SavingAmount;
    }
    
    public String Name(){
        return name;
    }
    
    public boolean CHasBadLoan(){
          if(HasBadLoan){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean CHasBadCredit(){
        if(HasBadCredit){
            return true;
        }else{
            return false;
        }
    }
    
    public int CSavingAmount(){
        
        return SavingAmount;
        
    }
    
    
    
}
