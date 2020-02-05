package ru.tasakdata.interview.eventdispatcher;

import java.util.ArrayList;

public class EventDispatcher {
    public static EventDispatcher instance;

    private final ArrayList<Listener> listeners = new ArrayList<>();

    public static EventDispatcher getInstance() {
        if (instance == null) {
            synchronized (EventDispatcher.class) {
                instance = new EventDispatcher();
            }
        }
        return instance;
    }

    public void add(Listener listener) {
        listeners.add(listener);
    }

    public void send(Event event) {
        for (Listener listener : listeners) {
            listener.send(event);
        }
    }
}
