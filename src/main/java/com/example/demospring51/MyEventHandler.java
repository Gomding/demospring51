package com.example.demospring51;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    public void handle(MyEvent myEvent) {
        System.out.println("이벤트 받았다. 데이터는 " + myEvent.getData());
    }
}
