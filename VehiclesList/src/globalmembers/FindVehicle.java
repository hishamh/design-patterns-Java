/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalmembers;

/*
 *
 * @author Gaming Pc
 */
public class FindVehicle
{
	public static void main(String[] args)
	{
				VechicleProcess vechicle; 
                                vechicle = new VechicleProcess("Vehicle");
				
                                vechicle.addingVehicleType("Vehicle", "SUVs"); //function call
				vechicle.addingVehicleType("Vehicle", "Trucks"); //function call
				vechicle.addingVehicleType("Vehicle", "Sedans"); //function call


                                
                                //Suv
                                vechicle.addingVehicleType("SUVs", "2019 Subaru Forester"); //function call
                                vechicle.addingVehicleType("SUVs", "2019 Toyota Highlander Hybrid"); //function call
                                vechicle.addingVehicleType("SUVs", "2019 Mazda CX-5"); //function call
                                vechicle.addingVehicleType("SUVs", "2019 Kia Sportage"); //function call
                                vechicle.addingVehicleType("SUVs", "2019 Hyundai Kona"); //function call
       
                                //SUVs sub compoent 2019 Subaru Forester
                                vechicle.addingVehicleType("2019 Subaru Forester", "Full loaded"); //function call
                                vechicle.addingVehicleType("2019 Subaru Forester", "not loaded"); //function call
                                vechicle.addingVehicleType("2019 Subaru Forester", "Limited edtion"); //function call
                                
                                //Trucks
                                vechicle.addingVehicleType("Trucks", "2019 Honda Ridgeline"); //function call
                                vechicle.addingVehicleType("Trucks", "2019 Chevrolet Colorado"); //function call
                                vechicle.addingVehicleType("Trucks", "2019 Ford F-150"); //function call
   
                                
                                vechicle.addingVehicleType("Sedans", "2019 Honda Accord"); //function call
                                vechicle.addingVehicleType("Sedans", "2019 Toyota Camry"); //function call
                                vechicle.addingVehicleType("Sedans", "2019 Toyota Camry Hybrid"); //function call
                                vechicle.addingVehicleType("Sedans", "2019 Honda Accord Hybrid"); //function call
                                vechicle.addingVehicleType("Sedans", "2019 Hyundai Sonata"); //function call
                                
                                
                                vechicle.addingVehicleType("2019 Honda Accord", "Fully Loaded"); //function call
                                vechicle.addingVehicleType("2019 Honda Accord", "Limited Eduation"); //function call
                                vechicle.addingVehicleType("Fully Loaded", "Navigation, leather seats, sunroof"); //function call
                                vechicle.addingVehicleType("Limited Eduation", "Navigation, leather seats, sunroof  Turbo"); //function call
                                vechicle.print(vechicle.root, 0);
                               // vechicle.privateFire("Navigation, leather seats, sunroof  Turbo");
                                
                                
	}

}