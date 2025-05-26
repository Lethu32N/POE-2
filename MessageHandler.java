/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.quickchat.messagehandler;

/**
 *
 * @author RC_Student_lab
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MessageHandler {
public static void main(String[] args) {

import java.io.IOException;
import java.util.*;
public class MessageHandler {

    private static void handleMessages(int numMessages) {
        throw new UnsupportedOperationException("Not supported yet.");
        }

    private static class e {

        public e() {
        }
    }
public class Login {
    public static boolean isLoggedIn = false;

    public static boolean loginUser(String username, String password) {
        
        if (username.equals("admin") && password.equals("admin")) {
            isLoggedIn = true;
        }
        return isLoggedIn;
    }

public class Registration {
    public static boolean registerUser(String username, String password) {
        
        return true;
    }
}

public class Message {
    private static int messageCount = 0;
    private static List<Message> sentMessages = new ArrayList<>();
    private String messageID;
    private int messageNumber;
    private String recipient;
    private String content;
    private String messageHash;

    public Message(String recipient, String content) {
        this.messageID = generateMessageID();
        this.messageNumber = ++messageCount;
        this.recipient = recipient;
        this.content = content;
        this.messageHash = createMessageHash();
    }

    private String generateMessageID() {
        return String.valueOf(new Random().nextInt(900000000) + 1000000000);
    }

    public boolean checkMessageID() {
        return this.messageID.length() == 10;
    }

    public boolean checkRecipientCell() {
        return recipient.startsWith("+") && recipient.length() <= 10;
    }

    public boolean validateMessageLength() {
        return content.length() <= 250;
    }

    public String createMessageHash() {
        String[] words = content.split(" ");
        String first = words[0];
        String last = words[words.length - 1];
        return (messageID.substring(0, 2) + ":" + messageNumber + ":" + first + last).toUpperCase();
    }

    public String sentMessage() {
        String[] options = {"Send Message", "Disregard Message", "Store Message"};
        int choice = javax.swing.JOptionPane.showOptionDialog(null, "Choose an action:",
                "Message Action", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        switch (choice) {
            case 0:
                sentMessages.add(this);
                javax.swing.JOptionPane.showMessageDialog(null, printMessage());
                return "Message successfully sent.";
            case 1:
                return "Press 0 to delete message.";
            case 2:
                storeMessage();
                return "Message successfully stored.";
            default:
                return "No action taken.";
        }
    }

    public String printMessage() {
        return "Message ID: " + messageID +
                "Message Hash: " + messageHash +
                "Recipient: " + recipient +
                "Message: " + content;
    }

    public static String printMessages() {
        StringBuilder sb = new StringBuilder();
        for (Message msg : sentMessages) {
            sb.append(msg.printMessage()).append(":");
        }
        return sb.toString();
    }

    public static int returnTotalMessages() {
        return sentMessages.size();
    }

    public void storeMessage() {
        JSONObject msgDetails = new JSONObject();
        msgDetails.put("Message ID", messageID);
        msgDetails.put("Message Hash", messageHash);
        msgDetails.put("Recipient", recipient);
        msgDetails.put("Message", content);

        JSONArray messageArray = new JSONArray();
        messageArray.add(msgDetails);

       try (FileWriter file = new FileWriter("stored_messages.json", true)) {
            file.write(messageArray.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void handleMessages(int numMessages) {
        for (int i = 0; i < numMessages; i++) {
            String recipient = JOptionPane.showInputDialog("Enter recipient number:");
            String content = JOptionPane.showInputDialog("Enter your message:");


            if (!msg.checkRecipientCell()) {
                JOptionPane.showMessageDialog(null, "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.");
                i--; continue;
            }

            if (!msg.validateMessageLength()) {
                JOptionPane.showMessageDialog(null, "Message exceeds 250 characters by " + (content.length() - 250) + ", please reduce size.");
                i--; continue;
            }

            JOptionPane.showMessageDialog(null, "Message ready to send.");
            JOptionPane.showMessageDialog( Messsage.sentMessage());
        
        JOptionPane.showMessageDialog(null, "Total messages sent: " + Message.returnTotalMessages());
    }
}



public class QuickChatApp {
    public static void main(String[] args) {
         String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        if (!Login.loginUser(username, password)) {
            JOptionPane.showMessageDialog(null, "Login failed. Exiting application.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Welcome to QuickChat.");
        int numMessages = Integer.parseInt(JOptionPane.showInputDialog("How many messages do you want to send?"));

        while (true) {
            String menu = JOptionPane.showInputDialog("Select an option Send Message. Show Recently Sent Messages. Quit");
            switch (menu) {
                case "1":
                    MessageHandler.handleMessages(numMessages);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Coming Soon.");
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option, please choose again.");
            
        }
    }
}
public void storeMessage(String recipient) throws IOException {


    JSONObject messageObject = new JSONObject();
        String messageID = null;
    messageObject.put("Message ID", messageID);
        String messageHash = null;
    messageObject.put("Message Hash", messageHash);
    messageObject.put("Recipient", recipient);
        String content = null;
    messageObject.put("Message", content);
    
     JSONArray messageArray = new JSONArray();
    messageArray.add(messageObject);

  try (FileWriter file = new FileWriter("stored_messages.json", true)) {
        file.write(messageArray.toJSONString());
        file.write(System.lineSeparator()); 
        System.out.println("Message successfully stored in JSON.");
        
     }
}

        
    }
}
