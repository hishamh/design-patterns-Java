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
public class showConvertorToName extends decorator {

         String getNameOfConverter;
        mileYardFootConverter convertedValue;
        public showConvertorToName(mileYardFootConverter sendConv,String getNameConv)
        {
            this.getNameOfConverter = getNameConv;
            this.convertedValue = sendConv;
            
        }
        
        
        
        
         @Override
    public String valueChangeTypeTo() {
            getConverterTypeNameDesc = convertedValue.valueChangeTypeTo();
            if ("MILE".equals(getNameOfConverter))
            {
                getConverterTypeNameDesc = getConverterTypeNameDesc + " Mile";
            }
            else if ("FOOT".equals(getNameOfConverter))
            {
                getConverterTypeNameDesc = getConverterTypeNameDesc + " Foot";
            }
            else if ("YARD".equals(getNameOfConverter))
            {
                getConverterTypeNameDesc = getConverterTypeNameDesc + " Yard";
            }
            return getConverterTypeNameDesc;
    }
 
    
    
}
