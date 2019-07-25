package demookay;


import demookay.convertDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hisham Hussein
 */
  public class Foot extends kilometerHandeler
    {
        String getConvType;
        public Foot( String ConvType)
        {
            getConvType = ConvType;
        }
         public double handleRequest(double convertTo)
        {
            if ("FOOT".equals(getConvType) )
            {
                return convertTo * 3280.84;
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
