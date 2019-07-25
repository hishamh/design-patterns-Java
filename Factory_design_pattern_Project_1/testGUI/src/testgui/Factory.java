/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

import java.util.Scanner;

/**
 *
 * @author Hisham Hussein
 *  This class will use a singleton design pattern
 */
public abstract class Factory {
    //This is a word testing of type Factory
    private static Factory word00=null;
    private static Factory word90=null;
    private static Factory word10=null;
    private static Factory word18=null;
    private static int word00C=0;
    private static int word90C=0;
    private static int word10C=0;
    private static int word18C=0;
    
    public abstract TestGUIElements getElements();  //implement methos for other classes to return new word class
    
    
    //getFactory Factory return whihc also implemnts the singleton design pattern
    public static Factory getFactory(String softwareName){
        Scanner readers = new Scanner(System.in);  // Reading from System.in
        
        if(softwareName == null){ //if the entered software is null 
         return null;  
        }
        
        Factory factory = null; //current factory is null
       
        if(softwareName.contains("Word00")){// if word is contain Word00 then the program will create new word00Factory and assignet it to factory of type Factory
            factory.word00C++;
            if(word00 == null || factory.word00C <= 2){
                word00 = new word00Factory();//create new wordF00Factory
                factory = word00;
            }else if(factory.word00C > 2){
                
                System.out.print("Warning software name "+softwareName+ " wants to run again(Y=Yes or N=No): "); //if there is dublicated and warning the user of dublicated test
                String accepts = readers.next();
                
                    if(accepts.contains("Y")){
                         word00 = null; //reassinge it to null again if the user wants to test it again
                         word00 = new word00Factory();
                         factory = word00;
                    }
                
            }
            
        }else if(softwareName.contains("Word90")){// if word is contain Word00 then the program will create new word00Factory and assignet it to factory of type Factory
                factory.word90C++;
            if(word90 == null || factory.word90C <= 2){
                word90 = new word90Factory();//create new wordF90Factory
                factory = word90;
            }else if(factory.word90C > 2){
                
                
                System.out.print("Warning software name "+softwareName+ " wants to run again(Y=Yes or N=No): ");//if there is dublicated and warning the user of dublicated test
                String accepts = readers.next();
                    
                    if(accepts.contains("Y")){
                         word90 = null;
                         word90 = new word90Factory();//create new wordF90Factory
                         factory = word90;
                    }
                
            }
            
        }else if(softwareName.contains("Word10")){// if word is contain Word00 then the program will create new word00Factory and assignet it to factory of type Factory
            factory.word10C++;
            if(word10 == null || factory.word10C <= 2){
                word10 = new word10Factory();//create new wordF10Factory
                factory = word10;
            }else if(factory.word10C > 2){
                
                System.out.print("Warning software name "+softwareName+ " wants to run again(Y=Yes or N=No): ");//if there is dublicated and warning the user of dublicated test
                String accepts = readers.next();
                
                    if(accepts.contains("Y")){
                         word10 = null;//Reassigne it null again if the user wants to create another test
                         word10 = new word10Factory();//create new wordF10Factory
                         factory = word10;
                    }
                
            }
            
        }else if(softwareName.contains("Word18")){// if word is contain Word00 then the program will create new word00Factory and assignet it to factory of type Factory
            factory.word18C++;
            if(word18 == null || factory.word18C <= 2){
                word18 = new word18Factory();
                factory = word18;
            }else if(factory.word18C > 2){
                
                System.out.print("Warning software name "+softwareName+ " wants to run again(Y=Yes or N=No): ");//if there is dublicated and warning the user of dublicated test
                String accepts = readers.next();
                
                    if(accepts.contains("Y")){
                         word18 = null; //Reassigne it null again if the user wants to create another test
                         word18 = new word18Factory(); //create new wordF18Factory
                         factory = word18;
                    }
                
            }
            
        }
         
        return factory; //return factory of test word
    }
    
    
    
}
