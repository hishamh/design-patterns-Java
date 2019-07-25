/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcompositepatterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hisham Hussein
 */
public class Storage implements Vehicle {

  String names;

  private List items = new ArrayList();

  public Storage(String names) {
    this.names = names;
  }

  public void print(String name) {
    for (int i = 0; i < name.length(); i++)
      System.out.print("   ");
    System.out.println(names);
  for (Object includedFile : items) {
            // Leverage the "lowest common denominator"
            Vehicle obj = (Vehicle) includedFile;
            obj.print(name+1);
        }
  }

  public void add(Vehicle item) {
    items.add(item);
  }

  public void remove(Vehicle item) {
    items.remove(item);
  }
}