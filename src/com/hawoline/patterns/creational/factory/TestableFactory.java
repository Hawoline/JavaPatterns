package com.hawoline.patterns.creational.factory;

import com.hawoline.patterns.Testable;
import com.hawoline.patterns.creational.factory.Contact;
import com.hawoline.patterns.creational.factory.ItemEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestableFactory implements Testable {

    @Override
    public void test() {
        JFrame frame = new JFrame("Test Factory");
        Contact contact = new Contact();
        ItemEditor contactEditor = contact.getEditor();

        JComponent contactFrame = contactEditor.getGUI();
        JButton saveButton = new JButton("Save");
        JButton printContactButton = new JButton("Show Contact");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contactEditor.commitChanges();
            }
        });
        printContactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(contact.toString());
            }
        });

        frame.setBounds(0, 0, 300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(contactFrame);
        frame.add(saveButton);
        frame.add(printContactButton);
        frame.setVisible(true);
    }
}
