/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.quickchat.messagehandler.java;

/**
 *
 * @author RC_Student_lab
 */


import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;

public class MessageHandler {

    public static void storeMessageToJSON(Message msg) {
        JSONObject obj = new JSONObject();
        obj.put("Recipient", msg.Recipient());
        obj.put("Message", msg.Message());

            file.write(obj.toJSONString());
            file.Write("writer");
        
        }    
    }




    
    
    

