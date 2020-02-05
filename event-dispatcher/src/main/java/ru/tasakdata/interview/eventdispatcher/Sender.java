package ru.tasakdata.interview.eventdispatcher;

public class Sender extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            EventDispatcher.getInstance().send(new Event("Say " + i));
        }
    }
}
