package edu.cpp.cs585.mini_twitter_gui;

import javax.swing.JOptionPane;



public class InfoDialogBox {

    /**
     * Create the message dialog box with specified title and message.
     */
    public InfoDialogBox(String title, String message, int messageType) {
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }

}
