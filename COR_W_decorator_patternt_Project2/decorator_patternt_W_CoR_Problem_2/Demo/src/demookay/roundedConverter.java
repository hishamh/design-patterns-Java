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
public class roundedConverter extends decorator{

   
   mileYardFootConverter getConveType;
    public roundedConverter(mileYardFootConverter getConveType){
        this.getConveType =  getConveType;
    }
    @Override
    public String valueChangeTypeTo() {
            getConverterTypeNameDesc = getConveType.valueChangeTypeTo();
            double convertIt = Math.round(Double.parseDouble(getConverterTypeNameDesc) * 1000) / 1000.0;
            System.out.println(convertIt);
            getConverterTypeNameDesc = String.valueOf(convertIt);
            return getConverterTypeNameDesc;
    }
}
