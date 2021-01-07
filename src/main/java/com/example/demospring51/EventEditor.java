package com.example.demospring51;

import java.beans.PropertyEditorSupport;

//쓰레드 세이프하지 않기 때문에 싱글톤 빈으로 등록해서 쓰면 큰일남
public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event event = (Event)getValue();
        return event.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
