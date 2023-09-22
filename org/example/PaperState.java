package org.example;

public class PaperState implements ComputerToolState{
    @Override
    public void displayTool() {
        System.out.println("The computer has chosen Paper");
    }
}
