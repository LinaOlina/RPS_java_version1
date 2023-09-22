package org.example.States;

import org.example.classes.ComputerTool;

public interface ToolState {

    void displayTool();

    void updateState(ComputerTool computerTool);
}
