package lv.sbogdano.javaguru.todolist;


import lv.sbogdano.javaguru.todolist.console.ConsoleUI;

public class ToDoListApplication {

    public static void main(String[] args) {
        var consoleUI = new ConsoleUI();
        consoleUI.start();
    }
}
