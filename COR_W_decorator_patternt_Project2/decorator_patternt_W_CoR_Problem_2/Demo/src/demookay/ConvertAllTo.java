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
public class ConvertAllTo extends mileYardFootConverter {
      public ConvertAllTo( String m )
        {
            getConverterTypeNameDesc = m;
        }

        public  String valueChangeTypeTo()
        {
            return getConverterTypeNameDesc;
        }
}
