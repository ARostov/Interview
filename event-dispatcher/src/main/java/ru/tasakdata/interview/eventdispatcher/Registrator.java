package ru.tasakdata.interview.eventdispatcher;

public class Registrator extends Thread {
    @Override
    public void run() {
        EventDispatcher.getInstance().add(new Listener() {
            @Override
            public void send(Event event) {
                System.out.println(event.getMessage());
            }
        });
    }
}
