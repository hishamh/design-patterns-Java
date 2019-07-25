/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgui;

/**
 *
 * @author Hisham Hussein   
 */
public class word10Factory extends Factory {
    //This method will return new word10 test that will shows the testing panel,buttons, textBox
        @Override
    public TestGUIElements getElements() {
       return new word10();
    }
}
