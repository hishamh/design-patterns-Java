/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammerisaccepted;

/**
 *
 * @author Hisham
 */
import java.io.BufferedWriter;
import java.io.File;
import java.util.Stack;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;



public class GrammerIsAccepted {
    private int user_input_location=-1;
    public String inClassInput=""; 
    Stack <String> convert_userInputPrint=new Stack<String>();
    Stack <String>topPrint=new Stack<String>();
    Stack <String>acceptedPrint=new Stack<String>();
    Stack <String> memory_stack=new Stack<String>();
    int onlyOnce=0;
    String [] non_the_terminals={"Q","E","K","T","H","F"};
    String [] the_terminals={"i","+","*","(",")","$"};
    
    //THis is the grammer rule table
    String [][] table=
    {
        {"E$",null,null,"E$",null,null},
        {"TK",null,null,"TK",null,""}   ,
        {null,"+TK",null,null,"",""} ,
        {"FH",null,null,"FH",null,null}  ,
        {null,"","*FH",null,"",""}  ,
        {"i",null,null,"(E)",null,null}
    };
    
    
    
    
    public static void main(String[] args) {
        //this is the input from the user that will check if accept by the grammer table
        GrammerIsAccepted parser=new GrammerIsAccepted("(i+i)*i$");
        parser.delete();//delete File without repating it
        parser.findSolution();
        
       
    }
    private String get_user_input() {
    //this will convert the string into characters
    user_input_location++;
    char ch=inClassInput.charAt(user_input_location);
    String str=String.valueOf(ch);
    return str;
}

public GrammerIsAccepted(String word)//copy constructor
{
    inClassInput=word;
}
private boolean nonTerminalCheck(String top) {
    //this will check if the if the top of the stack is equal to non terminall
    //if it is equal then it will assign it as true and the other function should 
    //get true or fasle if it equal or not equal 
        for(int i=0;i<non_the_terminals.length;i++){
            if(top.equals(non_the_terminals[i])){
                return true;
            }
        }
    return false;
}
//findSolution
public void findSolution(){
    //this is where the calculation happens
    
    memory_stack.push(inClassInput.charAt(0)+"");//oush the first letter from user input to the stack
    memory_stack.push("Q");//we alwasy start with this
    String top=null;
    String convert_userInput=get_user_input();//reread the user input again after it begin removed 
    boolean isFirst=false;
    do
    {
        top=memory_stack.pop(); //remove the first charcters in the stack
        if(nonTerminalCheck(top)){
            //checking if non tmrinal is equal to the top that we removed from memory stack
            //checking if it accept by grammer table
            String accepted=isAcceptedByGrammerTalbe(top, convert_userInput);
                //after it accepted by the table then we need to change the values inside the table
              for(int i=accepted.length()-1;i>=0;i--){
                 char ch=accepted.charAt(i);
                 String str=String.valueOf(ch); //get the charters of userinput and
                 memory_stack.push(str); //inset it to the memroy stack
                }

            isFirst=true;
            printOut(isFirst,accepted,convert_userInput,top,accepted);//output the rresult to afile

        }
        else{ 
                //if non temrinal are not equal then we have to check trminal
                //chking if terminal values are equal to top pop value 
                isFirst=false;
                for(int i=0;i<the_terminals.length;i++){
                    if(top.equals(the_terminals[i])){
                           printOut(isFirst,null,convert_userInput,null,null);
                           convert_userInput =get_user_input(); //now we have to read userinput again after update
                    }           
                }

        }
        //user will exit after the value ends with $
    }while(!convert_userInput.equals("$"));
    
}

public String isAcceptedByGrammerTalbe(String nonTrminal,String terminals){
       //this function will check if the grammer rule table
       //so it will take nontrminal and tmrinals values 
    int i, nonIndex,terminalIndex;
        //loop thorugh the non temrinal values and check if top and user charters are equal if they are the break
       for( i=0;i<non_the_terminals.length;i++){
            if(nonTrminal.equals(non_the_terminals[i])){//top is equal to user charters then it breks
                break; 
            }
        }
       nonIndex = i;
       
       int j;
       //loop thorugh the non temrinal values and check if top and user charters are equal if they are the break
        for( j=0;j<the_terminals.length;j++){     
            if(terminals.equals(the_terminals[j])){//top is equal to user charters then it breks
               break; 
            }
        }
            terminalIndex=j;

    String accepted=table[nonIndex][terminalIndex]; //send the location of founded of found termional and nontemal location
    //which will gave us the table locatoin charcters
    return accepted;
}


public void printOut(boolean isFirst,String accepted,String convert_userInput,String top,String accept2){

    
    //this function will only print to the file only
    try{
        
	  FileWriter fstream = new FileWriter("OUTPUT.txt",true);//open File
	  BufferedWriter out = new BufferedWriter(fstream); //wrtie to file
                
          //the if statemnt will print one time
          
                if(onlyOnce==0){
                    out.write("Stack\t\tINPUT\t\tAction\n");//output to a file
                    System.out.println("Stack\t\tINPUT\t\tAction");//output to a file
                    onlyOnce=1;
                }
                    //checking if it still in the first if statent or seecond statemnt in function of solution
                if(isFirst){ 
                    System.out.println(accepted+"\t\t"+convert_userInput+"\t\toutput: "+top+" -> "+accept2+"");
                    out.write(accepted+"\t\t"+convert_userInput+"\t\toutput: "+top+" -> "+accept2+""+"\n"); //output to file
                }else{
                     System.out.println(convert_userInput+"\t\t"+convert_userInput+"\t\tMatching: "+convert_userInput+" "); //output t a fitle
                     out.write(convert_userInput+"\t\t"+convert_userInput+"\t\tMatching: "+convert_userInput+" "+"\n"); //output t a fitle
                 } 

	  out.close();
  }catch (Exception e){
	 System.err.println("Error while writing to file: " +
          e.getMessage());
  }
  }

public void delete(){
    
    File file = new File("OUTPUT.txt"); 
          
        file.delete(); 
 
}
}