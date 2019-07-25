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
public class FacadeBankDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Customer cust = new Customer("John Bruce", 2500, false, false);
        Bank bk = new Bank();
        Loan ln = new Loan();
        Credit ct = new Credit();
        MorgageFacade Mortgage = new MorgageFacade(ln, ct, bk, cust);

        boolean eligable = Mortgage.isEligaible(cust, 2600);
        if (eligable)
            System.out.println("Mortgage is approved");
        else
            System.out.println("Mortgage is not approved");
            System.out.println("");

        
        
        
    }
    
}
