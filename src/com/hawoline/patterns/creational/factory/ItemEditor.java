package com.hawoline.patterns.creational.factory;

import javax.swing.*;

public interface ItemEditor {
    JComponent getGUI();

    void commitChanges();
}
