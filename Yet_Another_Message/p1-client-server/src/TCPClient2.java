
/*

   Hisham Hussein
   Ibrahim Alzyady
   CIS 427 - Prof. J.P. Baugh
   Fall 2018

    This program suposed to create server and client connection where authroized user
    can use the six commands MSGGET,MSGSTORE,SHUTDOWN,LOGIN,LOGOUT, and QUIT
    to be sent from this client to the server

*/

import java.util.Scanner;
import java.io.*;
import java.net.*;

public class TCPClient2 {
    static void help(){
        //user menue to explaing for the user
        System.out.println("These are the commands that allowed in the program\n");
        System.out.println("    MSGGET      - shows the message of the day\n");
        System.out.println("    MSGSTORE    - Store message of the day in file\n");
        System.out.println("    SHUTDOWN    - shutdown the server with the client connection\n");
        System.out.println("    LOGIN       - Lets you login to have root access (LOGIN username password)\n");
        System.out.println("    LOGOUT      - log you out from the root access to normal user\n");
        System.out.println("    QUIT        - Close connection \n");
        
    }
    
    public static void main(String[] args) {
        String sentence;
        String responseFromServer;
        final int PORT_NUM = 6789;
        //possible error user will resive from the server
        String errorS="300 message format error";
        String errorS2="401 You are not currently logged in. Log in first";
        String errorS3 ="410 Wrong UserID or Password";

        Scanner keyboard = new Scanner(System.in);
        
        try {
            //create client socket and connect to server
            Socket clientSocket = 
                    new Socket("localhost", PORT_NUM);
            
            //create output stream attached to the socket
            DataOutputStream outputToServer =
                    new DataOutputStream(
                            clientSocket.getOutputStream());
        
            
            //create input stream attached to socket
            BufferedReader inputFromServer = 
                    new BufferedReader(
                        new InputStreamReader(
                            clientSocket.getInputStream()));
            
            // prompt for input from user to send 
            // to the server
            System.out.print("C:  ");
            
            sentence = keyboard.nextLine();
            
            while(true) {
             if("help".equals(sentence)){
                 help();//will dsiplay the help emnue for the user
                 System.out.print("C:  ");
                sentence = keyboard.nextLine();
             }else{
                 //user commands will be sent to the server and the server will do the job
                outputToServer.writeBytes(sentence + '\n');
                 //this will be the respons from the user after he entered a commands
                responseFromServer = inputFromServer.readLine();

                if(responseFromServer.equalsIgnoreCase("shutdown!") || responseFromServer.equalsIgnoreCase("quit!")) {
                    //this will shutdown the server  and connection and clcient 
                    System.out.println("S:  200 OK\n");
                    clientSocket.close();
                    System.exit(0);
                }//end if
                
               
                //this will display the C: if it does not match the error we reseve from the server then
                //it will go to the else statemnt to display S:200
                if((responseFromServer.contains(errorS) ||responseFromServer.contains(errorS2)) || (responseFromServer.contains(errorS3)) ){
                System.out.println(responseFromServer);
                }else{
                    System.out.println("S:  200 OK \n" + responseFromServer);
                    
                    
                    
                }
                // Go for another round....
                // prompt for input from user to send 
                // to the server
                System.out.print("C:  ");
               // System.out.print("Type QUIT to QUIT:  \t");
                sentence = keyboard.nextLine();
             }
            }//end while
            
            
            //clientSocket.close(); 
            
        }
        catch(UnknownHostException ex) {
            System.out.println("Host unknown");
        }
        catch(IOException ex) {
            System.out.println("IO Exception");
        }
        
    }//end main
}//end TCPClient