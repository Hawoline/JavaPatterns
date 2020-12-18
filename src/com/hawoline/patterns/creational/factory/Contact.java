package com.hawoline.patterns.creational.factory;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Contact implements Serializable, Editable {
    private String name;
    private String relationship;

    @Override
    public ItemEditor getEditor() {
        return new ContactEditor();
    }

    private class ContactEditor implements ItemEditor {
        private JPanel panel;
        private JTextField nameField;
        private JTextField relationField;

        @Override
        public JComponent getGUI() {
            if (panel == null) {
                panel = new JPanel();
                nameField = new JTextField(name);
                relationField = new JTextField(relationship);
                panel.setLayout(new GridLayout(2, 2));
                panel.add(new JLabel("Name:"));
                panel.add(nameField);
                panel.add(new JLabel("Relationship:"));
                panel.add(relationField);
            } else {
                nameField.setText(name);
                relationField.setText(relationship);
            }

            return panel;
        }

        @Override
        public void commitChanges() {
            if (panel != null) {
                name = nameField.getText();
                relationship = relationField.getText();
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getRelationship() {
        return relationship;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", relationship='" + relationship + '\'' +
                '}';
    }
}
