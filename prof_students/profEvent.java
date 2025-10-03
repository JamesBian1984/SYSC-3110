import java.util.EventObject;

public class profEvent extends EventObject {
    private final java.util.Date date;

    public profEvent(Object source, java.util.Date date) {
        super(source);
        this.date = date;
    }

    public java.util.Date getDate() {
        return date;
    }
}
