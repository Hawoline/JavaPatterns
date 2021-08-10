package com.hawoline.patterns.behavioural.mediator;


import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {
    private Mediator mMediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mMediator = mediator;
    }


    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mMediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
