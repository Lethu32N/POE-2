/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.quickchat.datamodel;

/**
 *
 * @author RC_Student_lab
*/ 
public class DataModel {
    public class Message {

  
      private final String recipient;
      private final String message;

    public Message(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}

        
        
    
}
