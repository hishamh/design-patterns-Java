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
public class Mile extends kilometerHandeler
    {
        String getConvType;
        public Mile( String ConvType)
        {
            getConvType = ConvType;
            
        }
         public double handleRequest(double convertTo)
        {
            if ("MILE".equals(getConvType) )
            {
                return convertTo * 0.621371;
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
