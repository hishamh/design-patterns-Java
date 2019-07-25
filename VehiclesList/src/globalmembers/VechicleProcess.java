package globalmembers;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hisham Hussein
 */
public class VechicleProcess
{
    public vehicleType root = null;

	public void addingVehicleType(String vechicle,String vechicleType)
	{
  
		vehicleType isFoundRoot = findVechicle(root, vechicle); //it search inside the root if it has the vechicle name

		if (isFoundRoot != null)
		{ 
                        Random rand = new Random();
                        int n = rand.nextInt(10) + 1;
                        

                        //if the root has something then it will run the if statemtn
			vehicleType newVechicleType = new vehicleType(); //create new pointer of vehicleType O(1)
			newVechicleType.name = vechicleType; //assiging newVechicleType name inside the newVechicleType root name O(n)
                        newVechicleType.avalbiltiy = Integer.toString(n);
			isFoundRoot.namesInclude.add(newVechicleType); //pushing the newVechicleType infomation and child to the root
			newVechicleType.next = isFoundRoot; //go to the next object
		}
	}

	public vehicleType findVechicle(vehicleType ptr, String target)
	{
		vehicleType findingResult;

		if (ptr == null)
		{ //check if ptr is nullptr empty
			return null;
		}
		else if (ptr.name.equals(target))
		{ //if ptr name is same as the target name then return root ptr
			return ptr;
		}
		else
		{
			//the loop will keep loops on the namesInclude vector recursively to find the target name on the vectors
			for (int i = 0; i < ptr.namesInclude.size();i++)
			{
				findingResult = findVechicle((vehicleType) ptr.namesInclude.get(i), target);
				if (findingResult != null)
				{ //it will only return non nullptr result which they have all the names
					return findingResult;
				}
			}

			return null;
		}
	}

	public void print(vehicleType ptr, int treeDeepth)
	{
                boolean once = true;
		for (int i = 0; i < treeDeepth;i++)
		{ //print the depth of the tree
                      //System.out.print(" ");
                        
                      if(treeDeepth == 1){
                          System.out.print(" *");
                          System.out.print("↓");
                          System.out.print("→");
                          
                      }
                     else if(treeDeepth == 2){
                          System.out.print("");
                            if(once == true){
                             System.out.print("    ↓");
                          System.out.print("→");
                                once = false;
                            }
                      }else if(treeDeepth == 3){
                           if(once == true){
                            System.out.print("       ↓");    
                            System.out.print("→");
                                once = false;
                            }
                      }else if(treeDeepth == 4){
                           if(once == true){
                            System.out.print("         ↓");    
                            System.out.print("→");
                                once = false;
                            }
                          
                      }
	
                        
		}

		System.out.print(ptr.name + " " + "("+ptr.avalbiltiy +")");
                System.out.print("\n");
                
		for (int i = 0; i < ptr.namesInclude.size();i++)
		{
			 print((vehicleType) ptr.namesInclude.get(i), treeDeepth + 1);
		}
	}

	public VechicleProcess(String vechicle)
	{ //constructor that will only runes onces so that it can create the president
		root = new vehicleType(); //create new node
		root.name = vechicle; //assign the new node a vechicle
	}

}
