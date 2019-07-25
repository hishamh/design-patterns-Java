/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcompositepatterns;

/**
 *
 * @author Hisham Hussein
 */
public class FinalCompositePatterns {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
   // Initialize four products
   
    vehicleType SUV1 = new vehicleType("2019 Subaru Forester");
    vehicleType SUV2 = new vehicleType("2019 Toyota Highlander Hybrid");
    vehicleType SUV3 = new vehicleType("2019 Mazda CX-5");
    vehicleType SUV2017One = new vehicleType("2017 Subaru Forester");
    vehicleType SUV2017Tw0= new vehicleType("2017 Toyota Highlander Hybrid");
    
    vehicleType Truck1 = new vehicleType("2019 Subaru Forester");
    vehicleType Truck2 = new vehicleType("2019 Toyota Highlander Hybrid");
    
    vehicleType Sedans1 = new vehicleType("2019 Honda Accord");
    vehicleType Sedans2 = new vehicleType("2019 Toyota Camry");
    
    // Initialize 5 storage
    Storage area = new Storage("Area");
    Storage SUV = new Storage("SUV");
    Storage SUVOf2017 = new Storage("2017 Model storage");
    Storage Truck = new Storage("Trucks");
    Storage Sedan = new Storage("Sudans");
    
    SUV.add(SUV1);
    SUV.add(SUV2);
    SUV.add(SUV3);
    SUVOf2017.add(SUV2017One);
    SUVOf2017.add(SUV2017Tw0);
    SUV.add(SUVOf2017);
    
    Truck.add(Truck1);
    Truck.add(Truck2);
    
    Sedan.add(Sedans1);
    Sedan.add(Sedans2);
    
    area.add(SUV);
    area.add(Truck);
    area.add(Sedan);
    
    area.print("");
 
    }
    
}
