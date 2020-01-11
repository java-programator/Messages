package pl.altkom.ioc;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Modul extends AbstractModule {

    public Modul() {
        System.out.println("Wywołuję konstruktor bezargumentowy");
    }

    @Override
    protected void configure() {
        super.configure();
//        bind(String.class).toInstance("hahaha");
        bind(String.class).annotatedWith(Names.named("to")).toInstance("Paweł");
        bind(String.class).annotatedWith(Names.named("text")).toInstance("Masz w ryj");
        bind(Signature.class).to(SimpleSignature.class);

    }
}
