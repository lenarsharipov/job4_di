package ru.job4j.di;

public class StartUI {

    private final Store store;
    private final ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

    public void add(String value) {
        store.add(value);
    }

    public void ask(String question) {
        consoleInput.askStr(question);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}