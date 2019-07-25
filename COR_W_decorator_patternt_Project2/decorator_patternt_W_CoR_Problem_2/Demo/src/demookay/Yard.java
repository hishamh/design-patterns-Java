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

     public class Yard extends kilometerHandeler
    {
        String getConvType;
        public Yard(String ConvType)
        {
            getConvType = ConvType;
        }
         public double handleRequest(double convertTo)
        {
            if ("YARD".equals(getConvType) )
            {
                return convertTo * 1093.613298;
            }
            else if (successor != null)
            {
                return successor.handleRequest(convertTo);
            }
            else
            {
                return convertTo;
            }
        }
    }

