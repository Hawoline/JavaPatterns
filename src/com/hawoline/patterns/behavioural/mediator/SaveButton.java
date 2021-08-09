package com.hawoline.patterns.behavioural.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveButton extends JButton implements Component {
    private Mediator mMediator;

    public SaveButton(String text) {
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mMediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
