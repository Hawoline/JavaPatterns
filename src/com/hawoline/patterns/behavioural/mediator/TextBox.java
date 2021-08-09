package com.hawoline.patterns.behavioural.mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class TextBox extends JTextArea implements Component {
    Mediator mMediator;

    @Override
    public void setMediator(Mediator mediator) {
    mMediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent e) {
        mMediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
