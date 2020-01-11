package pl.altkom.ioc;

public class SimpleSignature implements Signature {
    @Override
    public String getValue() {
        return "Simple sigb";
    }

    @Override
    public String toString() {
        return getValue();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
