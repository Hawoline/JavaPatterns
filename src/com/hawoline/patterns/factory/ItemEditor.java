package com.hawoline.patterns.factory;

import javax.swing.*;

public interface ItemEditor {
    JComponent getGUI();

    void commitChanges();
}
