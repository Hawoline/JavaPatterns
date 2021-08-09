package com.hawoline.patterns.behavioural.command;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.textField.getText().isEmpty()) return false;

        backup();
        String source = editor.textField.getText();
        editor.clipboard = editor.textField.getSelectedText();
        editor.textField.setText(cutString(source));
        return false;
    }

    private String cutString(String source) {
        String start = source.substring(0, editor.textField.getSelectionEnd());
        String end = source.substring(editor.textField.getSelectionEnd());
        return start + end;
    }
}
