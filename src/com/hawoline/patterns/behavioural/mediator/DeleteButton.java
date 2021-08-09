package com.hawoline.patterns.behavioural.mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DeleteButton extends JButton implements Component {
    private Mediator mMediator;
    @Override
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mMediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DeleteButton";
    }
}
