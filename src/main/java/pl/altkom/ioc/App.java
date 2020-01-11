package pl.altkom.ioc;


import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Modul());
        Message m = injector.getInstance(Message.class);
        System.out.println(m);
        Signature s1 = injector.getInstance(Signature.class);
        System.out.println(s1.toString());
        Signature s2 = injector.getInstance(Signature.class);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(m.getSignature()));
    }
}
