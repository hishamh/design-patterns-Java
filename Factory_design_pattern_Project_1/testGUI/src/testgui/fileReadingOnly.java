/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Hisham Hussein
 */
public class fileReadingOnly {
    
          ArrayList<String> sfotwareNameList = new ArrayList<>();
        fileReadingOnly(){};
      
      public void readFile() throws IOException{
          
          // The name of the file to open.
        String fileName = "wordTest.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            try ( // Always wrap FileReader in BufferedReader.
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while((line = bufferedReader.readLine()) != null) {
                   sfotwareNameList.add(line);
                }
            }         
        }
        catch(FileNotFoundException ex) {
            System.out.println(fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  

        }
    }
    
    
    
    
}
