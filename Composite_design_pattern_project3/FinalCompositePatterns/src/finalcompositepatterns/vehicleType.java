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
public class vehicleType implements Vehicle {

  String vNames;

  public vehicleType(String vNames) {
    this.vNames = vNames;
  }

  public void print(String name) {
    for (int i = 0; i < name.length(); i++)
      System.out.print("   ");
    System.out.println(vNames);
  }
}