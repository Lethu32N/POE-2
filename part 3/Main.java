/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.quickchat.classmain;

/**
 *
 * @author RC_Student_lab
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
  
        Message msg = new Message("+27834557896", "Did you get the cake?");
        MessageHandler.storeMessageToJSON(msg);

 
        ArrayList<String> messages = MessageReader.loadStoredMessages();
        System.out.println("Stored Messages:");
        for (String m : messages) {
            System.out.println("- " + m);
        }
    }
}
    

