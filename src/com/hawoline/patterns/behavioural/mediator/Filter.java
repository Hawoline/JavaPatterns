package com.hawoline.patterns.behavioural.mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {
    private Mediator mMediator;
    private ListModel mListModel;

    @Override
    public void setMediator(Mediator mediator) {
        mMediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent e) {
        String start = getText();
        searchElements(start);
    }

    private void searchElements(String start) {
        if (mListModel == null) {
            return;
        }

        if (start.equals("")) {
            mMediator.setElementsList(mListModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < mListModel.getSize(); i++) {
            notes.add((Note) mListModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().contains(start)) {
                listModel.addElement(note);
            }
        }
        mMediator.setElementsList(listModel);
    }

    public void setList(ListModel listModel) {
        mListModel = listModel;
    }

    @Override
    public String getName() {
        return "Filter";
    }
}
