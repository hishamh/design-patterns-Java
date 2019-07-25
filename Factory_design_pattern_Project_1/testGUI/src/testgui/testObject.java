/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

import java.io.IOException;

/**
 *
 * @author Hisham Hussein
 */
public class testObject {
    
    public static void main(String[] args) throws IOException{
        Factory factory;  //creating factory that will test application
        fileReadingOnly listName = new fileReadingOnly(); //calling class that reades file
        
        listName.readFile(); //reading file
        for(int i = 0; i<listName.sfotwareNameList.size();i++){   //loop through the list of word application to test
             System.out.println("");
            System.out.println(listName.sfotwareNameList.get(i));
            factory = Factory.getFactory(listName.sfotwareNameList.get(i).toString());  //send the name of the current test
           
            if(factory == null){
                System.out.println("Testing "+ listName.sfotwareNameList.get(i)+" was canceled");
            }else{
                TestGUIElements test00 = factory.getElements();
                test00.panel();
                test00.buttons();
                test00.textBox();
            }  
        }
    }
    
    
    
    
    
}
