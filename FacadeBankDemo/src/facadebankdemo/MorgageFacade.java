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
public class MorgageFacade {
    
    Customer cr;
    Loan ln;
    Credit ct;
    Bank bk;
    
    
    public  MorgageFacade(Loan ln, Credit ct,Bank bk, Customer cr){
        this.cr = cr;
        this.ln = ln;
        this.ct = ct;
        this.bk = bk;
    }
    
    public boolean isEligaible(Customer cr, int Loanamount){
         int eligibleScore = 0;
        if(bk.hasSufficientSaving(cr, Loanamount)){
            eligibleScore = eligibleScore + 2;
            System.out.println("Has sufficient Saving");
        }
        else{
            eligibleScore = eligibleScore - 1;
            System.out.println("Doesn't have sufficient saving"); 
        }
       if (ct.HasBadCredit(cr)){
            eligibleScore = eligibleScore - 1;
            System.out.println("Has Bad Credit"); 
       }else {
            eligibleScore = eligibleScore + 1;
            System.out.println("credit is good");
        }

       if (ln.HasBadLoan(cr)){
            eligibleScore = eligibleScore - 1;
            System.out.println("Has bad loan");
        }
        else{
            eligibleScore = eligibleScore + 1;
            System.out.println("No bad loan");
        }
       if (eligibleScore >= 2)
        return true;
       else
        return false;
}
    

    
}
