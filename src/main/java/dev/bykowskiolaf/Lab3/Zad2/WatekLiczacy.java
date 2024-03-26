package dev.bykowskiolaf.Lab3.Zad2;

public class WatekLiczacy extends Thread {
    private final LicznikWatkow licznikWatkow;
    private final int count;

    public WatekLiczacy(String name, LicznikWatkow licznikWatkow, int count) {
        super(name);
        this.licznikWatkow = licznikWatkow;
        this.count = count;
        start();
    }

    public void run() {
        int wynik = 0;
        for (int i = 0; i < count; i++) {
            wynik = licznikWatkow.policzMnie();
            if (wynik != 0) break;
        }

        System.out.println(STR."\{Thread.currentThread().getName()} konczy z wynikiem \{wynik}");
    }
}