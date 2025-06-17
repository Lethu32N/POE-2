/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.quickchat.messagereader;

/**
 *
 * @author RC_Student_lab
 */
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MessageReader {
        public static ArrayList<String> loadStoredMessages() {
        ArrayList<String> storedMessages = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("messages.json")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                storedMessages.add(obj.get("Message").toString());
            }
        } catch (Exception e) {
            System.out.println("Error reading JSON: " + e.getMessage());
        }

        return storedMessages;
    }
}
