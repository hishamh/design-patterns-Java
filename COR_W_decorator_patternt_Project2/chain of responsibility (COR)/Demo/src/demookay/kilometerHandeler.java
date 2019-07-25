/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demookay;

/**
 *
 * @author Hisham Hussein
 */
public abstract class kilometerHandeler
    {
        public kilometerHandeler successor;
        public double convertedValue;
        public void SetSuccessor( kilometerHandeler successor )
        {
            this.successor = successor;
        }

        public abstract double handleRequest(double successorValue);
    }