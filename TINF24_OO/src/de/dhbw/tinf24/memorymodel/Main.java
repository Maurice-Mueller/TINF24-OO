package de.dhbw.tinf24.memorymodel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  private static int LIMIT = 10_000;
  private static Object lock = new Object();

  static void main() throws InterruptedException {
    Zähler zähler = new Zähler();

    Thread thread1 = erstelleThread("Thread 1", zähler);
    Thread thread2 = erstelleThread("Thread 2", zähler);

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Zählerstand nach Threads: " + zähler.stand());
  }

  static Thread erstelleThread(String name, Zähler zähler) {
    return new Thread(() -> {
      AtomicInteger anzahlDerInkrementierungen = new AtomicInteger(0);
      List<Integer> historie = new ArrayList<>();
      while (true) {
        int aktuellerStand = zähler.erhöheUmEinsUndGibAktuellenStandZurück(
            LIMIT,
            anzahlDerInkrementierungen
        );
        if (!historie.isEmpty() && historie.getLast() > aktuellerStand) {
          System.out.println(name + " !! " + historie.getLast() + " > " + aktuellerStand + " !! ");
        }
        historie.add(aktuellerStand);
        if (aktuellerStand >= LIMIT) {
          System.out.println(name + " Aufrufe: " + anzahlDerInkrementierungen.get());
            System.out.println(name + " Historie: " + historie);
          return;
        }
      }
    }, name);
  }
}
