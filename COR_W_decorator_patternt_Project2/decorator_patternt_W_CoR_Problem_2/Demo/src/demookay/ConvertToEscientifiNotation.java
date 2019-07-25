/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demookay;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConvertToEscientifiNotation extends decorator {
     mileYardFootConverter getConveType;
    public ConvertToEscientifiNotation(mileYardFootConverter getConveType){
        this.getConveType =  getConveType;
    }
    
    @Override
    public String valueChangeTypeTo() {
         NumberFormat formatter = new DecimalFormat();
            getConverterTypeNameDesc = getConveType.valueChangeTypeTo();
            double d = Double.parseDouble(getConverterTypeNameDesc);
            getConverterTypeNameDesc = String.valueOf(d);
            formatter = new DecimalFormat("0.####E0");
            getConverterTypeNameDesc = String.valueOf(formatter.format(d));
            return getConverterTypeNameDesc;
    }
    
}



