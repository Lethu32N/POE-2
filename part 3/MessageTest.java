/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.quickchat.messagetest;

/**
 *
 * @author RC_Student_lab
 */
import java.util.ArrayList;

public class MessageTest {

    public void testStoreAndReadJSON() {
        Message msg = new Message("+27838884567", "Where are you?");
        MessageHandler.storeMessageToJSON(msg);

        ArrayList<String> messages = MessageReader.loadStoredMessages();
        assertTrue(messages.contains("Where are you?"));
    }

    private void assertTrue(boolean contains) {
        throw new UnsupportedOperationException("Not supported yet.");     
    }
}



