package ru.tasakdata.interview.eventdispatcher;

public class Application {
    public static void main(String[] args) {
        new Registrator().start();
        new Sender().start();
    }

}
