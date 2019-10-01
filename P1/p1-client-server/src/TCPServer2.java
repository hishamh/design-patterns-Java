/*
    
/*

   Hisham Hussein
   Ibrahim Alzyady
   CIS 427 - Prof. J.P. Baugh
   Fall 2018

    This program suposed to create server and client connection where authroized user
    can use the six commands MSGGET,MSGSTORE,SHUTDOWN,LOGIN,LOGOUT, and QUIT


    Waits any client connections and responds with right commands
   
*/

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TCPServer2 {
    
    //This function will check an act as user login chcker.
    //if the input from the user is matching the authorized username then it will
    //return true if not matching it will return false
   static boolean usrInfo(String name){

    if(name.contains("LOGIN")){
        if(name.contains("root") && name.contains("root01")){
            return true;
        }else if(name.contains("john") && name.contains("john01")){
            return true;
        }else if(name.contains("david") && name.contains("david01")){
            return true;
        }else if(name.contains("mary") && name.contains("mary01")){
            return true;
        }else{
            return false;
        }
    }else return false;
    }
   //this function will do the check if the Commands the user entered is match with this
   static boolean notFoundCommands(String name){
       
       if(name.equalsIgnoreCase("shutdown")){
           return false;
       }else if(name.equalsIgnoreCase("MSGSTORE")){
           return false;
       }else if(name.equalsIgnoreCase("Quit")){
       return false;
       }else if(name.equalsIgnoreCase("Logout")){
       return false;
       }else
           return true;
   }
   
   //this function will the infromaton that typed by user to a file
   static void writeToFile(String message) throws IOException{
       
try{
	  FileWriter fstream = new FileWriter("message.txt",true); //open file
	  BufferedWriter out = new BufferedWriter(fstream);
	  out.write(message+"\n"); //write to a file
	  out.close();
  }catch (Exception e){
	 System.err.println("Error while writing to file: " +
          e.getMessage());
  }
   
  }
     //this function will act as reading information from the file to the arraylist
     //so that we can then copy them to new arraylist to dsiplay users Qute
    static ArrayList readFile() throws IOException{
            ArrayList<String> mMessage = new ArrayList<>();
            BufferedReader br = null;
            br = new BufferedReader(new FileReader("message.txt")); //open file
            String line;
            while((line = br.readLine()) != null){
               
                mMessage.add(line);//reading from file
            } 
            br.close();
    return mMessage;
   }
    
    public static void main(String[] args) throws IOException {
        String clientMessage = "";
        String responseMessage = "";
        final int PORT_NUM = 6789;
         boolean isLogined=false;
         String usrName,usrPassword;
         boolean isChcked=true;
         ArrayList<String> theMessages = new ArrayList<>();
         String convetToString;
         boolean root = false;
         
         //when the server opens first thing will do is reading the file that have
         //meaingful qute
         readFile();//call function to read file
        //copying the infromation the the readFile() to theMessages arraylist for use
        //latter
         for(int i=0;i<readFile().size();i++){
            convetToString = (String) readFile().get(i);
            theMessages.add(convetToString);
      
         }

        try {

            ServerSocket welcomeSocket = 
                    new ServerSocket(PORT_NUM);
            
            //wait on socket for contact by client
            System.out.println("Waiting on client connections...");
            while(true) {
                Socket connectionSocket = 
                        welcomeSocket.accept();
                System.out.println("Received a connection! Yaaay!");
                
                //create input stream, attached to socket
                BufferedReader inputFromClient = 
                        new BufferedReader(
                            new InputStreamReader(
                                connectionSocket.getInputStream()));
              
                //create output stream, attached to socket
                DataOutputStream outputToClient =
                        new DataOutputStream(
                            connectionSocket.getOutputStream());
                
                //obtain input from the client
                //as long as we receive data, process it
                while((clientMessage = inputFromClient.readLine()) != null) {
                    
                    
                     //check if the if the clientMessage is contain MSGGET
                    if(clientMessage.equalsIgnoreCase("MSGGET")) {
                        //reads file again to update the theMessage arraylist to by
                        //dsiplayed
                        readFile();
                        responseMessage = ""+theMessages.get(0)+"\n"; //show the first message in arraylist
                        theMessages.remove(0);//after displaying the message then remove it from arraylist
                        
                        //after deleting the message from arraylist, we will see if the message
                        //in the arraylist is equal to 0 after it it show the quote once. then we
                        //the  when it is empty we read the file again to the arraylist so
                        if(theMessages.size()==0){

                                readFile();//reading file
                                theMessages.clear(); //clear theMessages
                                  for(int i=0;i<readFile().size();i++){
                                    convetToString = (String) readFile().get(i);//copy the message 
                                    theMessages.add(convetToString); //insert the messages
      
                                  }
                        }
   
                    }else if(clientMessage.equalsIgnoreCase("QUIT")){
                                outputToClient.writeBytes("quit!"); 
                                connectionSocket.close();
                                System.exit(0);
                    }
                    //checking if the user is login before using the root commands
                    else if(usrInfo(clientMessage) || isLogined){

                            responseMessage="\n";  
                           
                            if(clientMessage.equalsIgnoreCase("SHUTDOWN")) {
                                outputToClient.writeBytes("shutdown!"); 
                                connectionSocket.close();//close the connection
                                System.exit(0); //exit the program
                            }
                            else if(clientMessage.equalsIgnoreCase("MSGSTORE") || clientMessage.length()>20){
                                //if the user goes to MSGSTORE then the user write his message so the 
                                //messages will be saved if it will be over 10 so ti will dirctly go to 
                                //this if statemnt if it was >10
                                responseMessage ="\n";
                                if(clientMessage.length()>20){//skip if the message is >10
                                writeToFile(clientMessage);//save the message to file
                                responseMessage ="\n";
                                theMessages.clear();//clear the arraylist
                                readFile();//reread the file again so it fill up the arraylist again
                                theMessages.clear();
                                  for(int i=0;i<readFile().size();i++){
                                    convetToString = (String) readFile().get(i);
                                    theMessages.add(convetToString);//adding the message to the arraylist
      
                                  }
                            }
 
                            }else if(clientMessage.equalsIgnoreCase("LOGOUT")) {
                                //if the user write logout it will turn everything to fasle
                                isLogined= false;
                                isChcked = false;
                                root = true;
                                responseMessage = "\n";
                            }
                            else if (isLogined && clientMessage.contains("LOGIN")){
                                //if the user is already loged in but want to try logain again
                                //it will dsiplay message that is loged in alraedy
                                responseMessage = "You already logedin\n";
                              
                            }else if (notFoundCommands(clientMessage)==true && isLogined==true){
                                //if the user is trying toe write unknow commands insdie the login 
                                //this message will show up
                                responseMessage = "300 message format error\n";
                            }
                            else{
                                if(isChcked != false){
                                    isChcked = true;
                                    //if the user is loged for the first time we will create new
                                    //line to indicate that the user is logined in
                                }
                            }
                            //this will check if the user is logined in  becaue if it is 
                            // then is root will stay true to display is loged on
                            //if the user is loged ou it will logout him out and chagne logined 
                            //to false and root will be true insted
                            isChcked= false;
                            if(root == true){
                                isLogined = false;
                                root= false;
                            }else{
                                isLogined = true;
                            }

                       }else if(usrInfo(clientMessage)== false && clientMessage.contains("LOGIN")){
                           //this will validate the user login username and password
                           responseMessage = "410 Wrong UserID or Password\n";
                       }else if(notFoundCommands(clientMessage)==false){
                           //this will validate if the enter if he enterd root commands
                           responseMessage = "401 You are not currently logged in. Log in first\n"; 
                       }
                       else{
                           //display an error if the commands is not found
                            responseMessage = "300 message format error\n"; 
                       }
                    
                    outputToClient.writeBytes(responseMessage); //output to the server            
                }//end inner while
            }//end while
        }
        catch(IOException ex) {
            System.out.println("I/O Exception");
        }
    }//end main
}//end TCPServer