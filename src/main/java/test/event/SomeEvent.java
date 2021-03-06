package test.event;

import org.springframework.context.ApplicationEvent;

public class SomeEvent extends ApplicationEvent {

    private String message;

    public SomeEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
