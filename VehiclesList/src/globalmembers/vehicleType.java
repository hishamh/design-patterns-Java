package globalmembers;
import java.util.ArrayList;
import java.util.Vector;

/*main.cpp


  Created by Hisham on 1/12/19.
  Copyright © 2018 Hisham Hussein. All rights reserved.
*/


public class vehicleType
{ //struct that holds string name for the vechiclees and vector of namseInclude that holdes the newVechicleType
	 String name;
         String avalbiltiy; 
	 ArrayList<vehicleType> namesInclude = new ArrayList<>();   //holdes newVechicleType
	 vehicleType next; //pointed to the next child or as parent child
}