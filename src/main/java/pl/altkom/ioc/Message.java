package pl.altkom.ioc;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.Objects;

public class Message {
    @Inject
    @Named("to")
    private String to;
    @Inject
    @Named("text")
    private String text;
    @Inject
    private Signature signature;

    public Message() {
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", text='" + text + '\'' +
                ", signature=" + signature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(to, message.to) &&
                Objects.equals(text, message.text) &&
                Objects.equals(signature, message.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, text, signature);
    }
}
